import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5: ");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> greetings();
            case 2 -> checkSign(6, 7, 5);
            case 3 -> selectColor();
            case 4 -> compareNumbers();
            case 5 -> addOrSubtractAndPrint(20, 12, true);
            default -> System.out.println("Вы ввели не корректную цифру!");
        }
    }
    static void greetings(){
        System.out.println("Hello,\nWorld,\nfrom,\nJava");
    }

    static void checkSign(int a, int b, int c){
        if (a + b + c >= 0){
            System.out.println("Сумма положительная");
        }else {
            System.out.println("Сумма отрицательная");
        }
    }

    static void selectColor(){
        int data = 7;
        if (data <= 10){
            System.out.println("Красный");
        } else  if (data > 10 && data <= 20){
            System.out.println("Желтый");
        } else  if (data > 20){
            System.out.println("Зеленый");
        }
    }

    static void compareNumbers(){
        int a = 12;
        int b = 20;
        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    static void addOrSubtractAndPrint(int initValue, int delta, boolean increment){
        if (increment){
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }
}
