package com.pryjda.factory_pattern.simple_factory_pattern.app.products;

public class CheesePizza extends Pizza {


    public CheesePizza() {
        super.setName("Cheese Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("preparing with tones of cheese");
    }
}
