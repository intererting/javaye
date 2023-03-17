package com.yly.jdk8;

import java.time.*;
import java.util.Date;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2020/12/24 下午2:34
 * @since 1.0
 */
public interface InterfaceA extends InterfaceB {

    default void test1() {
        System.out.println("test1");


    }

    private void test3() {

    }

    private void test4() {

    }

    private static void test5() {

    }
}