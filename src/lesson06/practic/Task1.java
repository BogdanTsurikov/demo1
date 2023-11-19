package lesson06.practic;

public class Task1 {
    public static void main(String[] args) {
        int y = 10;
        int z = 100;
        int i = 1000;


        double y1 = y / 2 + z / 2;
        double  z1 = z / 2 + i / 2;

        if(i > 0 && i <= 1000 ) {
            if(i<y1) {
                System.out.println("x ближе к 10");
            }else if (i<z1){
                System.out.println("x ближе к 100");
            }else {
                System.out.println("x ближе к 1000");
            }

            }
        }

    }


