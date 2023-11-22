package Lesson07.homework.withcycle;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int n = 3;
        int i = 1;
        while (i <= n) {
            System.out.println(i + " в кубе = " + (int) Math.pow(i, 3));
            i++;
        }
    }
}

