package com.pryjda.dao_pattern.app;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item {

    private String name;
    private String description;
    private Integer idNumber;

}
