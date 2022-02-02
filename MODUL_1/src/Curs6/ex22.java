package Curs6;

import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        /*
        2. Scrie un program care afiseaza urmatoarele siruri de numere, dupa citirea unei valori n de la tastatura:
Sirul numerelor naturale pana la n (inclusiv), incepand cu 0, in ordine crescatoare.
Sirul numerelor impare pana la n (inclusiv), incepand cu 1, in ordine crescatoare.
Sirul numerelor pare de la n la 0 (inclusiv), in ordine descrescatoare.
Toate numerele multiplu de 5 pana la n (inclusiv), incepand cu 0, in ordine crescatoare.
         */
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print("1. ");
        int it = 0;
        while (it <= n) {
            System.out.print(it + "  ");
            it++;
        }
        System.out.println();
        System.out.print("2. ");
        it = 0;
        while (it <= n) {
            if (it % 2 != 0)
                System.out.print(it + " ");
            it++;
        }
        System.out.println();
        System.out.print("3. ");
        while (it >= 0){
            if (it % 2 == 0)
                System.out.print(it + " ");
            it--;
        }
        it++;
        System.out.println();
        System.out.print("1. ");
        while (it <= n) {
            if (it % 5 == 0)
                System.out.print(it + " ");
            it++;
        }
    }

}