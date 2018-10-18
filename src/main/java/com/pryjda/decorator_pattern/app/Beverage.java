package com.pryjda.decorator_pattern.app;

import lombok.Getter;
import lombok.Setter;

public abstract class Beverage {

    @Getter
    @Setter
    private String description;

    public abstract double price();


}
