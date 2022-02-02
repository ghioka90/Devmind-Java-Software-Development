package Curs6;

import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        4. Implementeaza un modul software care citeste de la tastatura urmatoarele date (in ordine):

un mesaj (i.e. message): un sir de caractere (ce poate contine spatii)
un prag valoric (i.e. upperLimit): un numar intreg
o valoare de decrementare (i.e. dec): un numar intreg, pozitiv
Programul va numara descrescator de la upperLimit (inclusiv) pana la 0 (inclusiv) si va afisa la consola mesajul
message urmat de un tab si apoi de valoarea curenta din sir. De asemenea, se mai afiseaza 2 mesaje speciale:
Start counting… la inceput si respectiv End counting… la sfarsit.

         */
        System.out.println("Urmatorul numar este:");
        int numar = sc.nextInt();
        System.out.println("Valoarea de decrementare:");
        int dec = sc.nextInt();
        int it = numar;
        System.out.println("Start counting...");
        while (it <= numar && it >= 1){
            System.out.println("Urmatorul numar este: " + it);
            it -= dec;
        }
        System.out.print("End counting...");

    }
}
