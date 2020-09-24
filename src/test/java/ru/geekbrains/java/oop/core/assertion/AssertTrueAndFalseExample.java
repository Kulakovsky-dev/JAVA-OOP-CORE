package ru.geekbrains.java.oop.core.assertion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertTrueAndFalseExample {

    @Test
    public void chekTrue()
    {
        Assertions.assertTrue(true);
    }

    @Test
    public void chekTrueFail() {
        Assertions.assertTrue(false);
    }

    @Test
    public void chekFalse()
    {
        Assertions.assertFalse(false);
    }

    @Test
    public void chekFalseFail() {
        Assertions.assertFalse(true);
    }

    @Test
    public void chekNull()
    {   String text = null;
        Assertions.assertNull(text);
    }

    @Test
    public void chekNullFail() {
        String text = "null";
        Assertions.assertNull(text);
    }

    @Test
    public void chekNotNull()
    {   String text = "null";
        Assertions.assertNotNull(text);
    }

    @Test
    public void chekNotNullFail() {
        String text = null;
        Assertions.assertNotNull(text);
    }

    @Test
    public void fail() {
        Assertions.fail("Сработал Fail");
    }
}
