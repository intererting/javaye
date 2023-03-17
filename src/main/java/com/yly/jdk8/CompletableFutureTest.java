package com.yly.jdk8;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * author        yiliyang
 * date          2022-07-26
 * time          上午10:21
 * version       1.0
 * since         1.0
 */
public class CompletableFutureTest {

    private static void test_1() {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();
        new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            completableFuture.complete("success");
        }).start();
        try {
            System.out.println(completableFuture.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    private static void test_2() {
        var a = CompletableFuture.supplyAsync(() -> {
            try {
                //这里是守护线程
                System.out.println("Thread.currentThread().isDaemon() " + Thread.currentThread().isDaemon());
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "hello";
        });
        a.whenComplete((result, throwable) -> {
            System.out.println("complete " + Thread.currentThread());
            System.out.println(result);
        });
    }

    private static void test_3() {
        CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "hello";
        }).join();
    }

    private static void test_4() {
        CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "xxx";
        }).thenAccept((s1) -> {
            System.out.println(Thread.currentThread());
            System.out.println(s1);
        }).join();
    }

    private static void test_5() {
        CompletableFuture.supplyAsync(() -> {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return "xxx";
                }).thenCompose(CompletableFuture::completedStage)
                .thenAccept(s -> {
                    System.out.println("s " + s);
                });
    }

    private static void test_6() {
        CompletableFuture.supplyAsync(() -> {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return "xxx";
                }).thenApply(s -> s + " thenApply")
                .thenAccept(System.out::println);
    }

    private static void test_7() {
        CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "xxx";
        }).thenRun(() -> System.out.println("run"));
    }

    private static void test_8() {
        var a = CompletableFuture.supplyAsync(() -> {
            System.out.println("a " + Thread.currentThread());
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "a";
        });
        var b = CompletableFuture.supplyAsync(() -> {
            System.out.println("b " + Thread.currentThread());
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "b";
        });
        var c = CompletableFuture.anyOf(a, b);
        try {
            System.out.println(c.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    private static void test_9() {
        var a = CompletableFuture.supplyAsync(() -> {
            System.out.println("a " + Thread.currentThread());
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "a";
        });
        try {
            String result = a.handle((a1, b1) -> {
                System.out.println("a1 " + a1);
                System.out.println(b1);
                return "success";
            }).get();
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        test_1();
//        test_2();
//        test_3();
//        test_4();
//        test_5();
//        test_6();
//        test_7();
//        test_8();
        test_9();
    }
}
