package Curs11;//package Curs11;

import java.util.Scanner;

public class ex1 {
    /*
    1. (Ex. 4.x. - Numere prime, divizori, descompunere) Scrie un algoritm care citeste de la tastatura un numar n si
    afiseaza toate numerele prime pana la n (inclusiv), incepand cu 2. Modularizeaza implementarea algoritmului folosind doua metode:

una care indica daca un numar este prim sau nu
Hint: returneaza true daca numarul este prim si false altfel
alta care afiseaza toate numerele prime pana la n (primit ca argument la apel)
Hint: metoda va apela functia definita anterior
     */
    public static boolean isPrime(int number) {
        int it;
        for (it = 2; it < number - 1; ++it) {
            if (number % it == 0)
                return false;
        }
        return true;
    }

    public static void numberePrime(int n) {
        for (int i = 0; i <= n; i++)
            if (isPrime(i) == true)
            System.out.println(i);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        numberePrime(n);
    }
}

