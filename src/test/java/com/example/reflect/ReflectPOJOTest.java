package com.example.reflect;

import org.json.JSONException;
import org.junit.Test;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;

public class ReflectPOJOTest {

    @Test
    public void getObjectJSONString() throws IllegalAccessException, IntrospectionException, InvocationTargetException, JSONException {
        Person person = new Person("wangminfeng", "28", "165cm", "65kg");
        System.out.println(ReflectPOJO.getObjectJSONString(person));
    }

    public static class Person{
        public String name;
        public String age;
        public String height;
        public String weight;

        public Person(String name, String age, String height, String weight) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getWeight() {
            return weight;
        }

        public void setWeight(String weight) {
            this.weight = weight;
        }
    }
}