package ALGORITMI;

import java.util.Scanner;

public class digit_sum {
    public static int digitSum(int number) {
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
    public static boolean div4 (int n){
        if (n % 4 != 0){
            return false;
        }else{
            return true;
        }
    }
    public static boolean sumDigitsDiv10(int n){
        int sum = 0;
        while( n > 0){
            sum += n % 10;
            n /= 10;
        }
        if (sum % 10 != 0){
            return false;
        }else{
            return true;
        }
    }

    public static void generateArray(int n) {
        /* Enter your code here */
        int i;
        for (i = 0; i <= n; i++){
            if ( div4(i) && sumDigitsDiv10(i)){
                System.out.print(i);
            }
        }
    }

    public static boolean nrPar(int n){
        if (n % 2 == 0){
            return true;
        } else{
            return false;
        }
    }
    public static boolean nrImpar(int n){
        if (n % 2 != 0){
            return true;
        } else{
            return false;
        }
    }

    public static int balance(int[] array) {
        /* Implement your algorithm here */
        int pare = 0;
        int impare = 0;
        for (int i = 0; i < array.length; i++){
            if (nrPar(array[i])){
                pare++;
            }else{
                impare++;
            }
        }
        if (pare > impare){
            return 1;
        }if (impare > pare){
            return -1;
        }else{
            return 0;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        System.out.println(balance(array));
    }
}
