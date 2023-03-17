package com.yly.compose;

public class BlackDuck implements Quackable {

    private Observable observable;

    public BlackDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        notifyObservers();
    }

    @Override
    public void registObserver(Observer observer) {
        observable.registObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
