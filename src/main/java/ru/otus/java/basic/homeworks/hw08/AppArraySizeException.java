package ru.otus.java.basic.homeworks.hw08;

public class AppArraySizeException extends RuntimeException {
    public AppArraySizeException() {
        super("Array size not equal 4.");
    }
}
