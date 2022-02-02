package workshop23_10;

import java.util.Scanner;

public class ex32 {
    public static void main(String[] args) {
        /*
        3.2. Scrie o aplicatie care afiseaza toate numerele palindrom dintr-un interval inchis [left, right].
        Capetele intervalului (i.e.left respectiv right) sunt 2 numere naturale care se citesc de la tastatura. Exemplu:
         */
        Scanner sc = new Scanner(System.in);
        int margineDreapta = sc.nextInt();
        int margineStanga = sc.nextInt();

        for (int n = margineDreapta; n <= margineStanga; n++ ) {
            int inversul = 0;
             int numarCurent = n;
            while (numarCurent > 0) {
                int ultimaCifra = numarCurent % 10;
                numarCurent /= 10;
                inversul = inversul * 10 + ultimaCifra;
            }
            if (inversul == n)
                System.out.println(n);

        }

    }
}
