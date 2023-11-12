package lesson03.homework03;
public class Task03 {

    public static void main(String[] args){

        double A_prise = 1000,B_prise = 500,Discont = 0.1;
        double AB_disc = (A_prise + B_prise) * (1-Discont);
        double prise_dis = (A_prise + B_prise) * Discont;

        System.out.println("Сума покупки со скидкой: " + AB_disc);
        System.out.println("Сума скидки: " + prise_dis);
    }
}
