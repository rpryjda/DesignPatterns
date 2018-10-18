package com.pryjda.decorator_pattern.app;

public class Coffe extends Beverage {

    public Coffe() {
        super.setDescription("beverage: Coffe");
    }

    @Override
    public double price() {
        return 5.00;
    }

}
