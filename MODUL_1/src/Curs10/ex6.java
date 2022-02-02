package Curs10;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        6. Scrie o aplicatie care afiseaza toate lunile calendaristice (in limba romana) care incep cu o anumita litera,
        introdusa de utilizator de la tastatura. Daca se introduce o litera invalida (i.e. ce nu corespunde niciunei luni)
        se va afisa mesajul Nicio luna nu incepe cu litera '<letter>'..
        Daca unei litere corespund mai multe luni, acestea vor fi afisate in ordine calendaristica.
        Programul este „case insensitive“, adica nu face distinctia intre litere mari si mici.
        Programul va cicla, permitand utilizatorului sa introduca noi litere, pana la intalnirea literelor X sau x care vor duce la incheierea programului.
        La iesirea din aplicatie, aceasta va afisa mesajul specific Programul se inchide…. Iata un scenariu de utilizare:
         */

        boolean quit = false;
        while (!quit) {
            String letter = sc.nextLine();
            switch (letter) {
                case "I", "i":
                    System.out.println("Ianuarie\nIunie\nIulie");
                    break;
                case "F", "f":
                    System.out.println("Februarie");
                    break;
                case "M", "m":
                    System.out.println("Martie\nMai");
                    break;
                case "A", "a":
                    System.out.println("Aprilie\nAugust");
                    break;
                case "S", "s":
                    System.out.println("Septembrie");
                    break;
                case "O", "o":
                    System.out.println("Octombrie");
                    break;
                case "N", "n":
                    System.out.println("Noiembrie");
                    break;
                case "D", "d":
                    System.out.println("Decembrie");
                    break;
                case "X", "x":
                    quit = true;
                    System.out.println("Programul se inchide...");
                    break;
                default:
                    System.out.println("Nicio luna nu incepe cu litera " + letter);
                    break;
            }
        }


    }

}
