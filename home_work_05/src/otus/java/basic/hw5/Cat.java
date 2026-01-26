package otus.java.basic.hw5;

public class Cat extends Animal {
    public Cat(String name, int runSpeed, int endurance) {
        super(name, runSpeed, 0, endurance);
    }
    @Override
    public double swim(int distance) {
        System.out.println(getName() + " плавать не умеет.");
        return -1;
    }
}
