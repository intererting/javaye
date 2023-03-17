package com.yly.compose;

public class CountQuackableFactory extends QuackableFactory {
    @Override
    public Quackable createWhiteDuck() {
        return new CounterDecoQuackable(new WhiteDuck());
    }

    @Override
    public Quackable createBlackDuck() {
        return new CounterDecoQuackable(new BlackDuck());
    }

}
