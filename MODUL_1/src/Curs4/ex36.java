package Curs4;
import java.util.Scanner;
public class ex36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
       6. Intr-o urna se pun v bile verzi, r bile rosii si n bile negre.
       Calculeaza probabilitatea de a se extrage o bila verde din urna, folosind formula de probabilitati corespunzatoare:
            Numerele de bile, respectiv v, r si n, se citesc de la tastatura.
         */
        System.out.println("Tasteaza numarul de bile verzi:");
        double verzi = sc.nextInt();
        System.out.println("Tasteaza numarul de bile rosi:");
        double rosi = sc.nextInt();
        System.out.println("Tasteaza numarul de bile negre:");
        double negre = sc.nextInt();
        double probabilitateBilaVerde = (verzi / (verzi + rosi + negre)) * 100;
        System.out.println("Probabilitatea de a se extrage o bila verde din urna este de " + probabilitateBilaVerde +"%");

    }
}
