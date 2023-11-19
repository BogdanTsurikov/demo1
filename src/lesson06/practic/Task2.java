package lesson06.practic;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
                int a = 7;
                int b = 0;
                int c = 3;

                if (a < b) {
                    if (b < c) System.out.println(a + " " + b + " " + c);
                    else System.out.println(a + " " + c + " " + b);
                } else if (b < c) {
                    if (c < a) System.out.println(b + " " + c + " " + a);
                    else System.out.println(b + " " + a + " " + c);
                } else if (c < a) {
                    if (a < b) System.out.println(c + " " + a + " " + b);
                    else System.out.println(c + " " + b + " " + a);
                }


        if (a < b) {
            if (b < c) System.out.println(a + " " + b + " " + c);
            else System.out.println(a + " " + c + " " + b);
        } else if (b < c) {
            if (c < a) System.out.println(b + " " + c + " " + a);
            else System.out.println(b + " " + a + " " + c);
        } else if (c < a) {
            if (a < b) System.out.println(c + " " + a + " " + b);
            else System.out.println(c + " " + b + " " + a);
        }
            }
        }













