package Lesson08.homework08;

import java.util.Arrays;
import java.util.HashSet;

public class Task2 {
        public static void main(String[] args) {
            Integer[] arr = {1, 2, 3, 4, 5, 3};
            HashSet<Integer> set = new HashSet<>(Arrays.asList(arr));
            if (set.size() == arr.length) {
                System.out.println("Все элементы уникальны");
            } else {
                System.out.println(false);
            }
        }
    }

