package com.yly.decoration;

public abstract class Beverage {

    String description = "Unknown Beverage";

    public abstract double cost();

    public String getDescription() {
        return description;
    }
}
