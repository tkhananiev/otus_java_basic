package ru.otus.java.basic.homeworks.hw05;

public class Dog extends Animal {
    public Dog(String name, int runSpeed, int swimSpeed, int endurance) {
        super(name, runSpeed, swimSpeed, endurance);
    }

    @Override
    public int swimRatePerM() {
        return 2;
    }
}
