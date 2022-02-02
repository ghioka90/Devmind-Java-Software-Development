package Curs3;

public class Ex16 {
    public static void main(String[] args) {
        /*6. Folosind variabile (cu nume intuitive) si operatiile matematice de baza (exemplificate anterior), modeleaza urmatoarea problema simpla:
        „Andrei are 23 de mere, 45 de portocale si 7 gutui. Acesta mananca la masa de pranz 5 mere, 2 portocale si 3 gutui.
        Scrie un program care (1) sa calculeze si (2) sa afiseze urmatoarele statistici, ca in output-ul urmator“:*/
        int mere = 23, pere = 45, gutui = 7, andreInitial = mere + pere + gutui;
        System.out.println("Andrei are intial un total de fructe de:");
        System.out.println(andreInitial);
        mere = mere - 5;
        pere = pere - 2;
        gutui = gutui - 3;
        System.out.println("Dupa masa, Andrei are un total de mere + portocale de:");
        int andreiDpMasa = mere + pere;
        System.out.println(andreiDpMasa);
        System.out.println();
        System.out.println("Numarul total de fructe ramase dupa masa este:");
        System.out.println(mere + pere + gutui);


    }
}
