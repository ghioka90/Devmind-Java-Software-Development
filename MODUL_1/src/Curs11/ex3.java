package Curs11;

import java.util.Scanner;

public class ex3 {
    /*
    3. Se da o metoda simpla, care realizeaza si apoi returneaza produsul a doua numere:
    Utilizand metoda definita, implementeaza 2 noi metode:
O metoda care realizeaza inmultirea a 3 numere, primite ca parametri.
O alta metoda care realizeaza inmultirea a 4 numere, primite ca parametri.
    */
    public static double multiply2(double operand1, double operand2) {
        return operand1 * operand2;
    }
    public static double multiply3(double operand1, double operand2, double operand3) {
        // 1. Your code here
        return multiply2(multiply2(operand1,operand2), operand3);

    }
    public static double multiply4(double operand1, double operand2, double operand3, double operand4) {
        // 2. Your code here
        return multiply2(multiply3(operand1,operand2,operand3), operand4);


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        System.out.println(multiply4(a, b, c, d));



    }
}
