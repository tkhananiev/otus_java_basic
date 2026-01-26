package otus.java.basic.hw5;

public class Cat extends Animal {
    public Cat(String name, int runSpeed, int swimSpeed, int endurance) {
        super(name, runSpeed, swimSpeed, endurance);
    }
    @Override
    protected double swim(int distance) {
        System.out.println(getName() + " плавать не умеет.");
        return 0;
    }
}
