package com.example.demo;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

public class testUNICODE {

    @Test
    public void testStringValueOf() throws UnsupportedEncodingException {
        char c = '我';
        String s = "h我是<";
        System.out.println(s.charAt(1));
        byte[] b = s.getBytes();
        System.out.println(b.length);
        printUnsignedByte(b);
        System.out.println(String.valueOf(c));

    }


    private void printUnsignedByte(byte[] b){
        for(int i = 0; i < b.length; ++i){
            int j = b[i] & 0xff;
            System.out.printf("%02x", j);
        }
    }
}
