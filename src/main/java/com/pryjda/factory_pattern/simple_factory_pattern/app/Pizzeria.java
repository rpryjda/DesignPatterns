package com.pryjda.factory_pattern.simple_factory_pattern.app;

import com.pryjda.factory_pattern.simple_factory_pattern.app.factory.SimplePizzaFactory;
import com.pryjda.factory_pattern.simple_factory_pattern.app.products.Pizza;

public class Pizzeria {

    private SimplePizzaFactory factory;

    public Pizzeria(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {

        Pizza pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }


}
