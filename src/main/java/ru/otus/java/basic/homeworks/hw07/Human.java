package ru.otus.java.basic.homeworks.hw07;

import java.util.Objects;

public class Human {
    private String name;
    private Movable currentTransport;
    private double power;
    private double powerConsumption;
    double footPowerConsumption;
    double bicyclePowerConsumption;
    double requiredFootPower;

    public Human(String name, double power, double footPowerConsumption, double bicyclePowerConsumption) {
        this.name = name;
        this.power = power;
        this.footPowerConsumption = footPowerConsumption;
        this.bicyclePowerConsumption = bicyclePowerConsumption;
    }

    public String getName() {
        return name;
    }

    public Movable getCurrentTransport() {
        return currentTransport;
    }

    public double getPower() {
        return power;
    }

    public double getFootPowerConsumption() {
        return footPowerConsumption;
    }

    public double getBicyclePowerConsumption() {
        return bicyclePowerConsumption;
    }

    public boolean canCrossTerrain(Terrain terrain) {
        return switch (terrain) {
            case SWAMP -> false;
            default -> true;
        };
    }

    boolean hasEnoughFootPower(double distance) {
        requiredFootPower = distance * footPowerConsumption / 100;
        if (requiredFootPower > power) {
            System.out.println("Не дойду пешком");
            return false;
        }
        System.out.println("И пешком можно!");
        return true;
    }

    public double decreasePower(double distance) {
        if (currentTransport instanceof Bicycle) {
            this.power -= distance * this.bicyclePowerConsumption / 100;
        } else if (Objects.isNull(currentTransport)) {
            this.power -= distance * this.footPowerConsumption / 100;
        }
        return this.power;
    }

    public void boardOnTransport(Movable transport) {
        if (this.currentTransport != null) {
            System.out.println("Сначала сойди с того, на чем сидишь...");
        } else {
            if (transport instanceof Bicycle) {
                if (((Bicycle) transport).getRider() != null) {
                    System.out.println("Велосипед занят.");
                    return;
                } else {
                    ((Bicycle) transport).setRider(this);
                }
            }
            this.currentTransport = transport;
            System.out.println("Поедем на " + transport.getClass().getSimpleName());
        }
    }

    public void getOffTransport() {
        if (this.currentTransport != null) {
            if (this.currentTransport instanceof Bicycle) {
                ((Bicycle) this.currentTransport).clearRider();
            }
            this.currentTransport = null;
        }
        System.out.println("Теперь пешком.");
    }

    public boolean move(double distance, Terrain terrain) {
        if (distance <= 0) {
            System.out.println("Дистанция не может быть отрицательной или нулевой.");
            return false;
        }
        if (this.currentTransport == null) {
            if (!hasEnoughFootPower(distance)) {
                return false;
            } else {
                System.out.println("Пойду пешком.");
                decreasePower(distance);
                return true;
            }
        }
        return currentTransport.move(distance, terrain);
    }
}
