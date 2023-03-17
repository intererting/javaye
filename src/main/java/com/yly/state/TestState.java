package com.yly.state;

public class TestState {

    State prepareState;
    State startState;
    State currentState;

    public TestState() {
        prepareState = new PrepareState();
        startState = new StartState();
        currentState = prepareState;
    }

    void test() {
        currentState.test();
    }

    public static void main(String[] args) {
        new TestState().test();
    }
}
