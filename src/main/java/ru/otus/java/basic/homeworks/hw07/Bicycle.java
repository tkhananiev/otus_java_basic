package ru.otus.java.basic.homeworks.hw07;

import java.util.Objects;

public class Bicycle implements Movable {

    Human rider;

    boolean hasEnoughHumanPower(double distance) {
        double requiredPower = distance * rider.getBicyclePowerConsumption() / 100;
        if (requiredPower > rider.getPower()) {
            System.out.println("Не хватит на такую дорогу...");
            return false;
        } else {
            System.out.println("Сил полно!");
            return true;
        }
    }

    public boolean canCrossTerrain(Terrain terrain) {
        switch (terrain) {
            case SWAMP -> {
                System.out.println("По болотам на велике вряд ли...");
                return false;
            }
            default -> {
                System.out.println("Ну если болот нет, то проедем.");
                return true;
            }
        }
    }

    public void setRider(Human rider) {
        this.rider = rider;
    }

    public void clearRider() {
        rider = null;
    }

    public Human getRider() {
        return rider;
    }

    @Override
    public boolean move(double distance, Terrain terrain) {
        if (distance <= 0) {
            System.out.println("Дистанция не может быть отрицательной или нулевой.");
            return false;
        }
        if (canCrossTerrain(terrain) && hasEnoughHumanPower(distance)) {
            System.out.println("Крути педали!");
            rider.decreasePower(distance);
            return true;
        }
        return false;
    }
}
