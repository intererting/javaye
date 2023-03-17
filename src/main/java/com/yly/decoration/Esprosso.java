package com.yly.decoration;

public class Esprosso extends Beverage {

    public Esprosso() {
        description = "Esprosso";
    }

    @Override
    public double cost() {
        return 0.2;
    }
}
