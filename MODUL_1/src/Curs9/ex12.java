package Curs9;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        2. Scrie un program care afiseaza primele 5 numere impare dintr-un interval dat. Se vor citi de la tastatura 2 numere intregi:
        left respectiv right, care reprezinta capetele intervalului.
        In cazul in care in interval se gasesc mai putin de 5 numere impare, se vor afisa toate numerele impare din interval.
         */

        int i = 0;
        System.out.println("Tasteaza limita din stanga a intervalului:");
        int left = sc.nextInt();
        System.out.println("Tasteaza limita din dreapta a intervalului:");
        int right = sc.nextInt();
        int cnt = 0;

        for ( i = left ; i <= right ; i++ ){
            if ( i % 2 != 0 ) {
                cnt++;
                System.out.println ( i );
            }
            if ( cnt == 5 )
                break;
            }
        }
    }
