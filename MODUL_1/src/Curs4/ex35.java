package Curs4;
import java.util.Scanner;
public class ex35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        5. Implementeaza un modul de geometrie care calculeaza urmatoarele proprietati ale unui paralelipiped dreptunghic:
            Volumul paralelipipedului: V = L * l * h
            Aria bazei: Ab = L * l
            Aria laterala: Al = 2 * (L * h + l * h)
            Aria totala: At = Al + 2 * Ab
           Programul citeste de la tastatura dimensiunile paralelipipedului: Lungimea (L), latimea (l) si inaltimea (h). Dimensiunile pot fi numere zecimale.
         */
        System.out.println("Tastati dimensiunile paralelipipedului");
        System.out.println("Lungime:");
        double lungimeP = sc.nextDouble();
        System.out.println("Latime:");
        double latimeP = sc.nextDouble();
        System.out.println("Inaltime:");
        double inaltimeP = sc.nextDouble();
        double volum = lungimeP * latimeP * inaltimeP;
        double ariaB = lungimeP * latimeP;
        double ariaL = 2 * (lungimeP * inaltimeP + latimeP * inaltimeP);
        double ariaT = ariaL + 2 * ariaB;
        System.out.println("Volumul: " + volum);
        System.out.println("Aria bazei: " + ariaB);
        System.out.println("Aria laterala: " + ariaL);
        System.out.println("Aria totala: " + ariaT);
        System.out.println();

    }
}
