package otus.java.basic.hw5;

public class Dog extends Animal {
    public Dog(String name, int runSpeed, int swimSpeed, int endurance) {
        super(name, runSpeed, swimSpeed, endurance);
    }
    @Override
    protected  int swimRatePerM() {
        return 2;
    }
}
