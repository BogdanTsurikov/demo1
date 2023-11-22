package Lesson07.homework.withcycle;

public class Taskadd2 {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        while (i <= 100 && count < 7) {
            if (i % 5 == 0) {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }
}
