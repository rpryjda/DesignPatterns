package com.pryjda.singleton_pattern;

public class Main {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();

        singleton.setCheckNumber(15);
        System.out.println(singleton.getCheckNumber());

        Singleton singletonTWO = Singleton.getInstance();
        System.out.println(singletonTWO.getCheckNumber());

    }
}
