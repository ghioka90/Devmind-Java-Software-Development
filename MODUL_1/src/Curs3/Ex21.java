package Curs3;

public class Ex21 {
    public static void main(String[] args) {
        System.out.println("Exercitiul 1");
        /*1. Sa se creeze urmatoarele:
        o variabila de tip byte si sa se initializeze cu o valoare valida a tipului
        o variabila de tip short si sa se initializeze cu o valoare valida, negativa, a tipului
        o variabila de tip int care sa fie initializata cu 1000 plus 5 ori diferenta dintre variabila de tip byte si cea de tip short.*/
        byte byteVar = 100;
        short srtVar = -20000;
        int intVar = 1000 + 5 * (byteVar - srtVar);
        System.out.println(byteVar);
        System.out.println(srtVar);
        System.out.println(intVar);
        System.out.println();
    }
}
