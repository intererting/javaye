package com.yly.kotlin;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/7/19 上午9:40
 * @since 1.0
 */
public class JavaUtil {

    static {
        System.out.println("static init");
    }

    JavaUtil() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        JavaUtil javaUtil = new JavaUtil();
        JavaUtil javaUtil1 = new JavaUtil();
        JavaUtil javaUtil2 = new JavaUtil();
    }
}
