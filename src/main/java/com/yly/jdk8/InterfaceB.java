package com.yly.jdk8;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2020/12/24 下午2:34
 * @since 1.0
 */
public interface InterfaceB {

    default void test2() {
        System.out.println("test2");
    }
}
