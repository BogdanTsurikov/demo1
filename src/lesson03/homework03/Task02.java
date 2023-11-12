package lesson03.homework03;

public class Task02 {
    public static void main(String[] args){
        int[] myNum = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int str = 0;
        for (int i = 0; i <= 9; i++) {
            str = str + myNum[i];

        }
        System.out.println(str / 10 + " Остаток "+ str % 10);
    }
}
