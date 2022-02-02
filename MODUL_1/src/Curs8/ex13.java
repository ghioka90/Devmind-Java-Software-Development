package Curs8;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        1.3. Se citeste de la tastatura un numar natural, x. Sa se afiseze urmatoarele detalii despre numarul citit:

Contine numai cifre pare? [true/false]
Contine mai multe cifre pare decat cifre impare? [true/false]
Suma cifrelor sale este divizibila cu 5? [true/false]
Numarul de cifre este multiplu de 3? [true/false]
Numarul contine cifra 9? [true/false]
Numarul se termina in oricare dintre cifrele 3, 7 sau 9? [true/false]
Numarul este o cifra (i.e. este alcatuit dintr-o singura cifra)? [true/false]
Numarul contine cifra 1 si cifra 0? [true/false]
         */
        int x = sc.nextInt();
        int cPare = 0;
        int cImpare = 0;
        int suma = 0;
        int nrCifre = 0;
        int copyX = x;
        int ultimaCifra = x % 10;
        boolean noua = false;
        boolean treiSapteNoua = false;
        boolean unuZero = false;

        if (ultimaCifra == 3 || ultimaCifra == 7 || ultimaCifra == 9) {
            treiSapteNoua = true;}

        while (x != 0) {
            ultimaCifra = x % 10;
            if (ultimaCifra == 9) {
                noua = true;
            }
//            if (ultimaCifra == 1  ultimaCifra == 0) {
////                unuZero = true;}

            suma += ultimaCifra;

            if (x % 2 == 0) {
                cPare++;
            } else
                cImpare++;
            x /= 10;
            nrCifre++;
            }
//
            System.out.println("1. Contine numai cifre pare? R: " + (nrCifre == cPare ? "DA" : "NU"));
            System.out.println("2. Contine mai multe cifre pare decat cifre impare? R: " + (cPare > cImpare ? "DA" : "NU"));
            System.out.println("3. Suma cifrelor sale este divizibila cu 5? R: " + (suma % 5 == 0 ? "DA" : "NU"));
            System.out.println("4. Numarul de cifre este multiplu de 3? R: " + (nrCifre % 3 == 0 ? "DA" : "NU"));
            System.out.println("5. Numarul contine cifra 9? R: " + (noua ? "DA" : " NU"));
            System.out.println("6. Numarul se termina in oricare dintre cifrele 3, 7 sau 9? R: " + (treiSapteNoua ? "DA" : "NU"));
            System.out.println("7. Numarul este o cifra (i.e. este alcatuit dintr-o singura cifra)? R: " + (nrCifre == 1 ? "DA" : "NU"));
            System.out.println("8. Numarul contine cifra 1 si cifra 0? R: " + (unuZero ? "DA" : "NU"));


        }
    }
