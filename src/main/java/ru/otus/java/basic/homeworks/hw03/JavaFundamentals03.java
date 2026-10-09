package ru.otus.java.basic.homeworks.hw03;

public class JavaFundamentals03 {
    public static void main(String[] args) {
        printSquare(4);
        
    }

    public static int sumOfPositiveElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void matrixDiagonal(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j){
                    array[i][j] = 0;
                }
                if (j == array[i].length - i - 1){
                    array[i][j] = 0;
                }
            }
        }
    }

    public static int findMax(int[][] array){
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static int sumOfSecondRaw(int[][] array) {
        int sum = 0;
        if (array.length >= 2) {
            for (int i = 0; i < array[1].length; i++) {
                sum += array[1][i];
            }
            return sum;
        }
        return -1;
    }
}
