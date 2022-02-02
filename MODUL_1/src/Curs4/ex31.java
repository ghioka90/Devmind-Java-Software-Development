package Curs4;
import java.util.Scanner;
public class ex31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
1. Foloseste operatorul paranteza (i.e. ()) pentru a face ca urmatoarea ecuatie sa fie executata de la stanga la dreapta.
Practic, trebuie sa folosesti oricate perechi de paranteze pentru a compensa executia calculelor aritmetice in functie de prioritatea operatorilor.
La final, afiseaza rezultatul operatiei si verifica-l cu output-ul de referinta.
         */
        double leftToRightOrderComputation = ((100d + 5d) * 10d - 2.23d) * 18d / 4d + 2d;
        System.out.println(leftToRightOrderComputation);
    }
}
