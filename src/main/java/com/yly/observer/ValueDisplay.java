package com.yly.observer;

public class ValueDisplay implements Observer, DisplayElement {


    private String  value;
    private Subject valueData;

    public ValueDisplay(Subject valueData) {
        this.valueData = valueData;
        valueData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("display  " + value);
    }

    @Override
    public void update(String value) {
        this.value = value;
        display();
    }
}
