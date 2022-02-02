package Curs9;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        3. Implementeaza un algoritm care citeste un numar intreg de la tastatura.
        Acesta afiseaza ulterior primele 3 cifre ale numarului, de la sfarsit spre inceput.
        Daca numarul are mai putin de 3 cifre, programul va afisa un mesaj de eroare (i.e. Numarul introdus trebuie sa contina cel putin 3 cifre).
         */
        System.out.println("Tastati un numar:");
        int lastDigit = 0;

        while(true){
            int numar = sc.nextInt();
            int copyNumar = numar;
            int cnt = 1;
            if (numar / 100 != 0){
                while (cnt <= 3){
                    lastDigit = copyNumar % 10;
                    copyNumar /= 10;
                    cnt ++;
                    System.out.print(lastDigit + " ");
                    }
                }
                else{
                System.out.println("Numarul introdus trebuie sa contina cel putin 3 cifre");

            }

        }







    }
}
