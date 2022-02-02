package Curs6;

import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        /*
        1. Completeaza codul urmator cu o singura instructiune (la alegere) astfel incat programul sa nu mai cicleze la infinit:
         */

        Scanner sc = new Scanner(System.in);
        int numberOfIterations = sc.nextInt();

        while (numberOfIterations < 1000) {
            System.out.println("This will never end...");
            //++numberOfIterations;
        }
    }
}
