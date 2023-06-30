package lesson3.Homework1_3;

//Создать текстовый файл и записать в него значение любой введенной с клавиатуры строки

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Easy {
    public static void main(String[] args) throws IOException {
        try {
            Path newFiles = Files.createFile(Paths.get("/Users/new/Desktop/Java/JavaBrun060623/src/lesson3/Homework1_3/text.txt"));
            try {
                Scanner scanner = new Scanner(System.in);
                String str = scanner.nextLine();
                BufferedWriter writer = new BufferedWriter(new FileWriter(String.valueOf(newFiles)));
                writer.write(str);
                writer.close();
            } catch (Exception e) {
                System.out.println("Сообщение не записано");
            }

        } catch (Exception e) {
            System.out.println("Ошибка при создании файла или файл с таким именем уже существует");
        }

    }
}
