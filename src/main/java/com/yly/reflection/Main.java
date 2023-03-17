package com.yly.reflection;

import java.lang.reflect.InvocationTargetException;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/10/12 下午4:40
 * @since 1.0
 */
public class Main {

    public static void main(String[] args) throws Exception {
        new Main().test();
    }

    private void test() {
//        Consumer<String> r = (name) -> {
//            System.out.println("hello, " + name + " " + this.getClass().getName());
//        };
        Runnable r = () -> {
            System.out.println("hello, lambda");
        };
        r.run();
        try {
//            Main.class.getDeclaredMethod("lambda$main$0").invoke(new Main(), "world");
            Main.class.getDeclaredMethod("lambda$test$0").invoke(null);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

}
