package com.pryjda.factory_pattern.simple_factory_pattern.app.products;

public class VegetarianPizza extends Pizza {

    public VegetarianPizza() {
        super.setName("Vegetarian Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("preparing with tones of vegs and without meat");
    }
}
