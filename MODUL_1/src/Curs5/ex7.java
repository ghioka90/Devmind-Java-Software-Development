package Curs5;
import java.util.Scanner;
public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        7. Se citeste de la tastatura ora exacta, exprimata in ore, minute si secunde.
        Sa se determine cate secunde au trecut de la miezul noptii (i.e. ora 00:00:00) pana in acel moment de timp
        si sa se afiseze valoarea respectiva. Afisarea trebuie sa includa un mesaj relevant, care sa cuprinda ora
        citita de la tastatura si semnificatia rezultatului (ex: Numarul de secunde de la miezul noptii pana la
        ora 07:30:29 este de X secunde, unde X este rezultatul calculului).
         */
        System.out.println("Introdu ora.");
        System.out.println("Ora=");
        int ora = sc.nextInt();
        System.out.println("Minute=");
        int minute = sc.nextInt();
        System.out.println("Secunde=");
        int secunde = sc.nextInt();
        int secDLMiezulNoptii = secunde + (minute * 60) +(ora * 3600);
        System.out.println ("Numarul de secunde de la miezul noptii pana la ora "
                + ora + ":" + minute + ":" + secunde + " este de " + secDLMiezulNoptii + " secunde.");


    }
}
