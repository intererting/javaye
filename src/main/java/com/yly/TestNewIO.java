package com.yly;

import kotlin.text.Charsets;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.Selector;
import java.nio.charset.Charset;
import java.util.PriorityQueue;
import java.util.concurrent.*;

public class TestNewIO {

    public static void main(String[] args) throws InterruptedException {
//        try {
//            FileOutputStream fileOutputStream = new FileOutputStream("/home/yuliyang/Desktop/test.txt");
//            FileChannel channel = fileOutputStream.getChannel();
//            ByteBuffer byteBuffer = ByteBuffer.allocate(6);
//            byteBuffer.put("你好".getBytes());
//            byteBuffer.flip();
//            channel.write(byteBuffer);
//            fileOutputStream.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try {
//            FileOutputStream outputStream = new FileOutputStream("/home/yuliyang/Desktop/test.txt");
//            FileChannel channel = outputStream.getChannel();
//            ByteBuffer byteBuffer = ByteBuffer.allocate(1024 * 1024 * 10);
//            channel.write(byteBuffer);
//            outputStream.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try {
//            RandomAccessFile randomAccessFile = new RandomAccessFile("/home/yuliyang/Desktop/test.txt", "rw");
//            randomAccessFile.setLength(1024 * 1024 * 10);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        PriorityBlockingQueue<Runnable> queue = new PriorityBlockingQueue<>();
//        queue.offer(() -> {
//            System.out.println("xx");
//        });
//        System.out.println("xxx");
//
//        queue.offer(() -> {
//            System.out.println("xx");
//        });

        Callable<String> callable = () -> {
            Thread.sleep(3000);
            return "from call";
        };
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> result = executorService.submit(callable);
        try {
            System.out.println(result.get(1, TimeUnit.SECONDS));
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            System.out.println("timeout");
            e.printStackTrace();
        }
        Thread.sleep(3000);
        try {
            System.out.println(result.get());
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("over");
    }
}
