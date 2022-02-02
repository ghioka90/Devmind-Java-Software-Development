package workshop21_11;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tastati un numar: ");
        int n = sc.nextInt();
        System.out.println(Algorithms.numarCrescator(n));

        System.out.println("Introdudeti limita din stanga a intervaluliu: ");
        int leftLimit = sc.nextInt();
        System.out.println("Introdudeti limita din freapta a intervaluliu: ");
        int rightLimit = sc.nextInt();
        for (int i = leftLimit; i <= rightLimit; i++) {
            if (Algorithms.numarCrescator(i))
                System.out.println(i);}

        for (int i = leftLimit; i <= rightLimit; i++) {
            if (Algorithms.numarDescrescator(i))
                System.out.println(i);
        }
    }
}