package ru.geekbrains.java.oop.core.lesson7.online;

public class Main {

    public static void main(String[] args) {

        //Box box = new Box(1,2);
        //Box box = new Box(1,2, "3");
        //BoxWithNumbers<Long> box = new BoxWithNumbers<Long>(1L, 2, "3");
        BoxWithNumbers<Long> box = new BoxWithNumbers<>(1L, 2L, 2L);
        BoxWithNumbers<Double> doubleBox = new BoxWithNumbers<>(1.0, 2.0, 3.0);
        //BoxWithNumbers<String> boxWithStrings = new BoxWithNumbers<>("Hello");

        //for (Object value : box.values) {
        //    if (value instanceof Integer) {
        //        Integer val = (Integer) value;
        //        System.out.println(val);
        //    }
        //}
        Double sum = box.agregateAll();
        System.out.println(sum);

    }
}
