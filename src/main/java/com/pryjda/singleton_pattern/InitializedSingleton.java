package com.pryjda.singleton_pattern;

import lombok.Getter;
import lombok.Setter;

public class InitializedSingleton {

    private static InitializedSingleton singleton = new InitializedSingleton();

    @Getter
    @Setter
    private int checkNumber;

    private InitializedSingleton() {
    }

    public static InitializedSingleton getInstance() {
        return singleton;
    }


}
