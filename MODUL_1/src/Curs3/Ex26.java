package Curs3;

public class Ex26 {
    public static void main(String[] args) {
        /*
        6. Scrie un program „Convertor de distanta“ care transforma distantele din mile in kilometri, astfel:
Defineste o variabila care stocheaza numarul de mile.
Creaza o variabila si calculeaza numarul de kilometri in functie de numarul de mile stocat anterior
Formula de conversie: 1 mila = 1,609 km
Afiseaza numarul initial de mile si numarul de kilometri obtinuti.
Dupa ce ai implementat si testat solutia ta, foloseste si urmatorul set de date pentru verificare. In plus, utilizeaza simbolul _ in program, pentru un Coding Style mai bun.
         */
        double mile = 23.789d;
        double km = mile * 1.609;
        System.out.println("Daca numarul de mile este:" + mile);
        System.out.println("Atunci echivalentul in kilometrii este:" + km);
    }
}
