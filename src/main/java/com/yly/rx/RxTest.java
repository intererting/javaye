package com.yly.rx;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.processors.MulticastProcessor;
import io.reactivex.rxjava3.processors.PublishProcessor;
import io.reactivex.rxjava3.processors.UnicastProcessor;
import io.reactivex.rxjava3.schedulers.Schedulers;
import org.reactivestreams.Publisher;

import javax.annotation.processing.Processor;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collector;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2020/9/23 上午11:16
 * @since 1.0
 */
public class RxTest {

    public static void main(String[] args) throws InterruptedException {
//        testUnicast();
//        var processor = PublishProcessor.just(1, 2, 3);
//        processor.subscribe(integer -> {
//            System.out.println("subscribe_1  " + integer);
//        });
//        processor.subscribe(integer -> {
//            System.out.println("subscribe_2  " + integer);
//        });
        PublishProcessor<String> processor = PublishProcessor.create();
        processor.subscribeOn(Schedulers.computation()).subscribe(data -> {
            System.out.println("receive data 2 " + data);
            System.out.println(Thread.currentThread());
        });
        processor.offer("haha");
        Thread.sleep(1000);
    }

    private static void testUnicast() {
        UnicastProcessor.just(1, 2).concatMap((Function<Integer, Publisher<?>>) integer ->
        {
            if (integer == 1) {
                return UnicastProcessor.just(integer).delay(10, TimeUnit.SECONDS);
            } else {
                return UnicastProcessor.just(integer);
            }
        }).subscribe(System.out::println);

        try {
            Thread.sleep(400000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
