package lesson1.HomeWork;
//Создайте несколько одноименных методов (2-3 шт) с разными входными параметрами,
// реализуйте в каждом из них ввод с клавиатуры
// и передачу в данный метод переменных с последующим выводом результата любого арифметического действия

import java.util.Scanner;

public class Medium {

    public static void getSum() {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(num1 + num2);
    }
    public static void getSubtraction() {
        Scanner scanner1 = new Scanner(System.in);
        double num3 = scanner1.nextDouble();
        double num4 = scanner1.nextDouble();
        System.out.println(num3 - num4);

    }
    public static void getDivision() {
        Scanner scanner2 = new Scanner(System.in);
        long num5 = scanner2.nextLong();
        long num6 = scanner2.nextLong();
        System.out.println(num5 / num6);
    }
    public static void main(String[] args) {
        getSum();
        getDivision();
        getSubtraction();
    }
}
