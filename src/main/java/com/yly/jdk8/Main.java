package com.yly.jdk8;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2020/12/24 下午2:35
 * @since 1.0
 */
public class Main {

    static volatile Thread a;

    public static void main(String[] args) throws InterruptedException {
//        byte a = 1;
//        Byte b = null;

//        Person person = new Person();
//        PersonFactory personFactory = person::create;
//        System.out.println(personFactory.create("3"));
//        var a = "haha";
//        a = new Thread(() -> {
//            while (true) {
//                System.out.println("xx");
//            }
//        });
//        a.start();
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        a.interrupt();
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        try {
//            Method method = Person.class.getDeclaredMethod("create", String.class);
//            Parameter[] parameter = method.getParameters();
//            for (Parameter p : parameter) {
//                System.out.println(p.getName());
//            }
//        } catch (NoSuchMethodException e) {
//            throw new RuntimeException(e);
//        }

        while (true) {
            System.out.println("haha");
            Thread.sleep(1000);
        }
    }
}

interface PersonFactory {
    int create(String value);
}

class Person {

    int create(String value) {
        return Integer.parseInt(value);
    }
}