package Curs8;

import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        2.2. Se citeste un numar natural n si apoi n numere intregi. Sa se calculeze si afiseze:

numarul de numere divizibile cu 7
numarul de numere care au suma cifrelor divizibila cu 5
numarul de numere care au ultima cifra 3, 7 sau 9
numarul total de cifre ale numerelor (i.e. suma numarului de cifre al tuturor numerelor)
numarul de numere care au prima cifra 2
         */
        System.out.println("Tasteaza numarul de elemente:");
        int n = sc.nextInt();
        int divSapte = 0;
        int divCinci = 0;
        int ultCifra;
        int div379 = 0;
        int copyNumar;
        int nrCifre = 0;
        int putere = 1;
        int primCifra;
        int primCifraDoi = 0;


        for (int i = 0; i < n; i++) {
            System.out.println("Tasteaza numarul " + (i + 1) + "/" + n + ":");
            int numar = sc.nextInt();
            copyNumar = numar;
            int sumaCifre = 0;

            if (numar % 7 == 0)
                divSapte++;
            if (copyNumar == 0)
                nrCifre++;

            ultCifra = copyNumar % 10;
            if (ultCifra == 3 || ultCifra == 7 || ultCifra == 9)
                div379++;

            while (copyNumar != 0) {
                ultCifra = copyNumar % 10;
                sumaCifre += ultCifra;
                copyNumar /= 10;
                nrCifre++;
            }
            if (sumaCifre % 5 == 0)
                divCinci++;

            copyNumar = numar;
            putere = 1;
            while (putere * 10 <= copyNumar)
                putere *= 10;

            primCifra = copyNumar / putere;
            if (primCifra == 2)
                primCifraDoi++;
        }

        System.out.println("Numere divizibile cu 7: " + divSapte);
        System.out.println("Numere care au suma cifrelor divizibila cu 5: "+ divCinci);
        System.out.println("Numere care au ultima cifra 3, 7 sau 9: " + div379);
        System.out.println("Numarul total de cifre ale numerelor: " + nrCifre);
        System.out.println("Numere care au prima cifra 2: " + primCifraDoi);
    }
    }


