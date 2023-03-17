package com.yly.factory;

public class SichuanFactory implements Factory {
    @Override
    public Product produce() {
        return new SichuanProduct();
    }
}
