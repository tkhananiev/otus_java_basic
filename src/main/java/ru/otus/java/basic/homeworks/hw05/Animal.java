package ru.otus.java.basic.homeworks.hw05;

public abstract class Animal {
    private String name;
    private int runSpeed;
    private int swimSpeed;
    private int endurance;
    private boolean canSwim;
    private boolean tired;

    protected Animal(String name, int runSpeed, int swimSpeed, int endurance) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.endurance = endurance;
        this.canSwim = true;
    }

    protected Animal(String name, int runSpeed, int endurance) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.endurance = endurance;
    }

    protected int runRatePerM() {
        return 1;
    }

    protected int swimRatePerM() {
        return 1;
    }

    public double run(int distance) {
        int rate = distance * runRatePerM();
        double time = (double) distance / runSpeed;
        if (endurance < rate) {
            tired = true;
            System.out.println(name + " устал.");
            return -1;
        }
        endurance -= rate;
        System.out.printf("%s пробежал %d метров за %.1f секунды\n", name, distance, time);
        return time;

    }

    public double swim(int distance) {
        if (this.canSwim) {
            int rate = distance * swimRatePerM();
            double time = (double) distance / swimSpeed;
            if (endurance < rate) {
                tired = true;
                System.out.println(name + " устал.");
                return -1;
            }
            endurance -= rate;
            System.out.printf("%s проплыл %d метров за %.1f секунды\n", name, distance, time);
            return time;
        } else {
            System.out.println(getName() + " плавать не умеет.");
            return -1;
        }
    }

    public void info() {
        System.out.printf("Имя: %s\nСкорость бега: %d\nСкорость плавания: %d\nВыносливость: %d\nУсталость: %b\n",
                this.name, this.runSpeed, this.swimSpeed, this.endurance, this.tired);
    }

    public String getName() {
        return name;
    }

    public int getRunSpeed() {
        return runSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public int getEndurance() {
        return endurance;
    }
}
