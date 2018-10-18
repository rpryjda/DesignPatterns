package com.pryjda.factory_pattern.factory_method_pattern.app.products;

import lombok.Getter;
import lombok.Setter;

public abstract class Pizza {

    @Getter
    @Setter
    private String name;

    public void prepare() {
        System.out.println("preparing in very general way...");
    }

    public void bake() {
        System.out.println("baking in very general way...");
    }

    public void cut() {
        System.out.println("cutting in very general way...");
    }

    public void box() {
        System.out.println("boxing in very general way...");

    }

}
