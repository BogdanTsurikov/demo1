package lesson06.homework06;

public class Task5 {
    public static void main(String[] args) {
    int N = 21;
    int minusSumA = 7;
    int minusSumB = 3;
    int minusSumC = 1;
    int col = 0;
    int j = 0;

        for (int i = 0; col < N; i++) {
        col = col + minusSumA;
        col = col - minusSumB - minusSumC ;
        j++;

    }
        System.out.println("Если мы снимаете максимально возможную сумму каждый день, то нам понадобится " + j + " дней!");
}
}