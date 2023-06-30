package lesson2.Homework1_2;

import java.util.Arrays;
import java.util.Scanner;

//        Easy Создайте двумерный массив размеры которого задаются с клавиатуры
//        Medium Easy + наполните массив случайными числами от 1 до 10

public class EasyMedium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int[][] arr = new int [x][y];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) Math.floor(Math.random() * 11);
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
