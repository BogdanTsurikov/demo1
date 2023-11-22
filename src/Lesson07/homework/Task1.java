package Lesson07.homework;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        double number = scanner.nextDouble();

        System.out.print("Введите степень: ");
        int power = scanner.nextInt();

        double result = Math.pow(number, power);
        System.out.println(number + " в степени " + power + " равно " + result);

        System.out.print("Введите количество чисел: ");
        int count = scanner.nextInt();

        double sum = 0;
        for (int i = 0; i < count; i++) {
            System.out.print("Введите число " + (i + 1) + ": ");
            sum += scanner.nextDouble();
        }

        double average = sum / count;
        System.out.println("Среднее арифметическое: " + average);
    }
}

