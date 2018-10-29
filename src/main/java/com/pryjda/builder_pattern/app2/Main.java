package com.pryjda.builder_pattern.app2;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Car car = Car.builder()
                .name("Mercedes")
                .vmax(270)
                .productionDate(LocalDate.of(2005,01,01))
                .build();

        System.out.println(car);

    }

}
