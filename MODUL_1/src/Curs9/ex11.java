package Curs9;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        1. Implementeaza un sumator de numere cu resurse limitate. Acest sumator va realiza suma numerelor introduse de utilizator,
        pana la introducerea unui numar negativ, dar nu mai mult de 10 numere. Cu alte cuvinte, sumatorul va afisa suma numerelor si se va termina in oricare dintre cele doua cazuri:

Utilizatorul a introdus deja 10 numere.
Utilizatorul introduce un numar negativ (i.e. inainte de introducerea a 10 numere).
Precizari:

In cazul in care programul se incheie prin introducerea unui numar negativ (i.e. cazul 2), acesta nu va fi insumat!
Suma este alcatuita doar din valorile pozitive introduse de utilizator.
         */
         int sum = 0;
         int numar;

         for (int i = 1 ; i <= 10 ; i++ ){
             System.out.println("Tasteaza numarul " + i + " / " + 10 + ":");
             numar = sc.nextInt();
             if (numar < 0){
                 System.out.println("Ai introdus un numar negativ.");
                 break;

             }
             sum += numar;
         }
         System.out.println("Suma este numerelor este: " + sum);
    }
}
