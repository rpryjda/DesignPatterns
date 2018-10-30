package com.pryjda.dao_pattern.app;

public class Main {

    public static void main(String[] args) {

        IDao dao = new ConcreteDao();

        Item itemNo1 = new Item("Ball", "Average size ball", 5);
        Item itemNo2 = new Item("Window", "Glass window", 3);
        Item itemNo3 = new Item("Brick", "Solid brick", 3);

        dao.add(itemNo1);
        dao.add(itemNo2);

        System.out.println(dao.getAll());

        dao.update(itemNo3);

        System.out.println(dao.getAll());

        dao.delete(5);

        System.out.println(dao.getAll());

    }

}
