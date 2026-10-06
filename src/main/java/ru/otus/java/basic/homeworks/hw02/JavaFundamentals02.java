package ru.otus.java.basic.homeworks.hw02;

import java.util.Arrays;

public class JavaFundamentals02 {
    public static void main(String[] args) {
        printString(4, "blah");
        sumArrayElements(new int[]{1, 8, 3, 4, 5, 9, 67});
        fillArray(7, new int[]{0, 0, 0, 0});
        incrementArrayElements(8, new int[]{7, 5, 4, 2, 0, 9});
        compareArrayHalves(new int[]{11, 7, 4, 4, 9, 3, 6});

        sumArrays(new int[]{1, 2, 3}, new int[]{2, 2}, new int[]{1, 1, 1, 1, 1});
        System.out.println(hasBalancePoint(new int[]{1, 1, 1, 1, 1, 5}));
        System.out.println(isSorted(new int[]{5, 1, 4, 2, 8}, true));
        reverseArray(new int[]{5, 1, 4, 2, 8});
        reverseArray(new int[]{11, 7, 4, 4, 9, 3, 6});
        reverseArray(new int[]{5, 1, 2, 8});

    }

    public static void printString(int n, String s) {
        for (int i = 0; i < n; i++) {
            System.out.print(s);
        }
        System.out.println();
    }

    public static void sumArrayElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }

    public static void fillArray(int n, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void incrementArrayElements(int n, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + n;
        }
        System.out.println(Arrays.toString(arr));
    }

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

    public static boolean isSorted(int[] arr, boolean ascending) {
        for (int i = 1; i < arr.length; i++) {
            if (ascending && arr[i - 1] > arr[i]) {
                return false;
            }
            if (!ascending && arr[i - 1] < arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}