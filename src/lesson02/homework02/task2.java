package lesson02.homework02;
public class task2 {
    String name;
    int wheels;

    static int count = 0;

    public static void main(String[] args) {
        task2 opel = new task2();
        opel.wheels = 4;
        opel.name = "Опель";
        count++;

        System.out.println("Я создал машину по имени" + opel.name + ",её количество колес-" + opel.wheels);

        System.out.println("Общее количество машин = " + count);

    }
}
