package com.yly.compose;

public class WhiteDuck implements Quackable {

    private Observable observable;

    public WhiteDuck() {
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
