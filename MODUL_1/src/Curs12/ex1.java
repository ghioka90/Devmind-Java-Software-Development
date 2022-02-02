package Curs12;

import java.util.Scanner;

public class ex1 {
    /*
    0.1. (exercitiu rezolvat) Factorialul unui numar (i.e. n! - citit „n factorial“) este egal cu produsul: n! = 1 * 2 * 3 * … * (n - 2) * (n - 1) * n.
    Implementeaza o metoda iterativa care calculeaza factorialul unui numar n, primit ca parametru.
    Metoda trebuie sa functioneze ca in exemplele:
     */

    public static long factorial (int n){
        long result = 1;
        for (int i = 2; i <= n; i++)
            result *= i;
        return result;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));


    }
}
