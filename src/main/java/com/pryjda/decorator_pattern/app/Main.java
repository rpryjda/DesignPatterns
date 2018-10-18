package com.pryjda.decorator_pattern.app;

import com.pryjda.decorator_pattern.app.decorators.Milk;
import com.pryjda.decorator_pattern.app.decorators.Sugar;

public class Main {

    public static void main(String[] args) {

        Beverage beverageCoffe = new Coffe();
        showDetails(beverageCoffe);

        beverageCoffe = new Milk(beverageCoffe);
        showDetails(beverageCoffe);

        beverageCoffe = new Sugar(beverageCoffe);
        showDetails(beverageCoffe);

        beverageCoffe = new Sugar(beverageCoffe);
        showDetails(beverageCoffe);

        Beverage beverageTea = new Tea();
        showDetails(beverageTea);

        beverageTea = new Sugar(beverageTea);
        showDetails(beverageTea);
    }

    public static void showDetails(Beverage beverage) {
        System.out.print(beverage.getDescription());
        System.out.println(" | cost: " + beverage.price() + " PLN");
    }

}
