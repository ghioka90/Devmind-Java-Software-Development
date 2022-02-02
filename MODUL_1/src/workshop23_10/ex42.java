package workshop23_10;

import java.util.Scanner;

public class ex42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        4.2. Follow-up - Este numar prim? Scrie un algoritm care citeste de la tastatura un numar n si afiseza toate numerele prime pana la n (inclusiv), incepand cu 2.
         */
        int n = sc.nextInt();
        int i;

        for( i = 2; i <= n; ++i){
            int numarCurent = i;
            boolean areDivizori = false;
            int it;
            for (it = 2; it <= numarCurent - 1; ++it) {
                if (numarCurent % it == 0) {
                    areDivizori = true;
                }
            }
                if (areDivizori == false) {
                System.out.print(numarCurent + ", ");
                }
        }

    }
}

