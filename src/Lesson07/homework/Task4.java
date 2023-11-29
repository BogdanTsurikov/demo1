package Lesson07.homework;

public class Task4 {
    public static void main(String[] args) {
            int year = 1945;
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " является високосным годом");
            } else {
                System.out.println(year + " не является високосным годом");
            }
        }
    }

