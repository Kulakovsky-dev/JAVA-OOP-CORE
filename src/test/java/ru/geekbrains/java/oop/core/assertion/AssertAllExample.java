package ru.geekbrains.java.oop.core.assertion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AssertAllExample {

    @Test
    public void chekSumCorrect() {
        // получили с веба
        String expectedLogin = "super_user";
        String fio = "Иванов Иван Иванович";
        String proff = "Мафиози";

        // проверки
        Assertions.assertAll("Проверка данных пользователя",
                ()->Assertions.assertEquals(expectedLogin,"Super User"),
                ()->Assertions.assertEquals(fio,"Иванов Иван Петрович"),
                ()->Assertions.assertEquals(proff,"Мафиози+")
                );
        //Assertions.assertEquals(expectedLogin,"Super User");
        //Assertions.assertEquals(fio,"Иванов Иван Иванович");
        //Assertions.assertEquals(proff,"Мафиози");

    }
}
