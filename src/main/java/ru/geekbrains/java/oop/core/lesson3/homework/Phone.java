package ru.geekbrains.java.oop.core.lesson3.homework;

import java.util.HashMap;
import java.util.Iterator;

public class Phone {
    static HashMap<String,String> phonebook = new HashMap<>();

    public static void Add(String number, String name) {
        phonebook.put(number, name);
    }

    public static void Get(String name){
        Iterator it = phonebook.entrySet().iterator();
        if(!phonebook.containsValue(name)) {
            System.out.println("Нет номеров для " + name);
            return;
        }
        System.out.println("Список номеров для "+ name +':');
        while(it.hasNext()) {
            HashMap.Entry pair = (HashMap.Entry)it.next();
            if(pair.getValue()==name) System.out.println(" " + pair.getKey());
        }
    }
    public static void Print() {
        System.out.println("Телефонная книга: " + phonebook.size());
        System.out.println(phonebook);
    }
}
