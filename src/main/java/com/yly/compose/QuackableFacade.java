package com.yly.compose;

import java.util.ArrayList;

public class QuackableFacade {

    private ArrayList<Quackable> quackables;

    public QuackableFacade() {
        quackables = new ArrayList<>();
    }

    public void addQuackable(Quackable quackable) {
        quackables.add(quackable);
    }

    public void quack() {
        for (Quackable quackable : quackables) {
            quackable.quack();
        }
    }

    public void addObserver(Observer observer) {
        for (Quackable quackable : quackables) {
            quackable.registObserver(observer);
        }
    }
}
