package Curs22;

import java.sql.SQLOutput;

public class ex1 {
    /*
    1. Implementeaza o metoda care primeste ca parametri (1) o propozitie, alcatuita din cuvinte separate prin spatii si
    semne de punctuatie si (2) un cuvant, denumit cheie, alcatuit numai din literele alfabetului englez si care returneaza:

    numarul de cuvinte care contin cel putin un caracter din cheie
    numarul de cuvinte din propozitie care incep cu oricare dintre literele cheii
     */
    public static boolean search(String[] array, String value) {
        for (int i=0; i<array.length; i++) {
            if (array[i].equals(value)) {
                return true;
            }
        }
        return false;
    }


    public static int letterCccurenceInWords (String sentence, String keyWord) {
        System.out.println("Sentence is: \n\t" + sentence + "\nThe keyword is: \n\t" + keyWord + "\n\n");
        String[] sentenceWords = sentence.split("\\W+");
        StringBuilder wordsCount = new StringBuilder();
        int count = 0;
        for (int i = 0; i < keyWord.length(); i++) {
            for (int j = 0; j < sentenceWords.length; j++) {
                String sentWord = sentenceWords[j].toLowerCase();
                char character = Character.toLowerCase(keyWord.charAt(i));
                if (sentWord.indexOf(character) >= 0 && wordsCount.indexOf(sentenceWords[j]) < 0) {
                    count++;
                    wordsCount.insert(count-1, sentenceWords[j]);
                    System.out.println("For char: " + keyWord.charAt(i) + "  the word is: " + sentenceWords[j]);
                }
            }
        }
        return count;
    }
    public static int wordsStartWhitLetters (String sentence, String keyWord) {
        System.out.println("Sentence is: \n\t" + sentence + "\nThe keyword is: \n\t" + keyWord + "\n\n");
        String[] sentenceWords = sentence.split("\\W+");
        int count = 0;
        for (int i = 0; i < keyWord.length(); i++) {
            for (int j = 0; j < sentenceWords.length; j++) {
                String sentWord = sentenceWords[j].toLowerCase();
                char character = Character.toLowerCase(keyWord.charAt(i));
                if (sentWord.indexOf(character) == 0) {
                    count++;
                    System.out.println("The words with first letter " + keyWord.charAt(i) + "  the word is: " + sentenceWords[j]);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String sentence = "Strive not to be a success, buT Rather to be of value.";
        String keyWord = "Star";

        System.out.println(letterCccurenceInWords(sentence,keyWord));
        System.out.println(wordsStartWhitLetters(sentence,keyWord));
    }
}
