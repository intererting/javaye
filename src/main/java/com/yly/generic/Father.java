package com.yly.generic;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yiliyang
 * @version 1.0
 * @date 20-12-18 上午10:29
 * @since 1.0
 */

class Father {

    static byte[] a = new byte[1024 * 1024];

    public static void main(String[] args) throws InterruptedException {

        ReferenceQueue<byte[]> queue = new ReferenceQueue<>();
        WeakReference<byte[]> weakReference = new WeakReference<>(a, queue);
        a = null;
        Runtime.getRuntime().gc();
        Runtime.getRuntime().runFinalization();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //ReferenceQueue里面保存的是WeakReference对象，而不是byte【】
        Reference<? extends byte[]> queueA = queue.poll();
        System.out.println(queueA);
    }
}
