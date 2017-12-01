package org.courses;

import java.lang.reflect.Field;
import java.util.Scanner;

public class Main {

    public static void main (String args[]) throws IllegalAccessException {

        String name1 = "Vova";
        byte[] name1Chars = new byte[]{'A','B','C'};

        Class<?> clazz = name1.getClass();

        Field field = null;
        try {
            field = clazz.getDeclaredField("value");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        field.setAccessible(true);
        field.set(name1, name1Chars);

        System.out.println(name1);
        System.out.println("Vova");
    }
}
