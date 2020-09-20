package ru.geekbrains.java.oop.core.lesson3.online.map;

public class Cat {
    private String name ;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}