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

        new Phone();
        Phone.Add("111111111","Иванов");
        Phone.Add("222222222","Петров");
        Phone.Add("333333333","Сидоров");
        Phone.Add("444444444","Петров");
        Phone.Add("555555555","Иванов");
        Phone.Add("666666666","Кузькин");
        Phone.Print();
        Phone.Get("Иванов");
        Phone.Get("Петров");
        Phone.Get("Сидоров");
        Phone.Get("Кузькин");
        Phone.Get("ААААААА");

    }
}
