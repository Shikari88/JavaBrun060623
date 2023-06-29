package lesson1.HomeWork;

//Easy Создайте метод, который принимает на ввод
// с клавиатуры два числа и возвращает их сумму

import java.util.Scanner;

public class Easy {
    public static int getSum() {
        System.out.println("Введите два числа");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.close();
        return num1 + num2;
    }

    public static void main(String[] args) {
        System.out.println("Сумма равна: " + getSum());

    }
}
