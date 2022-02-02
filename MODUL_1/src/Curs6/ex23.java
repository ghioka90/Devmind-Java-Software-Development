package Curs6;

import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        3. Scrie un algoritm care, la fiecare pas, asteapta un numar natural la intrare si afiseaza dublul numarului introdus.
        Programul se va termina atunci cand utilizatorul introduce un numar negativ.
         */
        int n = 0;
        while (n >= 0){
            System.out.println("Introduceti un numar natural pozitiv:");
            n = sc.nextInt();
            if(n >= 0){
                System.out.println("Dublul sau este: " + (n * 2) );
            }
        }
        System.out.println("La revedere!");
    }
}
