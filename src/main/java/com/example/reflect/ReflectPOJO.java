package com.example.reflect;

import org.json.JSONException;
import org.json.JSONObject;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectPOJO {

    public static String getObjectJSONString(Object instance) throws IntrospectionException, InvocationTargetException, IllegalAccessException, JSONException {
        Class instanceClass = instance.getClass();
        JSONObject jsonObject = new JSONObject();
        Field[] fields = instanceClass.getDeclaredFields();
        for(Field i : fields){
            String name = i.getName();
            PropertyDescriptor propertyDescriptor = new PropertyDescriptor(name, instanceClass);
            Method readMethod = propertyDescriptor.getReadMethod();
            Object value = readMethod.invoke(instance);
            jsonObject.put(name, value);
        }
        return jsonObject.toString();
    }
}
