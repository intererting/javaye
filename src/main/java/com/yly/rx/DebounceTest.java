package com.yly.rx;

import io.reactivex.*;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.processors.PublishProcessor;
import io.reactivex.rxjava3.processors.UnicastProcessor;
import io.reactivex.rxjava3.schedulers.Schedulers;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Publisher;

import javax.annotation.processing.Processor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2020/10/12 上午11:38
 * @since 1.0
 */
public class DebounceTest {

    public static void main(String[] args) throws InterruptedException {

//        PublishProcessor<String> processor = PublishProcessor.create();
//        processor.debounce(300, TimeUnit.MILLISECONDS).subscribeOn(Schedulers.io())
//                .subscribe(System.out::println);
//        new ScheduledThreadPoolExecutor(1).scheduleAtFixedRate(() -> {
//            for (int i = 0; i < 300; i++) {
//                processor.offer(String.valueOf(i));
//                try {
//                    TimeUnit.MILLISECONDS.sleep(400);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }, 0, 100, TimeUnit.MILLISECONDS);

        Flowable flowableA = Flowable.timer(1, TimeUnit.SECONDS);
        Flowable flowableB = Flowable.just(4, 5, 6);
        Flowable.just(flowableA, flowableB).flatMap(new Function<Flowable, Publisher<?>>() {
            @Override
            public Publisher<?> apply(@NotNull Flowable flowable) throws Exception {
                return flowable;
            }
        }).subscribe(new Consumer<Object>() {
            @Override
            public void accept(Object o) throws Exception {
                System.out.println(o);
            }
        });
        Thread.sleep(1000);
    }
}
