package Lesson08.homework08;

import java.util.stream.IntStream;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 4};
        int min = IntStream.of(arr).min().getAsInt();
        int max = IntStream.of(arr).max().getAsInt();
        System.out.println("Диапазон чисел: [" + min + ", " + max + "]");
    }
}
