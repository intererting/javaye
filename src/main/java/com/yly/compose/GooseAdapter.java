package com.yly.compose;

public class GooseAdapter implements Quackable {

    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.hook();
    }

    @Override
    public void registObserver(Observer observer) {
    }

    @Override
    public void notifyObservers() {

    }
}
