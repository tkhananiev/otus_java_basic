package ru.otus.java.basic.homeworks.hw07;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Tim", 100, 10, 5);
        Car car = new Car(20, 10);
        Horse horse = new Horse(40, 10);
        Bicycle bicycle = new Bicycle(human);
        AllTerrainVehicle atv = new AllTerrainVehicle(30, 10);

        System.out.println("----- Walk -----");
        System.out.println(human.move(20, Terrain.PLAIN));

        System.out.println("----- Car -----");
        human.boardOnTransport(car);
        human.boardOnTransport(horse);
        System.out.println(human.move(50, Terrain.PLAIN));
        System.out.println(human.move(10, Terrain.SWAMP));
        System.out.println(human.move(10, Terrain.DENSE_FOREST));
        human.getOffTransport();

        System.out.println("----- Horse -----");
        human.boardOnTransport(horse);
        System.out.println(human.move(10, Terrain.SWAMP));
        System.out.println(human.move(50, Terrain.PLAIN));
        human.getOffTransport();

        System.out.println("----- Bicycle -----");
        human.boardOnTransport(bicycle);
        System.out.println(human.move(10, Terrain.SWAMP));
        System.out.println(human.move(50, Terrain.PLAIN));
        human.getOffTransport();

        System.out.println("----- ATV -----");
        human.boardOnTransport(atv);
        System.out.println(human.move(10, Terrain.SWAMP));
        System.out.println(human.move(10, Terrain.DENSE_FOREST));
        human.getOffTransport();

        System.out.println("----- Too far on foot -----");
        System.out.println(human.move(2000, Terrain.PLAIN));
    }
}
