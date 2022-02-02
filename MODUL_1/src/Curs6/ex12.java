package Curs6;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        while (true) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                System.out.println("Este numar par");
            } else System.out.println("Nu este numar par");
        }
    }

}
