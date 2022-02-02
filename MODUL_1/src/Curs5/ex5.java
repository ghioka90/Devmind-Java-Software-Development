package Curs5;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        5. Se citesc de la tastatura 3 numere intregi diferite, sa le numim a, b, respectiv c.
        Folosind operatorii deja studiati, afiseaza pe ecran urmatoarele informatii despre relatiile intre numere:

Este a cel mai mare numar? Raspuns:
Este b cel mai mic numar? Raspuns:
Este suma numerelor a si b mai mica decat c? Raspuns:
Este c mai mare decat media aritmetica dintre a si b? Raspuns:
Depaseste produsul numerelor valoarea 100? Raspuns:
Este suma numerelor a si c divizibila cu 2? Raspuns:
Este a multiplu al numarului b? Raspuns:
Este b mai mare decat restul impartirii lui a la c? Raspuns:
Se imparte exact b la diferenta numerelor a si c? Raspuns:
Sunt cele 3 numere egale? Raspuns:
Sunt cel putin doua dintre numere egale (oricare doua)? Raspuns:
La afisare, includeti si mesajele aferente fiecarui subpunct pentru claritate. De asemenea, afisati initial numerele citite de utilizator.
         */

        System.out.println("Introdu de la tastatura trei numere diferite.");
        System.out.println("a=");
        int a = scan.nextInt();
        System.out.println("b=");
        int b = scan.nextInt();
        System.out.println("c=");
        int c = scan.nextInt();
        System.out.println("Cele 3 numere sunt: a=" + a + ", b=" + b + ", c=" + c);

        System.out.println("1. Este a cel mai mare numar? Raspuns: " +
                ((a > b) && (a > c)));
        System.out.println("2. Este b cel mai mic numar? Raspuns: " +
                ((b < a) && (b < c)));
        System.out.println("3. Este suma numerelor a si b mai mica decat c? Raspuns: " +
                ((a +b)<c));
        System.out.println("4. Este c mai mare decat media aritmetica dintre a si b? Raspuns: " +
                (c > ( (a + b)/2) ) );
        System.out.println("5. Depaseste produsul numerelor valoarea 100? Raspuns: " +
                ((a*b*c)>100) );
        System.out.println("6. Este suma numerelor a si c divizibila cu 2? Raspuns: " +
                (((a + c) % 2) == 0));
        System.out.println("7. Este a multiplu al numarului b? Raspuns: " +
                ((b % a) == 0) );
        System.out.println("8. Este b mai mare decat restul impartirii lui a la c? Raspuns: " +
                (b > (a % c)));
        System.out.println("9. Se imparte exact b la diferenta numerelor a si c? Raspuns: " +
                ((b / (a - c)) == 0));
        System.out.println("10. Sunt cele 3 numere egale? Raspuns: " +
                (a == b && b == c));
        System.out.println("11. Sunt cel putin doua dintre numere egale (oricare doua)? Raspuns: " +
                (a == b || b == c || a == c));
    }
}
