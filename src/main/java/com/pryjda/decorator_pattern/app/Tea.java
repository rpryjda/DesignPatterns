package com.pryjda.decorator_pattern.app;

public class Tea extends Beverage {

    public Tea() {
        super.setDescription("beverage: Tea");
    }

    @Override
    public double price() {
        return 3.50;
    }

}
