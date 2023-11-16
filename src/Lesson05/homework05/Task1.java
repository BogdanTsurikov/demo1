package Lesson05.homework05;

public class Task1 {
    public static void main(String[] args) {

        String text = new String("I Study Basic Java!");
        System.out.println(text);

        char symbol = text.charAt(18);
        System.out.println(symbol);

        String testText = "Java";
        boolean Task1 = text.contains(testText);
        System.out.println("Contains result is - " + Task1);

        String replaceText = text.replaceAll("a","o");
        System.out.println(replaceText);

        String textAfterUpperCase = text.toUpperCase();
        System.out.println(textAfterUpperCase);

        String textAfterLowerCase = text.toLowerCase();
        System.out.println(textAfterLowerCase);

        String substringText = text.substring(14);
        System.out.println(substringText);






















    }
}
