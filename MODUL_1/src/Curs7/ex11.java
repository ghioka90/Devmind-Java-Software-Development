package Curs7;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        1. Implementeaza un algoritm care citeste de la tastatura un numar natural n si un mesaj, care poate contine spatii.
        Programul va afisa mesajul de n ori, fiecare afisare pe cate o linie noua si insotita de numarul curent, ca in exemplul urmator:
         */
        int n = sc.nextInt();
        sc.nextLine();
        String mesaj = sc.nextLine();

        for(int i = 1; i<=n; i++){
            System.out.println(i + ". " + mesaj);
        }

    }
}
