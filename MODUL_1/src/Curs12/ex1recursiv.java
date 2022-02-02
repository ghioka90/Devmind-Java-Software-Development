package Curs12;

import java.util.Scanner;

public class ex1recursiv {
    /*
    0.2. (exercitiu rezolvat) Implementeaza algoritmul definit in capitolul Supraincarcarea metodelor.
    Transmiterea parametrilor la punctul 0.1. folosind de aceasta data o metoda recursiva.
    Rezultatele produse de cele doua metode trebuie sa fie identice.
     */
    public static int factorialR(int value) {
        if (value == 0 || value == 1) {
            return 1;
        }
        return value * factorialR(value-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorialR(n));
    }

}

