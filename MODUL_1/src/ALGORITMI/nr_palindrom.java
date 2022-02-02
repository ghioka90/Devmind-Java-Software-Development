package ALGORITMI;

import java.util.Scanner;

public class nr_palindrom {
    public static void main(String[] args) {
        /*
        3.1. Un numar palindrom este un numar care este egal cu simetricul sau. Cateva exemple sunt: (toate numerele de o cifra, 11, 222, 13431, 185581 etc.).
        Pornind de la algoritmul implementat anterior, scrie un algoritm care sa determine daca un numar este palindrom sau nu. De exemplu:
         */
        Scanner sc = new Scanner(System.in);
        int numar = sc.nextInt();
        int inversul = 0;
        int numarI = numar;
        while (numar > 0) {
            int ultimaCifra = numar % 10;
            numar /= 10;
            inversul = inversul * 10 + ultimaCifra;
        }
        System.out.println("Inversul numarului este: " + inversul + " si " + (inversul == numarI?"este ":"nu este " ) + "palindrom.");
    }
}
