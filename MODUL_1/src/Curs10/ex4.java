package Curs10;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        4. Se citeste de la tastatura un numar natural n.
        Sa se afiseze toate numerele naturale, in ordine crescatoare, pana la n, care au ultima cifra diferita de 1, 0 si 8. De exemplu:
         */
        int numar = sc.nextInt();
        int lastDigit = 0;
        for (int i = 0; i <= numar; i++) {
            lastDigit = i % 10;
            switch (lastDigit) {
                case 2, 3, 4, 5, 6, 7, 9:
                    System.out.print(i + " ");
            }


        }
    }
}

