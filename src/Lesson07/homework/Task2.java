package Lesson07.homework;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите x: ");
            int x = scanner.nextInt();
            System.out.print("Введите y: ");
            int y = scanner.nextInt();

            if (x > 0 && y > 0) {
                System.out.println("Точка находится в первой четверти.");
            } else if (x < 0 && y > 0) {
                System.out.println("Точка находится во второй четверти.");
            } else if (x < 0 && y < 0) {
                System.out.println("Точка находится в третьей четверти.");
            } else if (x > 0 && y < 0) {
                System.out.println("Точка находится в четвертой четверти.");
            } else if (x == 0 && y == 0) {
                System.out.println("Точка находится в начале координат.");
            } else if (x == 0) {
                System.out.println("Точка находится на оси Y.");
            } else if (y == 0) {
                System.out.println("Точка находится на оси X.");
            }
        }
    }