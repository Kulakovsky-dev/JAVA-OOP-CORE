package ru.geekbrains.java.oop.core.assertion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AssertThrowExample {

    @Test
    public void chekAssertThrows() {
        //try {
        //    Scanner scanner = new Scanner(new File("src/test/resources/file_test.txt"));
        //} catch (FileNotFoundException e) {
        //    e.printStackTrace();
        //}
        Assertions.assertThrows(
            FileNotFoundException.class,
                () -> new Scanner(new File("src/test/resources/file_t1st.txt"))
        );
    }

    @Test
    public void chekAssertThrowsFail() {
        Assertions.assertThrows(
                FileNotFoundException.class,
                () -> new Scanner(new File("src/test/resources/file_test.txt"))
        );
    }
}
