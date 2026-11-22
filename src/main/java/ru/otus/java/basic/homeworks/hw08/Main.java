package ru.otus.java.basic.homeworks.hw08;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][] arr = new String[][]{{"1", "5", "4", "gf"}, {"9", "3", "54", "6"}, {"7", "5", "8", "3"}, {"40", "8", "1", "9"}};
        try {
            sumArrValues(arr);
        } catch (AppArraySizeException | AppArrayDataException ex) {
            System.out.println(ex.fillInStackTrace());
        }

        System.out.println("Конец программы.");

    }

    public static void sumArrValues(String[][] arr) throws AppArraySizeException, AppArrayDataException {
        if  (arr.length != 4) {
            throw new AppArraySizeException();
        }
        for (String[] strings : arr) {
            if (strings.length != 4) {
                throw new AppArraySizeException();
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("Неверный формат данных: строка %d, столбец %d".formatted(i + 1, j + 1));
                }
            }
        }
        System.out.println("Сумма элементов массива: " + sum);
    }
}
