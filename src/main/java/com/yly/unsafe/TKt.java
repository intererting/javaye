package com.yly.unsafe;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/10/13 下午2:31
 * @since 1.0
 */
class TKt {
    private static Unsafe unsafe;

    static {
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            unsafe = (Unsafe) field.get(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void replaceObject(Object obj, String fieldName, Object newField) {

        try {
            Field nameField = Test.class.getDeclaredField(fieldName);
            long fieldOffset = unsafe.objectFieldOffset(nameField);
            System.out.println(fieldOffset);
            unsafe.putObject(obj, fieldOffset, newField);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }
}
