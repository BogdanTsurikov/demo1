package lesson06.homework06;

public class Task4 {

    public static void main(String[] args) {
        int floor = 200;
        int stepUp = 50;
        int stepDown = 1;
        int col = 0;
        int j = 0;

        for (int i = 0; col < floor; i++) {
            col = col + stepUp;
            col = col - stepDown;
            j++;

        }
        System.out.println(j);
    }
}