package ru.otus.java.basic.homeworks.hw04;

import java.time.*;

public class Main {
    public static void main(String[] args) {

        User[] users = {new User("Иван", "Иванов", "Иванович", 1975, "ivanov@mail.ru"),
                new User("Мария", "Петрова", "Сергеевна", 1990, "petrova@mail.ru"),
                new User("Алексей", "Сидоров", "Николаевич", 1962, "sidorov@mail.ru"),
                new User("Елена", " Кузнецова", "Викторовна", 1988, "kuznetsova@mail.ru"),
                new User("Дмитрий", "Смирнов", "Андреевич", 1955, "smirnov@mail.ru"),
                new User("Анна", "Волкова", "Павловна", 1999, "volkova@mail.ru"),
                new User("Сергей ", "Морозов", "Олегович", 1971, "morozov@mail.ru"),
                new User("Ольга", "Новикова", "Дмитриевна", 1983, "novikova@mail.ru"),
                new User("Павел", "Фёдоров", "Игоревич", 1968, "fedorov@mail.ru"),
                new User("Наталья ", "Соколова", "Алексеевна", 2001, "sokolova@mail.ru")
        };

        for (User user : users) {
            if (user.getAge() > 40) {
                user.printInfo();
            }
        }
    }
}
