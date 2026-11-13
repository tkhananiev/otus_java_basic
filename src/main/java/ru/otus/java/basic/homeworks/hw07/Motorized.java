package ru.otus.java.basic.homeworks.hw07;

public abstract class Motorized implements Movable {
    double fuel;
    double fuelConsumption; // Расход топлива в литрах на 100 км
    double requiredFuel;

    public Motorized(double fuel, double fuelConsumption) {
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
    }

    boolean hasEnoughFuel(double distance) {
        requiredFuel = distance * fuelConsumption / 100;
        if (requiredFuel > fuel) {
            System.out.println("Недостаточно топлива!");
            return false;
        }
        System.out.println("Топлива хватит на весь путь!");
        return true;
    }

    abstract boolean canCrossTerrain(Terrain terrain);

    @Override
    public boolean move(double distance, Terrain terrain) {
        if (distance <= 0) {
            System.out.println("Дистанция не может быть отрицательной или нулевой.");
            return false;
        }
        if (canCrossTerrain(terrain) && hasEnoughFuel(distance)) {
            System.out.println("Поехали!");
            decreaseFuel();
            return true;
        }
        return false;
    }

    public double decreaseFuel() {
        return fuel -= requiredFuel;
    }

    public double getFuel() {
        return fuel;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }
}
