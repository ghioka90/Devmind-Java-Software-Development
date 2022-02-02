package Curs11;

public class ex2 {
     /*
        2. Implementeaza o metoda care primeste ca parametru un numar intreg si returneaza numarul de cifre al acelui numar.
        Testeaza metoda implementata si demonstreaza functionarea corecta a acesteia prin diverse apeluri (in main(…)).
         */

    public static int numberLength(int n){
        int it = 0;
        while (n != 0){
            n /= 10;
            it ++;
        }
        return it;
    }

    public static void main(String[] args) {
        int testNumber = 25;
        System.out.println("The number " + testNumber + " has "
                + numberLength(testNumber) + " digits");
        testNumber = 1_879_658;
        System.out.println("The number " + testNumber + " has "
                + numberLength(testNumber) + " digits");
        testNumber = 0;
        System.out.println("The number " + testNumber + " has "
                + numberLength(testNumber) + " digits");
        testNumber = -120;
        System.out.println("The number " + testNumber + " has "
                + numberLength(testNumber) + " digits");

    }
}
