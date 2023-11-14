package lesson04.homework04;
public class Car {
    String model;
    double engine;
    String color;
    String move;
    String stop;
    boolean transmissionAuto;

    public Car(String model, double engine, String color, boolean transmissionAuto) {
        this.model = model;
        this.engine = engine;
        this.color = color;
        this.transmissionAuto = transmissionAuto;
    }

    public boolean beep() {
        System.out.println( model + "! BEEP!");
        return false;
    }
    public void engine(){
        System.out.println("Обьем двигателя " + engine);
    }
    public void color(){
        System.out.println("Цвет машины " + color);
    }

    public void start() {
        String textMessage = "Start engine! ";
        System.out.println(textMessage + engine);
    }

    public void stop() {
        String textMessage;
        System.out.println( model + "!STOP!");
    }
    public void move() {
        String textMessage = "Move engine";
        System.out.println( model + "!Начать движение!");

    }
}





