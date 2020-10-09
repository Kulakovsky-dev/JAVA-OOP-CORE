package ru.geekbrains.java.oop.core.lesson7.hw;

import com.sun.org.apache.xpath.internal.operations.Or;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {

    @Test
    void compareTrue() {
        Apple apple1 = new Apple("яблоко1", 1.0);
        Apple apple2 = new Apple("яблоко2", 1.1);
        Box<Fruit> box1 = new Box<>(apple1, apple2);
        Box<Fruit> box2 = new Box<>(apple1, apple2);
        Assertions.assertTrue(box1.compare(box2));
    }

    @Test
    void compareFalse() {
        Apple apple1 = new Apple("яблоко1", 1.0);
        Apple apple2 = new Apple("яблоко2", 1.1);
        Box<Fruit> box1 = new Box<>(apple1, apple2);
        Box<Fruit> box2 = new Box<>(apple1);
        Assertions.assertFalse(box1.compare(box2));
    }

    @Test
    void addTrue() {
        Apple apple1 = new Apple("яблоко1", 1.0);
        Apple apple2 = new Apple("яблоко2", 1.1);
        Apple apple3 = new Apple("яблоко3", 1.1);
        Box<Fruit> box = new Box<>(apple1, apple2);
        Assertions.assertTrue(box.add(apple3));
    }

    @Test
    void addFalse() {
        Apple apple1 = new Apple("яблоко1", 1.0);
        Apple apple2 = new Apple("яблоко2", 1.1);
        Orange orange1 = new Orange("апельсин1", 1.5);
        Box<Fruit> box = new Box<>(apple1, apple2);
        Assertions.assertFalse(box.add(orange1));
    }

    @Test
    void transferTrue() {
        Apple apple1 = new Apple("яблоко1", 1.0);
        Apple apple2 = new Apple("яблоко2", 1.1);
        Apple apple3 = new Apple("яблоко3", 1.1);
        Box<Fruit> box1 = new Box<>(apple1, apple2);
        Box<Fruit> box2 = new Box<>(apple3);
        box1.transferFrom(box2);

        Assertions.assertEquals(apple1, box1.getValue(0));
        Assertions.assertEquals(apple2, box1.getValue(1));
        Assertions.assertEquals(apple3, box1.getValue(2));
        Assertions.assertEquals(3, box1.getSize());
        Assertions.assertEquals(0, box2.getSize());
    }

    @Test
    void transferFalse() {
        Apple apple1 = new Apple("яблоко1", 1.0);
        Apple apple2 = new Apple("яблоко2", 1.1);
        Orange orange = new Orange("апельсин", 1.5);
        Box<Fruit> box1 = new Box<>(apple1, apple2);
        Box<Fruit> box2 = new Box<>(orange);
        box1.transferFrom(box2);

        Assertions.assertEquals(apple1, box1.getValue(0));
        Assertions.assertEquals(apple2, box1.getValue(1));
        Assertions.assertEquals(orange, box2.getValue(0));
        Assertions.assertEquals(2, box1.getSize());
        Assertions.assertEquals(1, box2.getSize());

    }
}