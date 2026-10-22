package ru.otus.java.basic.homeworks.hw05;

public class Horse extends Animal {
    public Horse(String name, int runSpeed, int swimSpeed, int endurance) {
        super(name, runSpeed, swimSpeed, endurance);
    }

    @Override
    protected int swimRatePerM() {
        return 4;
    }
}
