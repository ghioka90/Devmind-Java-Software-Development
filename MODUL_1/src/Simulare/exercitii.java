package Simulare;

import java.util.Scanner;

public class exercitii {
    /*
    [0.5p] Implementeaza o metoda care primeste ca parametru un array de numere intregi si returneaza un array,
    de aceeasi dimensiune, care contine ultima cifra a fiecarui numar din primul array, in aceeasi ordine.
     */
    public static int[] lastDigit(int[] array) {
        /* Implement your algorithm here */
        int i;
        int l = array.length;
        int [] arrayLastDigit = new int[l];
        for (i = 0; i < l; i++){
            int n = array[i];
            int lastDigit;
            lastDigit = n % 10;
            arrayLastDigit[i] = lastDigit;
        }
        return arrayLastDigit;
    }

    public static int isPerfect(int number) {
        /* Implement your algorithm here */
        int copyNo = number;
        int sum = 0;
        int result = 0;
        for ( int i = 1 ; i < number; i++){
            if (copyNo % i == 0){
                System.out.println(i);
                sum = sum + i;
            }
        }
        if (sum  < number)
            result = -1;
        if (sum  > number)
            result = 1;
        if (sum  == number)
            result = 0;
        System.out.println(sum);
        return result;
    }

  /*-----------------------------------------------------------
   * The methods below are used for Testing Purposes only.
   * Do not modify them.
   -----------------------------------------------------------*/

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
////        int arrayLength = sc.nextInt();
////
////        int[] array = new int[arrayLength];
////        for (int i=0; i<array.length; i++) {
////            array[i] = sc.nextInt();
////        }
////
////        int[] result = lastDigit(array);
////
////        for (int i=0; i<result.length; i++) {
////            System.out.print(result[i] + " ");
////        }
//        int number = sc.nextInt();
//        System.out.print(isPerfect(number));
//
//
//        sc.close();
    }
}
