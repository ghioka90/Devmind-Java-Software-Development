package Curs9;

import java.util.Scanner;

public class ex14<simetric> {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        4. Scrie un program care citeste de la tastatura numere naturale, pana la introducerea unui numar negativ.
        Daca numarul citit se termina in una dintre cifrele 3, 7 sau 9, numarul este ignorat si se trece la citirea urmatoarelor numere.
        In caz contrar, se afiseaza la consola „simetricul“ numarului. Urmareste exemplul urmator pentru detalii.
         */
        System.out.println("Tastati un numar:");
        int numar, lastDigit, simetric = 0;
        int copyNumar;

        while (true) {
            numar = sc.nextInt();
            copyNumar = numar;
            lastDigit = numar % 10;
            if (lastDigit == 3 || lastDigit == 7 || lastDigit == 9)
                continue;
            while (copyNumar >= 0) {
                lastDigit = copyNumar % 10;
                simetric = (simetric * 10) + lastDigit;
                copyNumar /= 10;
            }
            System.out.println(simetric);
        }
    }
}


