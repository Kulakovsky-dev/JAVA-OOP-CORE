package ru.geekbrains.java.oop.core.annotations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Авторизация")
public class DisplayNameExample {

    @DisplayName("Корректный логин/пароль")
    @Test
    public void chekSumCorrect() {
        Assertions.assertEquals(2, 1+1);
    }

    @DisplayName("Логин заблокирован")
    @Test
    public void chekSumException() {
        Assertions.assertEquals(3, 1+1);
    }
}
