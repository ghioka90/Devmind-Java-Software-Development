package workshop21_11;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdudeti numarul: ");
        int n = sc.nextInt();
        if (Algorithms.perfectNo(n)) {
            System.out.println("Este numar perfect");
        } else {
            System.out.println("Nu este numar perfect");
        }
        System.out.println("Introdudeti numarul: ");
        n = sc.nextInt();
        for (int i = 2; i <= n; ++i) {
            if (Algorithms.perfectNo(i))
                System.out.println(i);
        }
        System.out.println("Introdudeti limita din stanga a intervaluliu: ");
        int leftLimit = sc.nextInt();
        System.out.println("Introdudeti limita din freapta a intervaluliu: ");
        int rightLimit = sc.nextInt();
        for (int i = leftLimit; i <= rightLimit; i++){
            if (Algorithms.perfectNo(i))
                System.out.println(i);
        }

    }
}
