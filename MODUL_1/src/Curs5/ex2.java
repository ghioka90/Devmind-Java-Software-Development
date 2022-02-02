package Curs5;

public class ex2 {
    public static void main(String[] args) {
        /*
        2. Scrie o sectiune de cod simplu care sa demonstreze diferenta dintre operatorii unari de
        pre-incrementare vs. post-incrementare respectiv pre-decrementare vs. post-decrementare.
        Hint: stocheaza si afiseaza valorile returnate de toti acesti operatori si afiseaza-le alaturi de mesaje relevante.
         */
        int i = 0;
        System.out.println("i = " + i + " -Post-Incrementare- i++ = " + i++ + ". Valoarea lui i este crescuta cu o unitate dar este returnata vechea valoare a lui, adica 0");

        int j = 0;
        System.out.println("j = " + j + " -Pre-Incrementare- ++j = " + ++j + ". Valoarea lui j este crescuta cu o unitate si este returnata noua valoare a lui, adica 1");

        int x = 0;
        System.out.println("x = " + x + " -Post-Decrementare- x-- = " + x-- + ". Valoarea lui x este scazuta cu o unitate dar este returnata vechea valoare a lui, adica 0");

        int y = 0;
        System.out.println("y = " + y + " -Pre-Decrementare- --y = " + --y + ". Valoarea lui y este scazuta cu o unitate si este returnata noua valoare a lui, adica -1");
    }
}
