package ru.geekbrains.java.oop.core.lesson7.online.compare;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringSorter {

    public List<String> sort(List<String> input) {
        Collections.sort(input);
        return input;
    }

    public List<String> sortByLength(List<String> input) {
        input.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //return o1.compareTo(o2); // стандарт по алфавиту
                return o1.length() - o2.length();
            }
        });
        return input;
    }

    public List<String> sortByLength_J8(List<String> input) {
        input.sort((o1, o2) -> o1.length() - o2.length());
        return input;
    }

    public List<String> sortByLength_2(List<String> input) {
        input.sort(Comparator.comparingInt(String::length));
        return input;
    }
    public List<String> sortByLength_Reversed(List<String> input) {
        input.sort(Comparator.comparingInt(String::length).reversed());
        return input;
    }
}
