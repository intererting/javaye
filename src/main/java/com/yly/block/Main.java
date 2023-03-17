package com.yly.block;

/**
 * author        yiliyang
 * date          2022-09-21
 * time          下午1:55
 * version       1.0
 * since         1.0
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("before block");
        {
            System.out.println("inner block");
        }
        System.out.println("after block");
    }
}
