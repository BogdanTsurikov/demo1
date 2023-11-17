package Lesson05.homework05;

public class PersonTest {
    public static void main(String[] args) {
        Task4Person person = new Task4Person();
        person.setName("Bogdan");
        person.setText("Hi YourName");
        String persontext = person.getText();
        String personName = person.getName();
        System.out.println("What is UserNAme?" + persontext);
        System.out.println("is " + personName);

    }
}