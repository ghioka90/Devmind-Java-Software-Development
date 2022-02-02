package Curs5;
import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        6. Se citesc de la tastatura doua date calendaristice, exprimate prin an, luna, zi.
        Prima reprezinta data nasterii unei persoane iar a doua data curenta. Calculeaza varsta aproximativa a persoanei in numar de zile,
        considerand ca toate lunile calendaristice au un numar egal de zile, si anume 30 zile.
        Calculeaza apoi varsta persoanei in ani impliniti (intregi) si afiseaz-o.
         */
        System.out.println("Introdu data nasterii.");
        System.out.println("Zi=");
        int ziNastere = sc.nextInt();
        System.out.println("Luna=");
        int lunaNastere = sc.nextInt();
        System.out.println("An=");
        int anNastere = sc.nextInt();
        System.out.println("Introdu data curenta.");
        System.out.println("Zi=");
        int zi = sc.nextInt();
        System.out.println("Luna=");
        int luna = sc.nextInt();
        System.out.println("An=");
        int an = sc.nextInt();
        int dataNastereInZile = ziNastere + (lunaNastere * 30) + (anNastere * 360);
        int dataActualaInZile = zi + (luna * 30) + (an * 360);
        int vasrtaInZile = dataActualaInZile - dataNastereInZile;
        int varsta = vasrtaInZile/360;
        System.out.println ("Varsta in zile este: " + vasrtaInZile + " zile.");
        System.out.println ("Varsta in ani este: " + varsta + " ani.");



    }
}
