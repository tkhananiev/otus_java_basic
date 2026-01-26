package otus.java.basic.hw5;

public abstract class Animal {
    private String name;
    private int runSpeed;
    private int swimSpeed;
    protected int endurance;
    protected boolean tired;

    protected Animal(String name, int runSpeed, int swimSpeed, int endurance) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.endurance = endurance;
    }

    protected int runRatetPerM() {
        return 1;
    }
    protected int swimRatePerM() {
        return 1;
    }

    protected double run(int distance){
        int rate = distance * runRatetPerM();
        double time = (double) distance / runSpeed;
        if (endurance < rate){
            tired = true;
            System.out.println(name + " устал.");
            return -1;
        }
        endurance -= rate;
        return time;

    }
    protected double swim(int distance){
        int rate = distance * swimRatePerM();
        double time = (double) distance / swimSpeed;
        if (endurance < rate){
            tired = true;
            System.out.println(name + " устал.");
            return -1;
        }
        endurance -= rate;
        return time;
    }

    public void info(){
        System.out.println("Имя: " + this.name +
                "\nСкорось бега: " + this.runSpeed +
                "\nСкорость плавания:  " + this.swimSpeed +
                "\nВыносливость:  " + this.endurance +
                "\nУсталость: " + this.tired);
    }

}
