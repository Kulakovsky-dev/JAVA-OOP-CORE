package ru.geekbrains.java.oop.core.annotations.before.and.after;

import org.junit.jupiter.api.*;

public class TestExample extends BeforeConfigTest {

    @BeforeAll
    public static void beforeAll(){
        System.out.println("TestExample.beforeAll");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("TestExample.beforeEach");
    }

    @Test
    public void chekSumCorrect() {
        System.out.println("TestExample.chekSumCorrect");
        Assertions.assertEquals(2, 1+1);
    }

    @Test
    public void chekSumException() {
        System.out.println("TestExample.chekSumException");
        Assertions.assertEquals(3, 1+1);
    }

    @AfterEach
    public void afterEach() {
        System.out.println("TestExample.afterEach");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("TestExample.afterAll");
    }


}
