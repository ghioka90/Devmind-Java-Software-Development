package Curs10;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        5. Implementeaza functionarea unui modul ATM real:
        se citeste de la tastatura un numar natural nenul n care corespunde unei anumite operatii ce poate fi realizata de catre ATM
        (exemplu: 1 - Interogare sold, 2 - Retragere numerar etc.). Vezi tabelul de mai jos pentru o lista completa de operatii disponibile.
        In functie de operatia solicitata, ATM-ul trebuie sa actualizeze informatiile specifice clientului curent (in cazul de fata, sold curent).

In vederea selectarii unei anumite operatii, se va folosi o structura conditionala de tip switch.
Odata ce s-a terminat de efectuat operatia solicitata de utilizator, ATM-ul isi va continua executia,
asteptand o noua comanda de la utilizator. Singura posibilitate de a intrerupe acest flux este introducerea unei operatii speciale de tip iesire (exemplu: 6 - Iesire).

Gandeste-te la cat mai multe cazuri de eroare si trateaza-le corespunzator (exemple: la retragerea sumei, numarul citit de la tastatura
sa fie divizibil cu 10, sa fie pozitiv, sa fie mai mic decat soldul disponibil etc.)
         */

        System.out.println("===== Bine ati venit =====\n" +
                "\t1. Interogare Sold\n" +
                "\t2. Retragere Numerar\n" +
                "\t3. Depunere\n" +
                "\t4. Curs Valutar\n" +
                "\t5. Info\n" +
                "\t6. Iesire");

        int sold = 1000;
        int suma = 0;
        boolean quit = false;

        while (!quit) {
            int n = sc.nextInt();
            if (n >= 1 && n <= 6) {
                switch (n) {
                    case 1:
                        System.out.println("Soldul dvs. este: " + sold);
                        break;

                    case 2:
                        System.out.println("Ce suma doriti sa retrageti:");
                        suma = sc.nextInt();
                        if (suma < sold && suma % 10 == 0 && suma >= 0) {
                            sold -= suma;
                            System.out.println("Operatiune efectuata cu succes!");
                            System.out.println("Soldul dvs. este: " + sold + " RON");
                        } else {
                            System.out.println("Suma introdusa nu este valida.\n" +
                                    "Suma trebuie sa aiba urmatoarele caracteristici:\n" +
                                    "1. Sa nu fie un numar negativ;\n" +
                                    "2. Sa fie multiplu de 10;\n" +
                                    "3. Sa nu fie mai mare decat " + sold);}
                        break;

                    case 3:
                        System.out.println("Ce suma doriti sa depuneti:");
                        suma = sc.nextInt();
                        if (suma % 10 == 0 && suma >= 0) {
                            sold += suma;
                            System.out.println("Operatiune efectuata cu succes!");
                            System.out.println("Soldul dvs. este: " + sold);
                        } else {
                            System.out.println("Suma introdusa nu este valida.\n" +
                                    "Suma trebuie sa aiba urmatoarele caracteristici:\n" +
                                    "1. Sa nu fie un numar negativ;\n" +
                                    "2. Sa fie multiplu de 10;");}
                        break;

                    case 4:
                        System.out.println("Cursul valutar de astazi, " + java.time.LocalDate.now() + ", este:\n" +
                                "1 EUR = 4.95 RON");
                        break;

                    case 5:
                        System.out.println("Devmind Bank\n" +
                                "Data: " + java.time.LocalDate.now() + "\n" +
                                "Ora: " + java.time.LocalTime.now() + "\n" +
                                "Temperatura: 20\u00B0 C.");
                        break;

                    case 6:
                        quit = true;
                        System.out.println("La revedere!");
                }
            }else {System.out.println("Optiuni disponibile:\n" +
                    "\t1. Interogare Sold\n" +
                    "\t2. Retragere Numerar\n" +
                    "\t3. Depunere\n" +
                    "\t4. Curs Valutar\n" +
                    "\t5. Info\n" +
                    "\t6. Iesire");

            }

        }



    }
}
