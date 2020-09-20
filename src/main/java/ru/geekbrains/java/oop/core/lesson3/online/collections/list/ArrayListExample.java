package ru.geekbrains.java.oop.core.lesson3.online.collections.list;

import java.util.ArrayList;
        import java.util.Collection;

public class ArrayListExample {
    public static void main(String[] args) {

//        Создание коллекции элементов
        Collection<String> animalList = new ArrayList<>();


//        Добавление элементов

//      boolean add(E e); - одного элемента
        animalList.add("Лорд");
        animalList.add("Шарик");
        animalList.add("Сиплый");
        animalList.add("Сиплый");
        animalList.add("Сиплый");
        animalList.add("Сиплый");
        animalList.add("Сиплый");
        animalList.add("Сиплый");
        animalList.add("Сиплый");

//      boolean addAll(Collection c); - элементов коллекции
        Collection<String> catList = new ArrayList<>();
        catList.add("Борис");
        catList.add("Барсик");
        animalList.addAll(catList);

//        Определение размера
        System.out.println("Определение размера " + animalList.size());

//        проверка на пустоту
        System.out.println("проверка на пустоту " + animalList.isEmpty());


//        Проверки на вхождение
        System.out.println("одного элемента: " + catList.contains("Барсик"));
        System.out.println("всех элементов коллекции c: "+ animalList.containsAll(catList));
//
//        Удаление элементов
        System.out.println("одного элемента "+ catList.remove("Шарик"));
        System.out.println("элементов коллекции "+animalList.removeAll(catList));
        System.out.println("Определение размера " + animalList.size());

        animalList.clear();
        System.out.println("Определение размера " + animalList.size());

    }
}