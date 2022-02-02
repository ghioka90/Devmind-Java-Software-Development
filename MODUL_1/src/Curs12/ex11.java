package Curs12;

import java.util.Scanner;

public class ex11 {
    /*
    1.1. Scrie o metoda iterativa care primeste ca parametru un numar si returneaza numarul de cifre al acelui numar. De exemplu:
     */

    public static int numarCifre(int n){
        int it;
        for(it = 0; n > 0; it++ ){
            n /= 10;
        }
        return it;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(numarCifre(n));

    }
}
