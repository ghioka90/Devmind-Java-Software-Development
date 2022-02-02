package Curs10;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        3. Implementeaza un algoritm care citeste de la tastatura un numar n si
        afiseaza toate numerele naturale mai mici sau egale cu n precedate alternativ de unul dintre simbolurile +, *, ~, -, ca in exemplul urmator:
         */
        int numar = sc.nextInt();
        int rest = 0;
        for (int i = 0; i <= numar; i++){
            rest = i % 4;
            switch (rest){
                case 0:
                    System.out.print("+" + i +" ");
                    break;
                case 1:
                    System.out.print("*" + i + " ");
                    break;
                case 2:
                    System.out.print("~" + i + " ");
                    break;
                case 3:
                    System.out.print("-" + i + " ");
                    break;

            }
        }
    }
}
