package com.yly;

import java.util.concurrent.TimeUnit;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2020/10/26 下午3:05
 * @since 1.0
 */
public class ArthasDemo {

    public static void main(String[] args) {
        while (true) {
            print();
        }
    }

    public static String print() {
        System.out.println("hello arthas");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello arthas";
    }
}
