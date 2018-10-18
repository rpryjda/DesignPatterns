package com.pryjda.factory_pattern.factory_method_pattern.app.products;

public class AmericanCheesePizza extends Pizza {

    public AmericanCheesePizza() {
        super.setName("American Cheese Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("preparing with tones of cheese and with American ingredients");
    }
}
