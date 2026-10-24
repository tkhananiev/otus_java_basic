package ru.otus.java.basic.homeworks.hw06;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean isFull;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
    }

    public String getName() {
        return name;
    }

    public boolean eat(Plate plate) {
        if (plate.decreaseFood(appetite)) {
            isFull = true;
            return true;
        }
        return false;
    }

    public void info() {
        System.out.printf("Имя: %s%nСытый: %b%n", name, isFull);
    }
}
