package ru.geekbrains.java.oop.core.lesson3.homework;

import java.util.*;

public class Phone {
    private Map<String, Set<String>> phonebook = new HashMap<>();

    public void add(String name, String number)
    {   if (!phonebook.containsKey(name)) {
            phonebook.put(name, new HashSet<>());
        }
        Set<String> values = phonebook.get(name);
        values.add(number);
    }

    public Set<String> get(String name){
        Set<String> values = phonebook.get(name);
        return values;
    }
}
