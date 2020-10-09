package ru.geekbrains.java.oop.core.lesson7.hw;

import ru.geekbrains.java.oop.core.lesson7.online.compare.StringSorter;

public class Fruit {
    private String name;
    private Double weight;

    Fruit (String name, Double weight) {
        this.name = name;
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
