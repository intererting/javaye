package com.yly.guava;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;

import java.util.concurrent.*;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/10/9 下午2:13
 * @since 1.0
 */
public class FutureTest {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        Future future1 = service.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        future1.cancel(true);
        ListenableFuture future = MoreExecutors.listeningDecorator(service).submit(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "haha";
        });
        future.addListener(() -> {
            System.out.println(Thread.currentThread() + " listener");
            try {
                System.out.println(future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }, service);
        future.addListener(() -> {
            System.out.println(Thread.currentThread() + " listener");
            try {
                System.out.println(future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }, service);
    }
}
