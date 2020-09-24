package ru.geekbrains.java.oop.core.annotations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class RepeatedExample {

    @RepeatedTest(5)
    public void chekSumCorrect() {
        Assertions.assertEquals(2, 1+1);
    }

    @Test
    public void chekSumException() {
        Assertions.assertEquals(3, 1+1);
    }
}
