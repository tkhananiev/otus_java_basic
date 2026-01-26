package otus.java.basic.hw5;
public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Murzik", 10, 50),
                new Dog("Bobik", 12, 4, 60),
                new Horse("Buyan", 15, 3, 120)
        };
        for (Animal animal : animals) {
            System.out.println("----- " + animal.getName() + " -----");

            animal.run(20);
            animal.swim(10);

            animal.info();
            System.out.println();
        }

    }
}
