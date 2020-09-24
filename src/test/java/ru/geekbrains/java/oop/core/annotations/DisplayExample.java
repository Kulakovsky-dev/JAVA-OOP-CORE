package ru.geekbrains.java.oop.core.annotations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DisplayExample {

    @Test
    public void chekSumCorrect() {
        Assertions.assertEquals(2, 1+1);
    }

    @Disabled("Отключен до 26 сентября")
    @Test
    public void chekSumException() {
        Assertions.assertEquals(3, 1+1);
    }

}
