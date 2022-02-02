package workshop23_10;

import java.util.Scanner;

public class ex43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        4.3. Implementeaza un program care afiseaza toti divizorii proprii
        (adica toti divizorii fara 1 si numarul insusi) ai unui numar natural n citit de la tastatura.
         */

        int numar = sc.nextInt();
        int it;
        boolean areDivizori = false;

        for (it = 2; it <= numar - 1; ++it) {
            if (numar % it == 0) {
                areDivizori = true;
                if (areDivizori == true) ;
                    System.out.print(it + ", ");
            }
        }if (areDivizori == false)
            System.out.println("este prim");
    }

}