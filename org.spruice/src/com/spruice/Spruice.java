package com.spruice;

public class Spruice {

    public static Object generate(String clazzName) {

        try {
            Class<?> clazz = null;
            clazz = Class.forName(clazzName);

            return clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }
}
