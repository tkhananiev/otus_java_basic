package ru.otus.java.basic.homeworks.hw01;

import java.util.Random;
import java.util.Scanner;

public class JavaFundamentals01 {
    public static void main(String[] args) {

        greetings();
        checkSign(6, 7, 8);
        selectColor();
        compareNumbers();
        addOrSubtractAndPrint(7, 7, false);

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5 ");
        String choice;
        String regex = "[1-5]";
        int a, b, c;
        a = new Random().nextInt(-10, 11);
        b = new Random().nextInt(-10, 11);
        c = new Random().nextInt(-10, 11);
        boolean increment = Math.random() > 0.5;

        while (true) {
            choice = sc.nextLine();
            if (choice.matches(regex)) {
                switch (choice) {
                    case "1" -> greetings();
                    case "2" -> checkSign(a, b, c);
                    case "3" -> selectColor();
                    case "4" -> compareNumbers();
                    case "5" ->  addOrSubtractAndPrint(a, b, increment);
                }
                break;
            }
            else if (choice.equals("exit")) {
                break;
            } else {
                System.out.println("Введите число от 1 до 5");
            }
        }
    }

    public static void greetings(){
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    public static void checkSign(int a, int b, int c){
        int sum = a+b+c;
        if (sum >= 0){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor(){
        int data = 5;
        if (data <= 10){
            System.out.println("Красный");
        }
        else if (data <= 20){
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(){
        int a = 8;
        int b = 9;
        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment){
        if (increment){
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }
}
