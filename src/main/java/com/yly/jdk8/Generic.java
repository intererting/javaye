package com.yly.jdk8;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * author        yiliyang
 * date          2022-08-16
 * time          下午3:35
 * version       1.0
 * since         1.0
 */
public class Generic<T> {

    private T data;

    private String name;

    private static <M> M test(M data) {
        return data;
    }

    private void testB() {
        System.out.println(test("haha"));
    }

    public static void main(String[] args) {
//        Generic generic = new Generic();
//        generic.data = "data";
//        generic.testB();

        Future future = Executors.newFixedThreadPool(1).submit(new Runnable() {
            @Override
            public void run() {
                throw new RuntimeException("exception");
            }
        });
        try {
            future.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            System.out.println("xxxx");
        }
    }
}
