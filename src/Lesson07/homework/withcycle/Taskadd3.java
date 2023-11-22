package Lesson07.homework.withcycle;

import java.util.Scanner;

public class Taskadd3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = "";
        int attempts = 0;
        while (!word.equals("hello")) {
            System.out.print("Введите слово 'hello': ");
            word = scanner.nextLine();
            attempts++;
        }
        System.out.println("Спасибо! Вы ввели правильное слово после " + attempts + " попыток.");
    }
}

