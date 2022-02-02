package Curs11;

import java.util.Scanner;

public class ex4 {
    /*
    4. (Ex. 3.x. - Palindrom) Scrie un program care afiseaza toate numerele palindrom pana la o valoare n citita de la tastatura.
    Scrie codul modularizat, folosind cel putin o metoda care sa determine daca un numar este palindrom si
    o alta metoda care afiseaza toate numerele palindrom pana la n. Testeaza codul in main(…), pentru diverse valori (n).
     */

    public static boolean estePalindrom(int numar){
        int inversul = 0;
        int numarI = numar;
        while (numarI > 0) {
            int ultimaCifra = numarI % 10;
            numarI /= 10;
            inversul = inversul * 10 + ultimaCifra;
        }
        if (inversul == numar){
            return true;}
        else{
            return false;
        }
    }

    public static void afisarePalindrom(int n){
        int i;
        for (i = 0; i <= n; i++ )
            if(estePalindrom(i) == true){
                System.out.println(i);}
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        afisarePalindrom(n);
    }
}
