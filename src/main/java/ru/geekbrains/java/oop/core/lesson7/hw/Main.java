package ru.geekbrains.java.oop.core.lesson7.hw;

public class Main {

    // не забыть доделать
    // метод compare
    // нельзя смешивать (контроль при пересыпании)
    // тесты

    public static void main(String[] args) {
        Apple apple1 = new Apple("яблоко1", 1.0);
        Apple apple2 = new Apple("яблоко2", 1.1);
        Orange orange1 = new Orange("апельсин1", 1.5);
        Orange orange2 = new Orange("апельсин2", 1.6);
        Orange orange3 = new Orange("апельсин3", 1.7);
        Orange orange4 = new Orange("апельсин4", 1.8);
        Orange orange5 = new Orange("апельсин5", 1.9);

        Box<Fruit> box1 = new Box<>(apple1,apple2);

        Box<Fruit> box2 = new Box<>(apple1,apple2);

        Box<Fruit> box3 = new Box<>(orange1,orange2,orange3,orange4);

        Box<Fruit> box4 = new Box<>(orange5);

        box1.printBox();
        box2.printBox();
        box3.printBox();
        box4.printBox();

        // сравнение
        box1.compare(box2);
        box2.compare(box3);

        // добавление с контролем
        box2.add(orange1);
        box2.add(apple1);

        box1.printBox();
        box2.printBox();
        box3.printBox();
        box4.printBox();

        box1.transferFrom(box4);

        box1.printBox();
        box2.printBox();
        box3.printBox();
        box4.printBox();

        box3.transferFrom(box4);

        box1.printBox();
        box2.printBox();
        box3.printBox();
        box4.printBox();

    }
}
