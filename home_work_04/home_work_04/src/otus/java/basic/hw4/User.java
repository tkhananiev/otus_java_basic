package otus.java.basic.hw4;

import java.time.LocalDate;

public class User {
    private String firstName;
    private String lastName;
    private String patronymic;
    public int yearOfBirth;
    private  String email;

    public User(String firstName, String lastName, String patronymic, int yearOfBirth, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getEmail() {
        return email;
    }
    public void info() {
        System.out.println("ФИО: " + firstName + " " + lastName + " " + patronymic);
        System.out.println("Год рождения: " + yearOfBirth);
        System.out.println("e-mail: " + email);
    }
    public int getAge(){
        return LocalDate.now().getYear() -  yearOfBirth;
    }
}
