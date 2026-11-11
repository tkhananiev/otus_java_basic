package ru.otus.java.basic.homeworks.hw07;

import java.util.Objects;

public class Bicycle implements Movable {

    Human human;

    public Bicycle(Human human) {
        this.human = human;
    }

    boolean hasEnoughHumanPower(double distance) {
        double requiredPower = distance * human.getBicyclePowerConsumption() / 100;
        if (requiredPower > human.getPower()) {
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

    public double decreaseHumanPower(Human human, double distance) {
        return human.decreasePower(distance);

    }

    @Override
    public boolean move(double distance, Terrain terrain) {
        if (canCrossTerrain(terrain) && hasEnoughHumanPower(distance)) {
            System.out.println("Крути педали!");
            human.decreasePower(distance);
            return true;
        }
        return false;
    }
}
