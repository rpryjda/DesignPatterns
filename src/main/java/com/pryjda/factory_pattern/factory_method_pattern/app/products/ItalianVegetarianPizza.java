package com.pryjda.factory_pattern.factory_method_pattern.app.products;

public class ItalianVegetarianPizza extends Pizza {

    public ItalianVegetarianPizza() {
        super.setName("Italian Vegetarian Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("preparing with tones of vegs and without meat and with Italian ingredients");
    }
}
