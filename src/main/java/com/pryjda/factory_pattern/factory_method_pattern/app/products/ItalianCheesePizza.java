package com.pryjda.factory_pattern.factory_method_pattern.app.products;

public class ItalianCheesePizza extends Pizza {

    public ItalianCheesePizza() {
        super.setName("Italian Cheese Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("preparing with tones of cheese and with Italian ingredients");
    }
}
