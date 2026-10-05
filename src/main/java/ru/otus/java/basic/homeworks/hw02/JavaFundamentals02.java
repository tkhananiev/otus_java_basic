package ru.otus.java.basic.homeworks.hw02;

import java.util.Arrays;

public class JavaFundamentals02 {
    public static void main(String[] args) {
        printString(4, "blah"); //1
        sumArrayElements(new int[]{1, 8, 3, 4, 5, 9, 67}); //2
        fillArray(7, new int[]{0, 0, 0, 0});  //3
        incrementArrayElements(8, new int[]{7, 5, 4, 2, 0, 9}); //4
        compareArrayHalves(new int[]{11, 7, 4, 4, 9, 3, 6}); //5

        //Bonus tasks
        sumArrays(new int[]{1, 2, 3}, new int[]{2, 2}, new int[]{1, 1, 1, 1, 1}); //1
        System.out.println(hasBalancePoint(new int[]{1, 1, 1, 1, 1, 5})); //2
        sortArray(new int[]{5, 1, 4, 2, 8}); //3
        reverseArray(new int[]{1, 2, 3, 4}); //4

    }

    //1. Реализуйте метод, принимающий в качестве аргументов целое число и строку, и печатающий в консоль строку указанное количество раз.
    public static void printString(int n, String s) {
        for (int i = 0; i < n; i++) {
            System.out.print(s);
        }
    }

    //2. Реализуйте метод, принимающий в качестве аргумента целочисленный массив, суммирующий все элементы, значение которых больше 5, и печатающий полученную сумму в консоль.
    public static void sumArrayElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }

    //3. Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив; метод должен заполнить каждую ячейку массива указанным числом.
    public static void fillArray(int n, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n;
        }
        System.out.println(Arrays.toString(arr));
    }

    //4. Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив, увеличивающий каждый элемент массива на указанное число.
    public static void incrementArrayElements(int n, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + n;
        }
        System.out.println(Arrays.toString(arr));
    }

    //5. Реализуйте метод, принимающий в качестве аргумента целочисленный массив, и печатающий в консоль информацию о том, сумма элементов какой из половин массива больше.
    public static void compareArrayHalves(int[] arr) {
        int rightSum = 0;
        int leftSum = 0;
        int half = arr.length / 2;
        for (int i = 0; i < half; i++) {
            leftSum += arr[i];
        }
        for (int i = half; i < arr.length; i++) {
            rightSum += arr[i];
        }
        if (leftSum > rightSum) {
            System.out.println("Сумма элементов левой половины массива больше.");
        } else if (leftSum < rightSum) {
            System.out.println("Сумма элементов правой половины массива больше.");
        } else {
            System.out.println("Суммы элементов левой и правой стороны равны.");
        }
    }

    //Задание со звёздочкой:
    //1. Реализуйте метод, принимающий на вход набор целочисленных массивов, и получающий новый массив, равный сумме входящих.
    public static void sumArrays(int[]... arrs) {
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

    //2. Реализуйте метод, проверяющий, что есть “точка” в массиве, в которой суммы левой и правой частей равны. “Точка” находится между элементами.
    public static boolean hasBalancePoint(int[] arr) {

        int totalSum = 0;
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        for (int i = 0; i < arr.length - 1; i++) {
            leftSum += arr[i];
            rightSum = totalSum - leftSum;
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }

    //3. Реализуйте метод, проверяющий, что все элементы массива идут в порядке убывания или возрастания (по выбору пользователя).
    public static void sortArray(int[] arr) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int swap = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = swap;
                    swapped = true;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // 4. Реализуйте метод, “переворачивающий” входящий массив. Пример: `{ 1 2 3 4 } => { 4 3 2 1 }`
    public static void reverseArray(int[] arr) {
        int[] resultArray = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            resultArray[i] = arr[arr.length - i - 1];
        }
        System.out.println(Arrays.toString(resultArray));
    }
}