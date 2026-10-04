package ru.otus.java.basic.homeworks.hw02;

import java.util.Arrays;

public class JavaFundamentals02 {
    public static void main(String[] args) {
        //printSting(4, "blah");
        //sumArray(new int[] { 1, 2, 3 }, new int[]{ 2, 2 },  new int[]{ 1, 1, 1, 1, 1 });

    }

    //1. Реализуйте метод, принимающий в качестве аргументов целое число и строку, и печатающий в консоль строку указанное количество раз.
    public static void printSting (int n, String s) {
        for (int i = 0; i < n; i++) {
            System.out.print(s);
        }
    }

    //2. Реализуйте метод, принимающий в качестве аргумента целочисленный массив, суммирующий все элементы, значение которых больше 5, и печатающий полученную сумму в консоль.
    public static void sumArrayElements (int [] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }

    //3. Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив; метод должен заполнить каждую ячейку массива указанным числом.
    public static void fillArray (int n, int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n;
        }
    }

    //4. Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив, увеличивающий каждый элемент массива на указанное число.
    public static void incrementArrayElements (int n, int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + n;
        }
    }

    //5. Реализуйте метод, принимающий в качестве аргумента целочисленный массив, и печатающий в консоль информацию о том, сумма элементов какой из половин массива больше.
    public static void compareArrayHalves (int [] arr) {
        int rightSum = 0;
        int leftSum = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            leftSum += arr[i];
        }
        for (int i = arr.length / 2 + 1; i < arr.length / 2; i++) {
            rightSum += arr[i];
        }
        if (leftSum > rightSum) {
            System.out.println("Сумма элементов левой половины массива больше.");
        }
        else if (leftSum < rightSum) {
            System.out.println("Сумма элементов правой половины массива больше.");
        } else {
            System.out.println("Суммы элементов левой и правой стороны равны.");
        }
    }

    //Задание со звёздочкой:
    //1. Реализуйте метод, принимающий на вход набор целочисленных массивов, и получающий новый массив, равный сумме входящих.
    public static void sumArray (int[]... arrs) {
        int maxLength = 0;
        for (int[] arr : arrs) {
            maxLength = Math.max(maxLength, arr.length);
        }
        int[] resultArray = new int[maxLength];

        for (int[] arr : arrs) {
            for (int i = 0; i < arr.length; i++) {
                resultArray[i] += arr[i];
            }
        }
        System.out.println(Arrays.toString(resultArray));
    }

}
