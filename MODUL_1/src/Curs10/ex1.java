package Curs10;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        1. Folosind instructiunea switch, scrie un program care citeste de la tastatura un caracter si afiseaza un cuvant (la alegere) care incepe cu acel caracter.
        Tratati doar cazurile pentru caracterele d, e, v, si s si afisati un mesaj de eroare corespunzator pentru orice alte litere introduse.
         */
//        boolean quit = true;

//        while(!quit){
            System.out.println("Introduceti o litera:");
            String litera = sc.nextLine();

            switch (litera) {
                case "d":
                    System.out.println("Dedmind");
                    break;
                case "e":
                    System.out.println("Eugenie");
                    break;
                case "v":
                    System.out.println("Viteza");
                    break;
                case "s":
                    System.out.println("Scaun");
                    break;
//                case "quit":
//                case "exit":
//                    quit = true;
//                    break;
                default:
                    System.out.println("Litera \"" + litera + "\" nu este valida.");
                    break;
            }


        }
    }


