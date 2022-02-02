package Curs12;

import java.util.Scanner;

public class ex22recursiv {
    /*
    2.2. Implementeaza si varianta recursiva a metodei definite in capitolul Supraincarcarea metodelor.
    Transmiterea parametrilor la punctul 2.1. (i.e. multiplyWithSumR(int, int)).
    Rezultatele produse de cele doua metode trebuie sa fie identice.
     */
    public static int inmultirePrinAdunare (int a, int b){
        int it;
        int sum = 0;
        for (it = 1; it <= b; it ++)
            sum += a;
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(inmultirePrinAdunare(a,b));
    }

}
