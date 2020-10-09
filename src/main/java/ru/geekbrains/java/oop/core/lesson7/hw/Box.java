package ru.geekbrains.java.oop.core.lesson7.hw;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private static int box_id = 0;
    private String boxName;
    private List<Fruit> values;

    Box() {
        box_id += 1;
        boxName = "box." + box_id;
        this.values = new ArrayList<Fruit>();
    }

    Box(Fruit... values) {
        this();
        add(values);
    }

    public boolean add(Fruit... values) {
        for (Fruit value : values) {
            if (this.values.size() == 0 || value.getClass() == this.values.get(0).getClass()) {
                this.values.add(value);
            } else {
                System.out.println("*** Can't add " + value.getName() + " into " + boxName + " (" + this.values.get(0).getName()+')');
                return false;
            }
        }
        return true;
    }

    public String getName() {
        return this.boxName;
    }

    public Fruit getValue(int pointer)
    {
        return this.values.get(pointer);
    }

    public int getSize()
    {
        return this.values.size();
    }

    public Double getWeight() {
        Double sum = 0.0;
        for (Fruit value : values) {
            sum = sum + value.getWeight();
        }
        return sum;
    }

    public boolean compare(Box otherBox) {
        Boolean equals = values.equals(otherBox.values);
        System.out.println("compare " + this.getName() + " : " + otherBox.getName() + ' ' + equals);
        return equals;
    }

    public void transferFrom(Box<Fruit> otherBox) {
        System.out.println("Пересыпаем " + otherBox.boxName + " -> " + boxName);
        int pointer = 0;
        Fruit val;
        do {
            val = otherBox.values.get(pointer);
            if (this.add(val)) otherBox.values.remove(val);
            pointer+=1;
        } while (pointer < otherBox.values.size());
        // не используем метод .clear, т.к. нужен контроль каждого фрукта на допустимость пересыпания
    }

    public void printBox() {
        System.out.print("  Коробка " + boxName + " (" + values.size() + "шт.) ");
        for (Fruit value : values) {
            System.out.print("[" + value.getName() + ": " + value.getWeight() + "] ");
        }
        System.out.println("Общий вес = " + getWeight());
    }

}

