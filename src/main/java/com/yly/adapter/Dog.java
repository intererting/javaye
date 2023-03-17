package com.yly.adapter;

public class Dog implements Bark {
    @Override
    public void bark() {
        System.out.println("dog bark");
    }
}
