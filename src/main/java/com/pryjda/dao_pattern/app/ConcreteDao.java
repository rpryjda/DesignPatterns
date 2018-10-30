package com.pryjda.dao_pattern.app;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ConcreteDao implements IDao {

    private Map<Integer, Item> items;

    public ConcreteDao() {
        items = new HashMap<>();
    }

    @Override
    public void add(Item item) {
        items.put(item.getIdNumber(), item);
    }

    @Override
    public Collection<String> getAll() {
        return items.values().stream().map(value -> value.getName()).collect(Collectors.toSet());
    }

    @Override
    public void update(Item item) {
        items.put(item.getIdNumber(), item);
    }

    @Override
    public void delete(Integer idNumber) {
        items.remove(idNumber);
    }
}
