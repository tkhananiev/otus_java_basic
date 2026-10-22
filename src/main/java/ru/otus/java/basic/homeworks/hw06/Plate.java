package ru.otus.java.basic.homeworks.hw06;

public class Plate {
    private final int plateCapacity;
    private final int maxFood;
    private int currentFood;


    public Plate(int plateCapacity) {
        this.plateCapacity = plateCapacity;
        this.maxFood = plateCapacity;
        this.currentFood = maxFood;
    }

    public int getPlateCapacity() {
        return plateCapacity;
    }

    public int getMaxFood() {
        return maxFood;
    }

    public int getCurrentFood() {
        return currentFood;
    }

    public void increaseFood(int foodAmount) {
        if (currentFood + foodAmount > maxFood) {
            currentFood = maxFood;
        } else {
            currentFood += foodAmount;
        }
    }

    public boolean decreaseFood(int foodAmount) {
        if (currentFood - foodAmount < 0) {
            return false;
        }
        currentFood -= foodAmount;
        return true;
    }
}
