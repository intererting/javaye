package com.yly.compose;

import java.util.ArrayList;

public class Observable implements QuackObservable {

    private ArrayList<Observer> observers = new ArrayList<>();
    private Quackable           duck;

    public Observable(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void registObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(duck);
        }
    }
}
