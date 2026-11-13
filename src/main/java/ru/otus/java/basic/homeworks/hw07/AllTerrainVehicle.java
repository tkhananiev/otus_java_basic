package ru.otus.java.basic.homeworks.hw07;

public class AllTerrainVehicle extends Motorized {
    public AllTerrainVehicle(double fuel, double fuelConsumption) {
        super(fuel, fuelConsumption);
    }

    @Override
    public boolean canCrossTerrain(Terrain terrain) {
        return true;
    }
}
