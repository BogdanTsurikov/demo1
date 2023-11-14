package lesson04.homework04;

public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car("Porsche", 4.5, "red", true);

        System.out.println(car1.model);
        car1.beep();
        System.out.println(car1.engine);
        car1.engine();
        System.out.println(car1.color);
        car1.color();
        System.out.println(car1.beep());
        car1.beep();
        System.out.println(car1.model);
        car1.move();
        System.out.println(car1.model);
        car1.stop();


    }
}
