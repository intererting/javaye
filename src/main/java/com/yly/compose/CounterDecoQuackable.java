package com.yly.compose;

import java.util.concurrent.atomic.AtomicInteger;

public class CounterDecoQuackable implements Quackable {

    private Quackable quackable;

    private static AtomicInteger count = new AtomicInteger();

    public static int getCount() {
        return count.intValue();
    }

    public CounterDecoQuackable(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        count.incrementAndGet();
    }

    @Override
    public void registObserver(Observer observer) {
        quackable.registObserver(observer);
    }

    @Override
    public void notifyObservers() {
        quackable.notifyObservers();
    }
}
