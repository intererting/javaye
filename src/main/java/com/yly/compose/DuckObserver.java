package com.yly.compose;

public class DuckObserver implements Observer {
    @Override
    public void update(Quackable quackable) {
        System.out.println(quackable.getClass().getName() + " " + "quack");
    }
}
