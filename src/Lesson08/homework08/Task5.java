package Lesson08.homework08;

public class Task5 {
    public static void main(String args[]) {
        int num[] = {3, 5, 7, 2};
        double sum = 0;
        for (int x : num) {
            sum += x;
        }
        System.out.print("среднее арифметическое чисел равно: " + sum / num.length);
    }
}
