package ru.geekbrains.java.oop.core.lesson7.online;

public class Box {

    Object[] values;

    public Box(Object... values) {
        this.values = values;
    }

    public Object getFirst() {
        return values[0];
    }

    public Object[] getValues() {
        return values;
    }
}
