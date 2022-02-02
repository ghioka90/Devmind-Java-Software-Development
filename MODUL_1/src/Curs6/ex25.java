package Curs6;

import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        5. Aminteste-ti Exercitiul 2 si modul de rezolvare. Daca pentru afisarea sirurilor ai folosit o
        instructiune conditionala (i.e. if) imbricata in structura repetitiva, acest exercitiu este pentru tine!
        Concret, task-ul tau este sa elimini instructiunea conditionala imbricata in fiecare while, pastrand functionalitatea anterioara a programului.
        De exemplu, pentru afisarea sirului numerelor impare, exista o varianta mai performanta fata de cea in care
        incrementam iteratorul cu 1 si ii testam paritatea in vederea afisarii. Concret, putem itera direct din 2 in 2,
        initializand iteratorul cu 1. Astfel, putem afisa direct valoarea iteratorului, fara a mai fi necesara structura if.

        In plus, programul devine prin aceasta actualizare de 2 ori mai eficient, deoarece va efectua doar jumatate din iteratii fata de cazul in care incrementam iteratorul cu 1.
         */
        int n = sc.nextInt();

        System.out.print("1. ");
        int it = 0;
        while (it <= n) {
            System.out.print(it + "  ");
            it++;
        }
        System.out.println();
        System.out.print("2. ");
        it = 1;
        while (it <= n) {
            System.out.print(it + " ");
            it += 2;
        }
        it--;
        System.out.println();
        System.out.print("3. ");
        while (it >= 0){
            System.out.print(it + " ");
            it -= 2;
        }
        it += 2;
        System.out.println();
        System.out.print("4. ");
        while (it <= n) {
            System.out.print(it + " ");
            it += 5;
        }

    }
}
