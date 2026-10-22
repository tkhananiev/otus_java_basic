package ru.otus.java.basic.homeworks.hw05;

public class Cat extends Animal {

    public Cat(String name, int runSpeed, int endurance) {
        super(name, runSpeed, endurance);
    }
    @Override
    public double swim(int distance) {
        System.out.println(getName() + " плавать не умеет.");
        return -1;
    }
}
