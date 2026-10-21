package ru.otus.java.basic.homeworks.hw05;

/*
1. Создайте классы `Cat`, `Dog` и `Horse` с наследованием от класса `Animal`.
2. У каждого животного есть имя, скорость бега и плавания (м/с) и выносливость (измеряется в условных единицах).
3. Затраты выносливости:
   - все животные на 1 метр бега тратят 1 единицу выносливости;
   - собаки на 1 метр плавания тратят 2 единицы;
   - лошади на 1 метр плавания тратят 4 единицы;
   - кот плавать не умеет.
4. Реализуйте методы `run(int distance)` и `swim(int distance)`. Они должны возвращать время, затраченное на указанное действие, и понижать выносливость животного. Если выносливости не хватает, возвращайте время `-1` и указывайте, что у животного появилось состояние усталости. При выполнении действий пишите сообщения в консоль.
5. Добавьте метод `info()`, который выводит в консоль состояние животного.
 */
public abstract class Animal {
    private String name;
    private int runSpeed;
    private int swimSpeed;
    private int endurance;
    private boolean  canSwim;
    public boolean tired;

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

    protected int runRatePerM(){
        return 1;
    }

    public int swimRatePerM(){
        return 0;
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
        System.out.println(name + " пробежал " + distance + " метров за " + time);
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
            System.out.println(name + " проплыл " + distance + " метров за " + time);
            return time;
        } else {
            System.out.println(getName() + " плавать не умеет.");
            return -1;
        }
    }

    public void info() {
        System.out.println("Имя: " + this.name +
                "\nСкорость бега: " + this.runSpeed +
                "\nСкорость плавания:  " + this.swimSpeed +
                "\nВыносливость:  " + this.endurance +
                "\nУсталость: " + this.tired);
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
