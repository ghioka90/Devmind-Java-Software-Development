package Curs12;

import java.util.Scanner;

public class ex12recursiv {
    /*
    1.2. Implementeaza si varianta recursiva a metodei definite in capitolul Supraincarcarea metodelor.
    Transmiterea parametrilor la punctul 1.1. (i.e. numberLengthR(int)).
    Rezultatele produse de cele doua metode trebuie sa fie identice.
     */
    public static int numarCifre(int n) {
        int it;
        if (n < 10) {

        }
        return numarCifre(n / 10) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(numarCifre(n));

    }
}
