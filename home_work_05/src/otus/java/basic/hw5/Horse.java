package otus.java.basic.hw5;

public class Horse extends Animal {
    public Horse(String name, int runSpeed, int swimSpeed, int endurance) {
        super(name, runSpeed, swimSpeed, endurance);
    }
    @Override
    protected  int swimRatePerM() {
        return 4;
    }
}
