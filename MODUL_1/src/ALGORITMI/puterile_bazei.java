package ALGORITMI;

import java.util.Scanner;

public class puterile_bazei {
    public static void main(String[] args) {
        /*
        1.1. Scrie un algoritm care citeste de la tastatura 2 numere naturale:
        o baza (i.e. b) si un exponent maxim (i.e. e).
                Programul va afisa toate puterile bazei, de la b0 la be (i.e. b0, b1, b2, …, be).
         */
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int e = sc.nextInt();
        int power = 1;

        for (int it = 1; it<=e; it+=1){
            System.out.println(power);
            power *= b;

        }
    }
}
