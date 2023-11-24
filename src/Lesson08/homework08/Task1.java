package Lesson08.homework08;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println("Original Array: " + Arrays.toString(arr));
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}