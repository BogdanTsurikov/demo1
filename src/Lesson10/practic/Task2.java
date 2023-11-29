package Lesson10.practic;

public class Task2 {
    public static void main(String[] args) {
        int x = -4;
        int y = 8;

        System.out.println("Координаты точки: (" + x + ", " + y + ")");

        if (x > 0 && y > 0) {
            System.out.println("Точка находится в первой четверти.");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка находится во второй четверти.");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка находится в третьей четверти.");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка находится в четвертой четверти.");
        } else if (x == 0 && y != 0) {
            System.out.println("Точка находится на оси Y.");
        } else if (x != 0 && y == 0) {
            System.out.println("Точка находится на оси X.");
        } else {
            System.out.println("Точка находится в начале координат.");
        }
    }
}
