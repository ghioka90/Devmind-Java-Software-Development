package Curs12;

import java.util.Scanner;

public class ex21 {
    /*
    2.1. Defineste o metoda iterativa (i.e. multiplyWithSumI(int, int)) care realizeaza inmultirea a doua numere (i.e. a si b)
    folosind doar operatorul de adunare.
    De exemplu, pentru a calcula a * b se poate realiza o metoda care sa adune a + a + … + a de b ori sau b + b + … + b de a ori.
     */
    public static int inmultirePrinAdunare (int a, int b){
        int it;
        int sum = 0;
        for (it = 1; it <= b; it ++)
            sum += a;
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(inmultirePrinAdunare(a,b));
    }
}
