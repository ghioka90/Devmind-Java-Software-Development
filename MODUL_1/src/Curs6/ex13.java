package Curs6;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pinCorect = 1234;
        int sumaInCont = 12000;
        System.out.println("Tastati PIN-ul cardului dvs.");
        int pin = sc.nextInt();
        if (pin == pinCorect) {
            System.out.println("PIN Corect!");
            System.out.println("Ce suma doriti sa scoateti?");
            int suma = sc.nextInt();
            if (suma <= sumaInCont) {
                System.out.println("Tranzactie in desfasurare...");
                System.out.println("Doriti afisarea noii balante a contului curent? Raspundeti cu 0 (NU) sau 1 (DA).");
                int raspuns = sc.nextInt();
                if (raspuns == 1) {
                    System.out.println("Mai aveti in balanta suma de " + (sumaInCont - suma) + " RON");
                } else
                    System.out.println("Multumim pentru ca ati ales Banca DevBank");
            } else
                System.out.println("Fonduri insuficiente!");



        } else
            System.out.println("PIN GRESIT!");


    }

    }

