package ru.geekbrains.java.oop.core.lesson7.online;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxWithNumbersTest {

    @Test
    void agregateAll() {
        BoxWithNumbers<Long> box = new BoxWithNumbers<>(1L, 2L, 2L);
        Double sum = box.agregateAll();
        Assertions.assertEquals(5.0, sum);
    }

    @Test
    public void compareBoxesTest() {
        BoxWithNumbers<Long> box = new BoxWithNumbers<>(1L, 2L, 2L);
        BoxWithNumbers<Long> other = new BoxWithNumbers<>(1L, 2L, 2L);
        Assertions.assertTrue(box.hasEqualSum(other));
    }

    @Test
    public void compareDifferentBoxesTest() {
        BoxWithNumbers<Long> box = new BoxWithNumbers<>(1L, 2L, 2L);
        BoxWithNumbers<Double> other = new BoxWithNumbers<>(1.0, 2.0, 2.0);
        Assertions.assertTrue(box.hasEqualSum(other));
    }
}