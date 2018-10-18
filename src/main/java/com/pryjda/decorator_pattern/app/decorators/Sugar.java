package com.pryjda.decorator_pattern.app.decorators;

import com.pryjda.decorator_pattern.app.Beverage;

public class Sugar extends Beverage {

    private Beverage beverage;

    public Sugar(Beverage beverage) {
        this.beverage = beverage;
        super.setDescription(beverage.getDescription() + ", sugar");
    }

    public double price() {
        return beverage.price() + 1;
    }

}
