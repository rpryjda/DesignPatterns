package com.pryjda.factory_pattern.simple_factory_pattern.app.factory;

import com.pryjda.factory_pattern.simple_factory_pattern.app.products.CheesePizza;
import com.pryjda.factory_pattern.simple_factory_pattern.app.products.Pizza;
import com.pryjda.factory_pattern.simple_factory_pattern.app.products.VegetarianPizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {

        Pizza pizza;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("vegetarian")) {
            pizza = new VegetarianPizza();
        } else {
            pizza = new CheesePizza();
        }
        return pizza;
    }

}
