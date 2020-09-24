package ru.geekbrains.java.oop.core.assertion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertArrayEqualsExample {

    @Test
    public void chekSumCorrect() {
        String[] cats1 = {"Барсик","Мурзик"};
        String[] cats2 = {"Барсик","Бармик"};

        Assertions.assertArrayEquals(cats1,cats2);
    }

}
