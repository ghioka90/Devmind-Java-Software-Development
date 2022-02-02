package Curs7;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        3. Scrie un program care citeste de la tastatura un numar natural n,
        ce reprezinta numarul de elemente, urmat de n numere intregi.
        Programul va afisa, la final, numarul de numere pozitive si respectiv numarul de numere negative introduse.
         */

        int n = sc.nextInt();
        int nrPozitiv = 0;
        int nrNegativ = 0;


        for (int it = 1; it <= n; ++it) {
            int numar = sc.nextInt();
            if (numar < 0) {
                nrNegativ++;
            } else
                nrPozitiv++;
        }
        System.out.println("Numere pozitive: " + nrPozitiv);
        System.out.println("Numere negative: " + nrNegativ);

    }
}
