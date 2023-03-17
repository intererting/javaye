package com.yly.extend;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/3/1 下午3:59
 * @since 1.0
 */
public class Father {

    static {
        System.out.println("father init");
    }

    public static int a = 3;

    public static String b = "hello";

    public static void test() {
        System.out.println("father test");
    }

    public final void testMethod() {

    }

    @Override
    public String toString() {
//        return super.toString();
        return "father toString";
    }
}
