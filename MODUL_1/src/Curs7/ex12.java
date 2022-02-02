package Curs7;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        2. (Instructiuni iterative. 'while' - Ex. 2) Scrie un program care afiseaza urmatoarele siruri de numere, dupa citirea unei valori n de la tastatura.
        De aceasta data, foloseste instructiunea iterativa for in implementare:

Sirul numerelor naturale pana la n (inclusiv), incepand cu 0, in ordine crescatoare.
Sirul numerelor impare pana la n (inclusiv), incepand cu 1, in ordine crescatoare.
Sirul numerelor pare de la n la 0 (inclusiv), in ordine descrescatoare.
Toate numerele multiplu de 5 pana la n (inclusiv), incepand cu 0, in ordine crescatoare.
*/

        int n = sc.nextInt();
        int it = 0;

        System.out.print("1. ");
        for (it = 0; it <= n; it++) {
            System.out.print(it + "  ");
        }
        System.out.println();
        System.out.print("2. ");
        for (it = 1; it <= n; it += 2) {
            System.out.print(it + " ");
        }
        System.out.println();
        System.out.print("3. ");
        for (it--; it >= 0; it -= 2){
            System.out.print(it + " ");
        }
        System.out.println();
        System.out.print("4. ");
        for (it += 2; it <= n; it += 5) {
            System.out.print(it + " ");
        }
    }
}
