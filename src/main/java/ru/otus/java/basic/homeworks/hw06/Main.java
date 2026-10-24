package ru.otus.java.basic.homeworks.hw06;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(25);
        Cat[] cats = {
                new Cat("Murzik", 5),
                new Cat("Barsik", 8),
                new Cat("Vaska", 12),
                new Cat("Pushok", 7),
                new Cat("Timofey", 10),
                new Cat("Ryzhik", 3),
                new Cat("Snezhok", 4)
        };

        for (Cat cat : cats) {
            System.out.println("----- " + cat.getName() + " -----");
            cat.eat(plate);
            cat.info();
        }
    }
}
