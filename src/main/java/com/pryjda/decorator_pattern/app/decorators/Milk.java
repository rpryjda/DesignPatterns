package com.pryjda.decorator_pattern.app.decorators;

import com.pryjda.decorator_pattern.app.Beverage;

public class Milk extends Beverage {

    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
        super.setDescription(beverage.getDescription() + ", milk");
    }

    public double price() {
        return beverage.price() + 2.00;
    }

}
