package otus.java.basic.hw4;

public class Main {
    public static void main(String[] args) {

        User[]  users = new User[10];
        users[0] = new User("Ivan", "Ivanov", "Ivanovich", 1990, "ivanov@mail.com");
        users[1] = new User("Petr", "Petrov", "Petrovich", 1985, "petrov@mail.com");
        users[2] = new User("Sergey", "Sidorov", "Alekseevich", 1968, "sidorov@mail.com");
        users[3] = new User("Anna", "Smirnova", "Vladimirovna", 1998, "smirnova@mail.com");
        users[4] = new User("Maria", "Kuznetsova", "Igorevna", 1995, "kuznetsova@mail.com");
        users[5] = new User("Alexey", "Popov", "Nikolaevich", 1975, "popov@mail.com");
        users[6] = new User("Olga", "Vasilyeva", "Sergeevna", 1993, "vasilyeva@mail.com");
        users[7] = new User("Dmitry", "Novikov", "Olegovich", 1982, "novikov@mail.com");
        users[8] = new User("Ekaterina", "Fedorova", "Mikhailovna", 2000, "fedorova@mail.com");
        users[9] = new User("Maxim", "Morozov", "Andreevich", 1996, "morozov@mail.com");

        for (User user : users) {
            if (user.getAge() > 40) {
                user.info();
                System.out.println("------------");
            }

        }

        Box box = new Box(20, 15, "black");
        box.openBox();
        box.putItem();
        box.extractItem();

        System.out.println("------------");

        box.info();

    }
}
