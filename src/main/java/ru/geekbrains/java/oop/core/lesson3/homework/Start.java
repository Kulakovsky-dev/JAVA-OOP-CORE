package ru.geekbrains.java.oop.core.lesson3.homework;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {

     // 1.Вывести список уникальных слов и количество повторений...

        String[] text = new String[] {"Black","White","Red","Green","Blue","Yellow","Brown","Cyan","Cyan","Magenta","Grey","Cyan","White","Orange","Pink"};
        List<Word> words = new ArrayList<>();

        for (int i = 0; i < text.length; i++) System.out.print(text[i] + ' ');
        System.out.println(" ");
        for (int i = 0; i < text.length; i++) {
            boolean found = false;
            for (int j = 0; j < words.size(); j++) {
                if(words.get(j).equals(text[i])) {
                    words.get(j).Increase();
                    found = true;
                    break;
                }
            }
            if (!found) {
                words.add(new Word(text[i]));
            }
        }
        for (int i = 0; i < words.size(); i++) {
            words.get(i).print();
        }

     // Телефонный справочник...

        Phone phonebook = new Phone();

        phonebook.add("Иванов","11111111");
        phonebook.add("Петров","22222222");
        phonebook.add("Сидоров","33333333");
        phonebook.add("Петров","44444444");
        phonebook.add("Иванов","55555555");
        phonebook.add("Кузькин","66666666");

        System.out.println(phonebook.get("Иванов"));
        System.out.println(phonebook.get("Петров"));
        System.out.println(phonebook.get("Сидоров"));
        System.out.println(phonebook.get("Кузькин"));
        System.out.println(phonebook.get("ААААААА"));

    }
}
