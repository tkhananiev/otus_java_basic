package ru.otus.java.basic.homeworks.hw07;

public class Car extends Motorized {

    public Car(double fuel, double fuelConsumption) {
        super(fuel, fuelConsumption);
    }

    @Override
    public boolean canCrossTerrain(Terrain terrain) {
        switch (terrain) {
            case DENSE_FOREST, SWAMP -> {
                System.out.println("Непроходимая местность!");
                return false;
            }
            default -> {
                System.out.println("Проедем по этой местности!");
                return true;
            }
        }
    }
}