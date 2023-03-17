package com.yly.observer;

import java.util.ArrayList;

public class ValueData implements Subject {

    private ArrayList<Observer> observers;
    private String              value;

    public ValueData() {
        this.observers = new ArrayList<>();
    }

    public void setValue(String value) {
        this.value = value;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(value);
        }
    }
}
