package com.yly.compose;

public interface QuackObservable {

    void registObserver(Observer observer);

    void notifyObservers();
}
