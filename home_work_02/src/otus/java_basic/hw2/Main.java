package otus.java_basic.hw2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr01 = new int[8];
        fillArrRandom(arr01, 7);
        int[] arr02 = new int[7];
        printStr("Hello world", 5);
        printSumArray(arr01);
        fillArr(arr02, 6);
       for (int n : arr02) {
           System.out.print(n);
       }
       incrArr(arr02, 2);
        System.out.println(" ");
        for (int n : arr02) {
            System.out.print(n);
        }
        System.out.println();
        sumHalfArr(arr01);
    }
    static void fillArrRandom (int[] arr, int n) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(n);
        }
    }

    static void printStr(String str, int n) {
       for  (int i = 0; i < n; i++) {
           System.out.println(str);
       }
    }
    static void printSumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
    static void fillArr(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n;
        }
    }
    static void incrArr(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += n;
        }
    }
    static void sumHalfArr(int[] arr) {
        int firstHalfSum = 0;
        int secondHalfSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length / 2) {
                firstHalfSum += arr[i];
            }  else {
                secondHalfSum += arr[i];
            }
        }
        if (firstHalfSum > secondHalfSum) {
            System.out.println("Сумма элементов первой из половин массива больше и равна " + firstHalfSum);
        }else {
            System.out.println("Сумма элементов второй из половин массива больше и равна " + secondHalfSum);
        }
    }
}
