package Curs4;
import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        2. Implementeaza un modul de asistenta a utilizatorului, in vederea inregistrarii autovehiculului personal in baza de date.
        Programul indruma clientul in introducerea datelor necesare si afiseaza la final un mesaj de multumire,
        toate datele introduse (pentru verificare) si datele calculate automat.
        Poti folosi orice formatare doresti, atat timp cat mesajele sunt clare, relevante si cuprinzatoare. Datele ce trebuie stocate sunt:
            data de fabricatie a autoturismului:
            anul (ex: 2000)
            luna (ex: Octombrie)
            ziua (ex: 25)
            numarul actual de inmatriculare (ex: B 25 DVM)
            numarul de kilometri la bord (ex: 125423.79)
            numarul de kilometri la achizitie (ex: 0, 10587.71)
            numele soferului actual (ex: George Badescu)
            daca are permis sau nu (ex: false daca este momentan suspendat)
            se calculeaza automat:
            numarul de kilometri parcursi: diferenta dintre numarul de kilometri la bord si numarul de kilometri la achizitie
            vechimea aproximativa a autovehiculului, ca diferenta intre anul actual si anul fabricatiei
         */
        System.out.println("Introduceti marca si modelul autovehicului dvs. dupa care apasati tasta Enter:");
        String marca = sc.nextLine();
        //sc.nextLine();
        System.out.println("Cand a fost fabricat autovehicului dvs.:");
        System.out.println("Anul:");
        int anul = sc.nextInt();
        System.out.println("Luna:");
        String luna = sc.next();
        System.out.println("Ziua:");
        int ziua = sc.nextInt();
        System.out.println("Ce numar de imatriculare are autovehicului dvs.:");
        sc.nextLine();
        String numarInmatriculare = sc.nextLine();

        System.out.println("Numarul de km in momentul achizitiei:");
        double kmInitiali = sc.nextDouble();
        System.out.println("Numarul de km acutali:");
        double kmActuali = sc.nextDouble();
        // aici nu imi afiseaza rezultatul dorit
        sc.nextLine();
        System.out.println("Numele complet al soferului actual:");
        String numeSofer = sc.nextLine();
        //sc.nextLine();
        System.out.println("Soferul are permisul suspendat?(tastati true sau false:");
        boolean permisSuspendat = sc.nextBoolean();
        double kmParcursi = kmActuali - kmInitiali;
        int vechime = 2021 - anul;
        System.out.println("Autovehiculul dvs. marca " + marca + " in momentul acual este condus de " + numeSofer + ".");
        System.out.println("Vechimea autovehicului este de " + vechime + " ani iar din momentul achizitiei s-au efectuat "
                + kmParcursi + " km.");
    }
}
