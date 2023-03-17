package com.yly.starter;

public class FlyDuck extends Duck {

    //将功能委托,而不是用接口去扩展
    private FlyBehavior flyBehavior;

    public FlyDuck(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    @Override
    public void eat() {
        System.out.println("flyduck eat");
    }

    public void performFly() {
        flyBehavior.fly();
    }
}
