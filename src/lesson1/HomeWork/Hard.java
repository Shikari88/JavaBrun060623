package lesson1.HomeWork;

//Создайте метод, принимающий на вход переменную, являющейся верхней границей случайного числа.
//Число генерируется внутри метода и возвращается в виде результата отработки метода на (Math или Random)

import java.util.logging.Logger;

public class Hard {
    public static double returnRandomNumber(int num){
        return Math.random() * num;
    }

    public static void print(double res) {
        System.out.println(res);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            print((returnRandomNumber(2)));
        }
    }
}
