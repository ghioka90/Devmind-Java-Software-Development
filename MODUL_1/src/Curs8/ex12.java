package Curs8;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        1.2. Se citeste de la tastatura un numar natural, x. Sa se afiseze suma cifrelor numarului, alaturi de un mesaj semnificativ:
         */
        System.out.println("Tastati un numar:");
        int numar = sc.nextInt();
        int suma = 0;
        int ultimaCifra = 0;
        System.out.print("Suma cifrelor numarului este: ");
        while (numar > 0){
            ultimaCifra = numar % 10;
            suma += ultimaCifra;
            numar /= 10;}
        System.out.println(suma);


    }
}
