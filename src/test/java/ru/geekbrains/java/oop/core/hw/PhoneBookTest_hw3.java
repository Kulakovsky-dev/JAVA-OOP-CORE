package ru.geekbrains.java.oop.core.hw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.java.oop.core.lesson3.homework.Phone;

import java.util.HashSet;
import java.util.Set;

@DisplayName("Телефонный справочник")
public class PhoneBookTest_hw3 {

    @DisplayName("Добавление нового абонента")
    @Test
    public void chekMethodAdd() {
        Phone phonebook = new Phone();
        phonebook.add("Иванов","11111111");

        Set<String> expectedPhoneSet = new HashSet<>();
        expectedPhoneSet.add("11111111");
        Assertions.assertEquals(expectedPhoneSet,phonebook.get("Иванов"));
    }

    @DisplayName("Добавление нескольких номеров абоненту")
    @Test
    public void chekMethodAppend() {
        Phone phonebook = new Phone();
        phonebook.add("Иванов","11111111");
        phonebook.add("Иванов","22222222");
        phonebook.add("Иванов","33333333");

        Set<String> expectedPhoneSet = new HashSet<>();
        expectedPhoneSet.add("11111111");
        expectedPhoneSet.add("22222222");
        expectedPhoneSet.add("33333333");
        Assertions.assertEquals(expectedPhoneSet,phonebook.get("Иванов"));
    }

}

