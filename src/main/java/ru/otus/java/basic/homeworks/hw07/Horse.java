package ru.otus.java.basic.homeworks.hw07;

public class Horse implements Movable {
    double power;
    double powerConsumption;
    double requiredPower;

    public Horse(double power, double powerConsumption) {
        this.power = power;
        this.powerConsumption = powerConsumption;
    }

    boolean hasEnoughPower(double distance) {
        requiredPower = distance * powerConsumption / 100;
        if (requiredPower > power) {
            System.out.println("Не хватит моих лошадиных сил на такую дорогу...");
            return false;
        }
        System.out.println("Сил полно!");
        return true;
    }

    public boolean canCrossTerrain(Terrain terrain) {
        switch (terrain) {
            case SWAMP -> {
                System.out.println("Не по моим копытам местность");
                return false;
            }
            default -> {
                System.out.println("Проскачем!");
                return true;
            }
        }
    }

    public double getPower() {
        return power;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public double decreasePower() {
        return power -= requiredPower;
    }

    @Override
    public boolean move(double distance, Terrain terrain) {
        if (canCrossTerrain(terrain) && hasEnoughPower(distance)) {
            System.out.println("Поскакали!");
            decreasePower();
            return true;
        }
        return false;
    }
}
