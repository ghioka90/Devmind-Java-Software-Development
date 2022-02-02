package Curs21;

import java.util.Scanner;
public class ex2 {

    public static void bubbleStringSort(String[] array) {
        int n = array.length;
        boolean swapped;
        String aux;

        do {
            swapped = false;

            for (int i = 1; i < n; i++) {

                if (array[i - 1].compareToIgnoreCase(array[i]) > 0) {
                    aux = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = aux;
                    swapped = true;
                }
            }
        } while(swapped);
    }

    public static String secondWordInArray(String[] array){
        return array[1];
    }

    public static String lastButOneInArray(String[] array){
        return array[(array.length - 2)];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tasteaza numarul de elemente n:");
        int n = sc.nextInt();
        int it = 0;
        String[] wordsArray = new String[n];
        System.out.println("Tasteaza " + n + " elemente:");
        while (it < n) {
            String word = sc.next();
            wordsArray[it] = word;
            it++;
        }
        bubbleStringSort(wordsArray);
        System.out.println("String secondWordInArray(String[]) -> " + secondWordInArray(wordsArray));
        System.out.println("String lastButOneInArray(String[]) -> " + lastButOneInArray(wordsArray));

    }
}
