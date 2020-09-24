package ru.geekbrains.java.oop.core.lesson2.homework;

import java.util.Arrays;

public class Start {
    private static final int DIMENSION = 4;

        public static void main(String[] args) {
        String array[][];

        // Тест 1
        array = new String[][] {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        try {
            System.out.println("Сумма в массиве = " + calcArray(array) + "\n");
        } catch(MyArraySizeException e) {
            System.out.println("No sucess \n");
        } catch(MyArrayDataException e) {
            System.out.println("No sucess \n ");
        }

        // Тест Array2
        array = new String[][] {{"1", "2", "3", "4"}, {"5", "6", "A", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        try {
            System.out.println("Сумма в массиве = " + calcArray(array) + "\n");
        } catch(MyArraySizeException e) {
            System.out.println("No sucess \n ");
        } catch(MyArrayDataException e) {
            System.out.println("No sucess \n ");
        }

        // Тест Array3
        array = new String[][] {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}};
        try {
            System.out.println("Сумма в массиве = " + calcArray(array) + "\n");
        } catch(MyArraySizeException e) {
            System.out.println("No sucess \n ");
        } catch(MyArrayDataException e) {
            System.out.println("No sucess \n ");
        }
    }

    public static int calcArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        if (arr.length != DIMENSION || arr[0].length != DIMENSION) {
            throw new MyArraySizeException("Размер массива не равен 4 х 4");
        };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.valueOf(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("В ячейке ["+i+','+j+"]=" + arr[i][j] + " -> не число...");
                }
            }
        };
        System.out.println("Сумма в массиве = " + sum);
        return sum;
    }

}
