package Curs9;

import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        1. Folosind instructiunea invatata do-while, implementeaza un joc in care utilizatorul trebuie sa ghiceasca un numar magic.
        Astfel, variabila int numarMagic va fi initializata la o valoare intreaga, in intervalul [0, 10].
        Ulterior, utilizatorul va introduce numere de la tastatura iar programul tau ii va da acestuia indicatii despre numarul introdus:
Daca numarul introdus nu se afla in interval, programul va afisa mesajul: Atentie! Numarul magic se afla in intervalul [0, 10]
Daca numarul este mai mare decat numarul magic, programul va afisa mesajul: Esti aproape! Dar numarul magic este mai mic.
Daca numarul introdus este mai mic, se va afisa:Esti aproape! Dar numarul magic este mai mare.
Cand numarul este ghicit, se va afisa: Ai ghicit, bravo!
         */
        int magicNo = 5, numar;

        do {
            System.out.println("Incearca-ti norocul:");
            numar = sc.nextInt();
            if (numar >= 0 && numar <= 10) {
                if (numar > magicNo)
                    System.out.println("Esti aproape! Dar numarul magic este mai mic.");
                if (numar < magicNo)
                    System.out.println("Esti aproape! Dar numarul magic este mai mare.");
            }else{
            System.out.println("Atentie! Numarul magic se afla in intervalul [0, 10]");}
        }
        while (numar != magicNo);
        System.out.println("Ai ghicit, bravo!");
    }
}
