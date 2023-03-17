package com.yly;

import java.util.Objects;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2020/11/26 上午9:57
 * @since 1.0
 */
public class LockTest {

    //    private final static Object lock = new Object();
    private final static Lock      lock      = new ReentrantLock();
    private final static Condition condition = lock.newCondition();

    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    static void test1() {
        new Thread(() -> {
            lock.lock();
            try {
                condition.await();
                System.out.println("test1");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }).start();
    }

    static void test2() {
        new Thread(() -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock.lock();
            try {
                System.out.println("test2");
                condition.signalAll();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }).start();
    }

    static void test3() {
        new Thread(() -> {
            lock.lock();
            try {
                condition.await();
                System.out.println("test3");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }).start();
    }
}
