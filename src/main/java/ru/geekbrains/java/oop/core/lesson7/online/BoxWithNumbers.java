package ru.geekbrains.java.oop.core.lesson7.online;

public class BoxWithNumbers<T extends Number> {

    T[] values;

    public BoxWithNumbers(T... values) {
        this.values = values;
    }

    public T getFirst() {
        return values[0];
    }

    public T[] getValues() {
        return values;
    }

    public Double agregateAll() {
        Double result = 0.0;
        for (T value : values) {
            result = result + value.doubleValue();
        }
        return result;
    }

    public boolean hasEqualSum(BoxWithNumbers<?> otherBox) {
        return agregateAll().equals(otherBox.agregateAll());
    }
}
