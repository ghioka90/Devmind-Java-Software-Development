package workshop21_11;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tasteaza un numar");
        int number = sc.nextInt();
        System.out.println(Algorithms.digitSum(number));

        if (Algorithms.magicNo(number) == true){
            System.out.println("Este numar magic: ");
        }else{
            System.out.println("NU este numar magic: ");
        }
        System.out.println("Introdudeti limita din stanga a intervaluliu: ");
        int leftLimit = sc.nextInt();
        System.out.println("Introdudeti limita din freapta a intervaluliu: ");
        int rightLimit = sc.nextInt();
        for (int i = leftLimit; i <= rightLimit; i++){
            if (Algorithms.magicNo(i))
                System.out.println(i);
    }
}}
