package ru.otus.java.basic.homeworks.hw05;

public class Cat extends Animal {

    public Cat(String name, int runSpeed, int endurance) {
        super(name, runSpeed, endurance);
    }
    @Override
    public int swimRatePerM(){
        System.out.println(getName() + " плавать не умеет");
        return 0;
    }

}
