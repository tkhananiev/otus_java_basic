package otus.java_basic.hw3;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[][] myArr = new int[12][12];
        //Заполняем массив рандомными значениями
        fillArrRandom(myArr);
        System.out.println(sumOfPositiveElements(myArr));

        //Респечатываем квадрат
        printSquare(8);

        //Зануляем диагонали и выводим в консоль
        setDiagonalToZero(myArr);
        for (int i = 0; i < myArr.length; i++) {
            System.out.println(Arrays.toString(myArr[i]));
        }

        //Находим и выводим максимум
        System.out.println(findMax(myArr));

        //Суммируем элементы второго столбца
        System.out.println("Сумма элементов второго столбца = " + secondRawSum(myArr));

    }
    // Метод для заполнения массива рандомными значениями
    static void fillArrRandom (int[][] arr){
        Random random = new Random();
        int i, j;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(arr.length);
            }
        }
    }


    /* Реализовать метод sumOfPositiveElements(..), принимающий в качестве аргумента
     целочисленный двумерный массив, метод должен посчитать и вернуть
     сумму всех элементов массива, которые больше 0;
     */
    static int sumOfPositiveElements(int[][] arr){
        int sum = 0;
        int i, j;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                if  (arr[i][j] > 0) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    /*
    Реализовать метод, который принимает в качестве аргумента int size
    и печатает в консоль квадрат из символов * со сторонами соответствующей длины;
     */
    static void printSquare(int size){
        System.out.println("*  ".repeat(size));
        for  (int n = 1; n <= size - 2; n++) {
            System.out.println("*" + "   ".repeat(size - 2) + "  *");
        }
        System.out.println("*  ".repeat(size));
    }

    /*
    Реализовать метод, принимающий в качестве аргумента двумерный целочисленный массив,
    и зануляющий его диагональные элементы (можете выбрать любую из диагоналей, или занулить обе);
     */
    static void setDiagonalToZero (int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if  ((arr[i] == arr[j]) || j == arr[i].length - 1 - i){
                    arr[i][j] = 0;
                }
            }
        }
    }

    /*
    Реализовать метод findMax(int[][] array) который должен найти и вернуть максимальный элемент массива;
     */

    static int findMax(int[][] arr){
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if  (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    /*
    Реализуйте метод, который считает сумму элементов второй строки двумерного массива,
    если второй строки не существует, то в качестве результата необходимо вернуть -1
     */
    static int secondRawSum (int[][] arr){
        int sum = 0;
        if (arr.length >= 2) {
            for (int i = 0; i < arr[1].length; i++){
                sum += arr[1][i];
            }
        }
        else return -1;
        return sum;
    }
}
