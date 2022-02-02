package Curs8;

import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        2.1. Se citeste un numar natural n si apoi n numere intregi. Sa se calculeze si afiseze:

cel mai mic numar (valoarea minima din sir)
cel mai mare numar (valoarea maxima din sir)
media aritmetica a numerelor (calculata ca suma a tuturor numerelor impartita la numarul de numere)
         */
        System.out.println("Introduceti numarul de elemente:");
        int n = sc.nextInt();
        int i = 0;

        System.out.println("Introduceti numarul 1 / " + n +": ");
         int numar = sc.nextInt();
         int min = numar;
         int max = numar;
         int sum = numar;

         for (i = 2; i <= n; i++){
             System.out.println("Introduceti numarul " + i + " / " + n + ":");
             numar = sc.nextInt();
             if (numar < min){
                 min = numar;
             }else if (numar > max){
                 max = numar;}

             sum += numar;
         }

        System.out.println("Numarul mimin este: " + min);
         System.out.println("Numarul maxim este: " + max);
         System.out.println("Media aritmetica este: " + (sum/n));



    }
}
