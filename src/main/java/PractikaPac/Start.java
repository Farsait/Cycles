package PractikaPac;

import java.io.File;
import java.util.Scanner;


public class Start {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isDirectory = false;
        int count=0;


        while (!isDirectory) {
            System.out.print("Введи путь к файлу: ");
            String filePath = scanner.nextLine();

            isDirectory = new File(filePath).exists();

            if (isDirectory) {
                System.out.println("Путь указан верно: " + filePath);
            } else {
                System.out.println("Файла не существует: " + filePath);
                count++;
            }


            }
        System.out.println(" Колличество неверных попыток: " + count);
    }
}

