package com.pryjda.factory_pattern.simple_factory_pattern.app;

import com.pryjda.factory_pattern.simple_factory_pattern.app.factory.SimplePizzaFactory;
import com.pryjda.factory_pattern.simple_factory_pattern.app.products.Pizza;

public class Main {
    public static void main(String[] args) {

        Pizzeria pizzeria = new Pizzeria(new SimplePizzaFactory());

        Pizza pizzaOne = pizzeria.orderPizza("cheese");
        System.out.println("Ordered: " + pizzaOne.getName() + "\n");

        Pizza pizzaTwo = pizzeria.orderPizza("vegetarian");
        System.out.println("Ordered: " + pizzaTwo.getName() + "\n");

    }
}
