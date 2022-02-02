package workshop23_10;

import java.util.Scanner;

public class ex33 {
    public static void main(String[] args) {
        /*
        3.3. Se citeste de la tastatura un numar natural n, mai mare sau egal cu 2. Sa se determine care numar din intervalul [2, n]
        are cea mai mare suma a divizorilor proprii (adica suma tuturor divizorilor in afara de 1 si numarul insusi).
        In cazul in care mai multe numere din interval au suma divizorilor egala, se va afisa primul dintre acestea. Exemplu de rulare:

// INPUT -> OUTPUT
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumaMaxima = 0;
        int numarSumaMaxima = 0;

        int numarCurent = 0;
        for (int it = 2; it <= n; it++) {
            int suma = 0;

            for (int div = 2; div <= it / 2; ++div)
                if (it % div == 0) {
                    suma += div;
                }

            if (suma > sumaMaxima) {
                sumaMaxima = suma;
                numarSumaMaxima = it;
            }

        }

        System.out.println("numarul este " + numarSumaMaxima + " iar suma este " + sumaMaxima);

    }
}
