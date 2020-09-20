package ru.geekbrains.java.oop.core.lesson3.online.collections.list.customobject;

import java.util.ArrayList;
        import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

//        Создание коллекции элементов
        List<Dog> animalList = new ArrayList<>();


//        Добавление элементов

//      boolean add(E e); - одного элемента
        animalList.add(new Dog("Лорд",1554433));
        animalList.add(new Dog("Шарик",2554433));
        animalList.add(new Dog("Сиплый",3554433));
        animalList.add(new Dog("Сиплый",4554433));
        animalList.add(new Dog("Сиплый",5554433));
        animalList.add(new Dog("Сиплый",6554433));
        animalList.add(new Dog("Сиплый",7554433));
        animalList.add(new Dog("Сиплый",8554433));
        animalList.add(new Dog("Барбос",9554433));


//      boolean addAll(Collection c); - элементов коллекции
        List<Dog> catList = new ArrayList<>();
        catList.add(new Dog("Супер",1554433));
        catList.add(new Dog("Пончик",2554433));
        animalList.addAll(catList);


        System.out.println("animalList.size() = " + animalList.size());


//      Получение номера элемента в списке
        int indexOfBarbos = animalList.indexOf(new Dog("Барбос", 9554433));
        System.out.println(animalList.indexOf(new Dog("Барбос",9554433)));


//      Замена элемента в списке
        System.out.println(animalList.set(indexOfBarbos,new Dog("Споук",123)));

        System.out.println(animalList.contains(new Dog("Барбос",9554433)));









//
//
//
////        Определение размера
//        System.out.println("Определение размера " + animalList.size());
//
////        проверка на пустоту
//        System.out.println("проверка на пустоту " + animalList.isEmpty());
//
//
////        Проверки на вхождение
//        System.out.println("одного элемента: " + catList.contains("Барсик"));
//        System.out.println("всех элементов коллекции c: "+ animalList.containsAll(catList));
////
////        Удаление элементов
//        System.out.println("одного элемента "+ catList.remove("Шарик"));
//        System.out.println("элементов коллекции "+animalList.removeAll(catList));
//        System.out.println("Определение размера " + animalList.size());
//
//        animalList.clear();
//        System.out.println("Определение размера " + animalList.size());

    }
}