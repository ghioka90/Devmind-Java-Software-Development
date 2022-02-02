package Curs8;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        1.4. Scrie un program care citeste de la tastatura un numar natural x si afiseaza simetricul sau (i.e. numarul in oglinda).
         */
        int x = sc.nextInt();
        int invers = 0;
        int uCifra = 0;


        while (x > 0){
            uCifra = x % 10;
            invers = invers * 10 +uCifra;
            x /= 10;
        }
        System.out.println(invers);
    }
}
