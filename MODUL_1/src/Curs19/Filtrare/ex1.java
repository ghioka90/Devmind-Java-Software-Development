package Curs19.Filtrare;

import java.util.Scanner;

public class ex1 {
    /*
    1. Se citeste de la tastatura un numar n, ce reprezinta numarul de cuvinte, urmat de citirea a n cuvinte (i.e. fara spatii).
    Cuvintele vor fi stocate intr-un array corespunzator. Ulterior se citeste de la tastatura un cuvant, ce contine numai litere.
    Sa se afiseze pentru fiecare litera a cuvantului, pe rand, toate elementele din multime care incep cu litera respectiva. Precizari:

        1. Daca pentru o litera a cuvantului nu exista niciun cuvant in array care sa inceapa cu litera respectiva, nu se va afisa nimic pentru acea litera.
        2. In cazul in care cuvantul contine litere duplicate, se va realiza afisarea doar pentru prima aparitie a literei respective
        3. Analizeaza exemplul urmator pentru a intelege mai bine functionalitatea:
     */

    public static int countOccurrencesIgnoreCase(char[] array, char letter) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == letter) {
                count++;
            }
        }
        return count;
    }

    public static String[] filterBasedOnFirstLetter(String[] array, char letter) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (letter == array[i].charAt(0)) {
                count++;
            }
        }
        String[] filteredArray = new String[count];

        count = 0;

        for (int i = 0; i < array.length; i++) {
            if (letter == array[i].charAt(0)) {
                filteredArray[count] = array[i];
                count++;
            }
        }
        return filteredArray;
    }

    public static void filterArray(String[] array, String word) {


        char[] usedLetters = new char[word.length()];

        for (int i = 0; i < word.length(); ++i) {
            if (countOccurrencesIgnoreCase(usedLetters, word.charAt(i)) == 0) {

                usedLetters[i] = word.charAt(i);
                String[] filteredArray = filterBasedOnFirstLetter(array, word.charAt(i));

                if (filteredArray.length > 0) {
                    System.out.print(word.charAt(i) + ": ");
                    for (int j = 0; j < filteredArray.length; ++j) {
                        System.out.print(filteredArray[j] + ", ");
                    }
                    System.out.print("\n");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int it = 0;


        System.out.println("Tasteaza numarul de elemente n:");
        n = sc.nextInt();
        String[] wordsArray = new String[n];
        System.out.println("Tasteaza " + n + " elemente:");

        while (it < n) {
            String word = sc.next();
            wordsArray[it] = word;
            it++;
        }
        System.out.println("Tasteaza cuvantul cheie:");
        String key = sc.next();

        filterArray(wordsArray, key);

    }
}