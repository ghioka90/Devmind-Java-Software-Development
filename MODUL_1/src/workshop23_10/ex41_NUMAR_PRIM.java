package workshop23_10;

import java.util.Scanner;

public class ex41_NUMAR_PRIM {
    public static void main(String[] args) {
        /*
        4.1. Este numar prim? Scrie un algoritm care sa determine daca un numar dat este numar prim.
Idee de rezolvare: Pentru a determina daca un numar este prim este necesar sa testam daca exista vreun
divizor in afara de 1 si el insusi. In cazul in care gasim cel putin un divizor, numarul nu este prim.
         */
        Scanner sc = new Scanner(System.in);
        int numar = sc.nextInt();
        boolean areDivizori = false;
        int it;
        for (it = 2; it < numar - 1; ++it) {
            if (numar % it == 0) {
                areDivizori = true;
            }
        }
        System.out.println(areDivizori ? "nu este numar prim" : "este numar prim");
    }


}