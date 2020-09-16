package ru.geekbrains.java.oop.core.lesson2.homework;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException() {
    }
    public MyArraySizeException(String message) {
        System.out.println(message);
    }
    public MyArraySizeException(String message, Throwable cause) { super(message, cause); }
    public MyArraySizeException(Throwable cause) {
        super(cause);
    }
    public MyArraySizeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
