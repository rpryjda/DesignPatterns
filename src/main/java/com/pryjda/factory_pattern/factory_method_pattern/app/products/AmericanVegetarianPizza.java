package com.pryjda.factory_pattern.factory_method_pattern.app.products;

public class AmericanVegetarianPizza extends Pizza {

    public AmericanVegetarianPizza() {
        super.setName("American Vegetarian Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("preparing with tones of vegs and without meat and with American ingredients");
    }
}
