package com.pryjda.singleton_pattern;

import lombok.Getter;
import lombok.Setter;

public class Singleton {

    private static Singleton singleton;

    @Getter
    @Setter
    private int checkNumber;

    private Singleton() {
    }

    public static Singleton getInstance() {

        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }


}
