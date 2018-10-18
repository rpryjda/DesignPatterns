package com.pryjda.factory_pattern.factory_method_pattern.app;

import com.pryjda.factory_pattern.factory_method_pattern.app.products.Pizza;

public abstract class Pizzeria {

    public Pizza orderPizza(String type) {

        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public abstract Pizza createPizza(String type);

}
