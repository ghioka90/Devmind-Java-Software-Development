package ALGORITMI;

import java.util.Scanner;

public class nr_rotundperfect_complementar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        2. Scrie un program care citeste de la tastatura un numar natural n si afiseaza numarul complementar,
        astfel incat suma lor sa fie cel mai mic „numar rotund-perfect“.
            Un „numar rotund-perfect“ este un numar care are prima cifra 1, urmata doar de 0-uri.
         */

        int n = sc.nextInt();
        int nCopy = n;
        int numarCifre = 0;

        while (nCopy > 0) {
            numarCifre++;
            nCopy /= 10;
        }
        int nrRotPerf = 1;
        for(int it = 1; it <= numarCifre; it++){
            nrRotPerf *= 10;
        }
        System.out.println("Numarul rotunt-perfect al lui n este: " + nrRotPerf);
        System.out.println("Iar numarul complementar al sau este: " + (nrRotPerf - n));
    }
    }

