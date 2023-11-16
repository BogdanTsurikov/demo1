package lesson03.homework03.practic03;

public class CalculatorDemo {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int result = calc.um(25,5);
        System.out.println("Результат умножения = " +result);


        int resultDel = calc.del(10,2);

        System.out.println("Результат деления = " + resultDel);
    }
}
