package Lesson10.practic;

public class Task3 {

    public static void main(String[] args) {
        int number = 5;
        System.out.println("На лугу пасется " + number + " " + getWordForm(number));
    }

    private static String getWordForm(int number) {
        int lastDigit = number % 10;
        if (number >= 11 && number <= 14) {
            return "коров";
        }
        switch (lastDigit) {
            case 1:
                return "корова";
            case 2:
            case 3:
            case 4:
                return "коровы";
            default:
                return "коров";
        }
    }
}

