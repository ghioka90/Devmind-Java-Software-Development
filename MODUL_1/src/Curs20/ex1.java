package Curs20;

import java.util.Scanner;
import java.util.Arrays;

public class ex1 {
    /*
    1. Se citeste de la tastatura un sir de caractere, care poate contine spatii.
    Afiseaza numarul de aparitii ale fiecarui caracter din String. Precizari:

        1. ordinea afisarii literelor este arbitrara
        2. fiecare litera (impreuna cu numarul de aparitii) va fi afisata o singura data
        3. formatul concret de afisare este la alegerea ta. In exemplu este prezentat doar un model de afisare.
     */

    public static int CountAllCharOcc(String calStr, char ch) {
        int i, charCount = 0;

        for (i = 0; i < calStr.length(); i++) {
            if (calStr.charAt(i) == ch) {
                charCount++;
            }
        }
        return charCount;
    }
    public static int arrayCharOcc(char array[], char ch) {
        int i, charCount = 0;

        for (i = 0; i < array.length; i++) {
            if (array[i] == ch) {
                charCount++;
            }
        }
        return charCount;
    }


    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        String sentence;

        sentence = sc.nextLine();

        char[] charsArray = new char[sentence.length()];
        int i = 0;


        for (int j = 0; j < sentence.length(); j++) {
            if (arrayCharOcc(charsArray, sentence.charAt(j)) == 0){
            System.out.println("Character: " + sentence.charAt(j) + " apears: " + CountAllCharOcc(sentence, sentence.charAt(j)) + " time(s).");}
            charsArray[i] = sentence.charAt(j);
            i++;
        }


    }

}