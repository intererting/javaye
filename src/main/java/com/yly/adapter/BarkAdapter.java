package com.yly.adapter;

//如果是类适配器,可以通过继承原来的实现适配新接口
public class BarkAdapter implements Bark {

    private Fly fly;

    public BarkAdapter(Fly fly) {
        this.fly = fly;
    }

    @Override
    public void bark() {
        fly.fly();
    }
}
