package org.json;

import java.lang.reflect.Field;

public class Jason {

    public static String getAttribute(Object object, String attribute) {
        try {
            Field f = null; //NoSuchFieldException
            f = object.getClass().getDeclaredField(attribute);
            f.setAccessible(true);
            String iWantThis = (String) f.get(object); //IllegalAccessException
            return iWantThis;
        } catch (NoSuchFieldException | IllegalAccessException e) {
           throw new IllegalStateException(e);
        }
    }
}
