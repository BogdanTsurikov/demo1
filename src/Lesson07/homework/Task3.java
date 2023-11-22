package Lesson07.homework;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String word = "коров";

        if (n % 10 == 1 && n % 100 != 11) {
            word += "а";
        } else if (n % 10 >= 2 && n % 10 <= 4 && (n % 100 < 10 || n % 100 >= 20)) {
            word += "ы";
        } else {
            word += "";
        }
        System.out.println("На лугу пасется " + n + " " + word);
    }
}
