package Lesson05.homework05;

public class Task5demo {
    public static void main(String[] args) {
        Task5 calc = new Task5();

        int result = calc.sum(100,2);

        System.out.println("Сумма значений = " + result);

        result = calc.sub(100,2);

        System.out.println("Результат вычитания  = " + result);

        result = calc.multipl(100,2);

        System.out.println("Результат умножения  = " + result);


        System.out.println("Результат деления  = " + result);

        result = calc.del(100,2);


    }
}

