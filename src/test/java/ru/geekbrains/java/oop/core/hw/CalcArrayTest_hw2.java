package ru.geekbrains.java.oop.core.hw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.java.oop.core.lesson2.homework.MyArrayDataException;
import ru.geekbrains.java.oop.core.lesson2.homework.MyArraySizeException;

import static ru.geekbrains.java.oop.core.lesson2.homework.Start.calcArray;

@DisplayName("Подсчет суммы ячеек двумерного массива")
public class CalcArrayTest_hw2 {
    String[][] array1 = new String[][] {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
    String[][] array2 = new String[][] {{"1", "2", "A", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
    String[][] array3 = new String[][] {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}};
    String[][] array4 = new String[][] {{"1", "2", "3"}, {"5", "6", "7"}, {"9", "10", "11"}, {"13", "14", "15"}};

    @DisplayName("Нормальный массив, сумма 136")
    @Test
    public void chekArrayTest1() {
        String[][] array = array1;
        Assertions.assertEquals(136, calcArray(array));
    }
    @DisplayName("Несовпадение суммы, тест fail")
    @Test
    public void chekArrayTest1fail() {
        String[][] array = array1;
        Assertions.assertEquals(135, calcArray(array));
    }
    @DisplayName("В массиве имеется не число")
    @Test
    public void chekArrayTest2fail() {
        String[][] array = array2;
        Assertions.assertThrows(MyArrayDataException.class,() ->  calcArray(array));
    }
    @DisplayName("Неверный размер массива")
    @Test
    public void chekArrayTest3fail() {
        String[][] array = array3;
        Assertions.assertThrows(MyArraySizeException.class,() ->  calcArray(array));
    }
    @DisplayName("Неверный размер массива...")
    @Test
    public void chekArrayTest4fail() {
        String[][] array = array4;
        Assertions.assertThrows(MyArraySizeException.class,() ->  calcArray(array));
    }
}
