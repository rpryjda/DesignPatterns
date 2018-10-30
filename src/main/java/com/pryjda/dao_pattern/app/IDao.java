package com.pryjda.dao_pattern.app;

import java.util.Collection;

public interface IDao {

    void add(Item item);

    Collection<String> getAll();

    void update(Item item);

    void delete(Integer idNumber);

}
