package com.yly.concurent;

import java.util.concurrent.SynchronousQueue;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/9/3 下午4:40
 * @since 1.0
 */
public class SynchronousQueueTest {
    public static void main(String[] args) {
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        new Thread(() -> {
            try {
                synchronousQueue.put("1");
                System.out.println("put success");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                Thread.sleep(1000);
                System.out.println(synchronousQueue.take());
                System.out.println("take success");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(1000);
                System.out.println(synchronousQueue.take());
                System.out.println("take success");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
