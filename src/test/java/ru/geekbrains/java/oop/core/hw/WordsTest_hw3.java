package ru.geekbrains.java.oop.core.hw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

public class WordsTest_hw3 {
    String text = "Black White Red Green Blue Yellow Brown Cyan Cyan Magenta Grey Cyan White Orange Pink";
    String[] array = text.split(" ");
    List<String> list = Arrays.asList(array);
    Set<String> set = new HashSet<>(list);

    @DisplayName("Подсчет вхождений слова в тексте")
    @ParameterizedTest
    @MethodSource("dataProvider")
    public void chekWordsTest(String word, int count) {
        int frequency = Collections.frequency(list,word);
        Assertions.assertEquals(count, frequency);
    }
    private static Stream<Arguments> dataProvider() {
        return Stream.of (
                Arguments.of("Black",1),
                Arguments.of("Cyan",3),
                Arguments.of("White",2),
                Arguments.of("Grey",1)
        );
    }

}
