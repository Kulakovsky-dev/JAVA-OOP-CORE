package ru.geekbrains.java.oop.core.lesson7.online.compare;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringSorterTest {

    @Test
    void sort() {

        List<String> list = new ArrayList<>();
        list.add("A1");
        list.add("C22");
        list.add("B4444");

        StringSorter stringSorter = new StringSorter();
        List<String> sorted = stringSorter.sort(list);
        System.out.println(sorted);

        Assertions.assertEquals("A1", sorted.get(0));
        Assertions.assertEquals("B4444", sorted.get(1));
        Assertions.assertEquals("C22", sorted.get(2));
        Assertions.assertEquals(3, sorted.size());

        org.assertj.core.api.Assertions.assertThat(sorted)
                .containsExactly("A1","B4444","C22");
    }

    @Test
    void sortByLength() {
        List<String> list = new ArrayList<>();
        list.add("A1");
        list.add("C22");
        list.add("B4444");

        StringSorter stringSorter = new StringSorter();
        List<String> sorted = stringSorter.sortByLength(list);
        System.out.println(sorted);
    }

    @Test
    void sortByLength_J8() {
        List<String> list = new ArrayList<>();
        list.add("A1");
        list.add("C22");
        list.add("B4444");

        StringSorter stringSorter = new StringSorter();
        List<String> sorted = stringSorter.sortByLength_J8(list);
        System.out.println(sorted);
    }

    @Test
    void sortByLength_2() {
        List<String> list = new ArrayList<>();
        list.add("A1");
        list.add("C22");
        list.add("B4444");

        StringSorter stringSorter = new StringSorter();
        List<String> sorted = stringSorter.sortByLength_2(list);
        System.out.println(sorted);
    }

    @Test
    void sortByLength_Reversed() {
        List<String> list = new ArrayList<>();
        list.add("A1");
        list.add("C22");
        list.add("B4444");

        StringSorter stringSorter = new StringSorter();
        List<String> sorted = stringSorter.sortByLength_Reversed(list);
        System.out.println(sorted);
    }

    @Test
    void genericQuiz() {

        List<String> list1 = new ArrayList();
        List<String> list2 = new ArrayList<>();
        List strings = new ArrayList<String>();
        List<Integer> integers = new ArrayList<Integer>();
        integers.add(0);
        strings.add("Hello");
        integers.addAll(strings);
        System.out.println(integers);

        //List<Number> list5 = new ArrayList<Long>();  // запрещено
        //List<Long> list6 = new ArrayList<Number>();  // запрещено
    }
}