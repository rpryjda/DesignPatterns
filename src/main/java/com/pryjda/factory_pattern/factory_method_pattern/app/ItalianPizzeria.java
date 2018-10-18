package com.pryjda.factory_pattern.factory_method_pattern.app;

import com.pryjda.factory_pattern.factory_method_pattern.app.products.ItalianCheesePizza;
import com.pryjda.factory_pattern.factory_method_pattern.app.products.ItalianVegetarianPizza;
import com.pryjda.factory_pattern.factory_method_pattern.app.products.Pizza;

public class ItalianPizzeria extends Pizzeria {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new ItalianCheesePizza();
        } else if (type.equals("vegetarian")) {
            pizza = new ItalianVegetarianPizza();
        }
        return pizza;
    }
}
