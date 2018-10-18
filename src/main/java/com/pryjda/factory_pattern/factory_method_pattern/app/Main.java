package com.pryjda.factory_pattern.factory_method_pattern.app;

import com.pryjda.factory_pattern.factory_method_pattern.app.products.Pizza;

public class Main {
    public static void main(String[] args) {

        Pizzeria americanPizzeria = new AmericanPizzeria();

        Pizza pizzaOne = americanPizzeria.orderPizza("cheese");
        System.out.println("Ordered: " + pizzaOne.getName() + "\n");

        Pizza pizzaTwo = americanPizzeria.orderPizza("vegetarian");
        System.out.println("Ordered: " + pizzaTwo.getName() + "\n");

        Pizzeria italianPizzeria = new ItalianPizzeria();

        Pizza pizzaThree = italianPizzeria.orderPizza("cheese");
        System.out.println("Ordered: " + pizzaThree.getName() + "\n");

        Pizza pizzaFour = italianPizzeria.orderPizza("vegetarian");
        System.out.println("Ordered: " + pizzaFour.getName() + "\n");

    }

}
