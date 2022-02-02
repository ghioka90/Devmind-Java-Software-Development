package Curs4;
import java.util.Scanner;
public class ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        1. Scrie un program Sum3 care calculeaza suma a 3 numere reale. Programul va citi de la tastatura input-ul si va afisa suma numerelor, precedata de un mesaj adecvat.
         */
        System.out.println("Introdu prenumele tau si apasa  tasta Enter:");
        String prenume2 = sc.next();
        System.out.println("Introdu numele tau si apasa tasta Enter:");
        String nume2 = sc.next();
        System.out.println("Introdu varsta ta si apasa  tasta Enter:");
        int varsta2 = sc.nextInt();
        System.out.println("Introdu inaltimea ta si apasa  tasta Enter:");
        double inaltime2 = sc.nextDouble();
        System.out.println("Datele introduse despre " + prenume2 + " " + nume2 + " sunt:\n\t -Varsta:"
                + varsta2 +" ani" + "\n\t -Inaltimea:" + inaltime2 + " m");
        System.out.println();
    }
}
