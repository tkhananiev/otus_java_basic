package ru.otus.java.basic.homeworks.hw04;

import java.time.Year;

public class User {

    private String name;
    private String surname;
    private String patronymic;
    private int yearOfBirth;
    private String email;

    public User(String name, String surname, String patronymic, int yearOfBirth, String email) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public int getAge() {
        return Year.now().getValue() - yearOfBirth;
    }
    public String getEmail() {
        return email;
    }
    public void printInfo() {
        System.out.printf("ФИО: %s %s %s\nГод рождения: %d\ne-mail: %s", surname, name, patronymic, yearOfBirth, email);
        System.out.println("\n");
    }

}
