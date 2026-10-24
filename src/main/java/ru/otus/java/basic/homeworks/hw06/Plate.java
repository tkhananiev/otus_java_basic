package ru.otus.java.basic.homeworks.hw06;

public class Plate {
    private final int capacity;
    private int currentFood;


    public Plate(int capacity) {
        this.capacity = capacity;
        this.currentFood = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCurrentFood() {
        return currentFood;
    }

    public void increaseFood(int foodAmount) {
        if (currentFood + foodAmount > capacity) {
            currentFood = capacity;
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
