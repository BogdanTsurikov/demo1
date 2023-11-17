package Lesson05.homework05;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        String sc = "Вино";
        String sc1 = "Вода";
        System.out.println("Первое слово = " + sc);
        System.out.println("Второе слово = " + sc1);
        String str3 = (sc.substring(0, sc.length()/2)) +
                (sc1.substring(sc1.length()/2, sc1.length()));
        System.out.println(str3);

    }

}
