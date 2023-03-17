package com.yly.compose;

public class NormalQuackableFactory extends QuackableFactory {
    @Override
    public Quackable createWhiteDuck() {
        return new WhiteDuck();
    }

    @Override
    public Quackable createBlackDuck() {
        return new BlackDuck();
    }
}
