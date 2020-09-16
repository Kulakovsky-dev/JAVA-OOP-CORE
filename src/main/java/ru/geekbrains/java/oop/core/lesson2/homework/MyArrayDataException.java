package ru.geekbrains.java.oop.core.lesson2.homework;

public class MyArrayDataException extends RuntimeException{
    public MyArrayDataException() {
    }
    public MyArrayDataException(String message) {
        System.out.println(message);
    }
    public MyArrayDataException(String message, Throwable cause) {
        super(message, cause);
    }
    public MyArrayDataException(Throwable cause) {
        super(cause);
    }
    public MyArrayDataException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
