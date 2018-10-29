package com.pryjda.prototype_pattern.app;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
public class Car implements Cloneable {

    private String name;
    private Integer vmax;
    private LocalDate productionDate;
    private List<String> leatherElements;
    private String navigationProvider;
    private Float bluetoothVersion;

    @Override
    public Car clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }

}
