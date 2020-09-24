package ru.geekbrains.java.oop.core.annotations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class TimeOutExample {

    @Test
    public void chekSumCorrect() {
        Assertions.assertEquals(2, 1+1);
    }

    @Timeout(value = 1500,unit = TimeUnit.MILLISECONDS)
    @Test
    public void chekSumException() throws InterruptedException {
        sleep(2000);
        Assertions.assertEquals(3, 1+1);
    }
}
