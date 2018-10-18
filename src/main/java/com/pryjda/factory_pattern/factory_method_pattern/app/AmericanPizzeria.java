package com.pryjda.factory_pattern.factory_method_pattern.app;

import com.pryjda.factory_pattern.factory_method_pattern.app.products.AmericanCheesePizza;
import com.pryjda.factory_pattern.factory_method_pattern.app.products.AmericanVegetarianPizza;
import com.pryjda.factory_pattern.factory_method_pattern.app.products.Pizza;

public class AmericanPizzeria extends Pizzeria {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new AmericanCheesePizza();
        } else if (type.equals("vegetarian")) {
            pizza = new AmericanVegetarianPizza();
        }
        return pizza;
    }
}
