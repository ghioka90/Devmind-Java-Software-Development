package Curs8;

import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        2.3. Se citeste un numar natural n si apoi n numere intregi. Sa se calculeze si afiseze:

numarul cu cele mai putine cifre (daca sunt mai multe astfel de numere, oricare dintre ele)
numarul cu cele mai multe cifre (daca sunt mai multe astfel de numere, oricare dintre ele)
         */
        System.out.println("Introduceti numarul de elemente:");
        int n = sc.nextInt();
        int numar;
        int cnt = 0;
        int maxCifre = cnt;
        int minCifre = cnt;

        for (int i = 0; i < n; i++) {
            System.out.println("Tasteaza numarul " + (i + 1) + "/" + n + ":");
            numar = sc.nextInt();
            sc.nextLine();

             int copyNumar = numar;
            while (copyNumar != 0) {
                copyNumar = copyNumar % 10;
                cnt++;
                if (cnt > maxCifre)
                    maxCifre = numar;

                if (cnt < minCifre)
                    minCifre = numar;
            }
        }
        System.out.println(cnt);
        System.out.println("Numar minim de cifre:" + minCifre);
        System.out.println("Numar maxim de cifre:" + maxCifre);
    }
}
