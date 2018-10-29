package com.pryjda.builder_pattern.app2;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Builder
@Data
public class Car {

    private String name;
    private Integer vmax;
    private LocalDate productionDate;
    private List<String> leatherElements;
    private String navigationProvider;
    private Float bluetoothVersion;

}
