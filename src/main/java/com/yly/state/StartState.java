package com.yly.state;

public class StartState implements State {
    @Override
    public void test() {
        System.out.println("StartState");
    }
}
