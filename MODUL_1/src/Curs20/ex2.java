package Curs20;

import java.sql.SQLOutput;
import java.util.Scanner;


public class ex2 {
    /*
    2. Se citeste un text de la tastatura (i.e. text), ce contine doar cuvinte si spatii libere (cu exceptia caracterului Enter / newline).
    Dupa citirea textului, se citesc pe rand doua cuvinte (i.e. ce nu pot contine spatii) cu semnificatia oldWord respectiv newWord.
    Sarcina ta este sa implementezi un algoritm de inlocuire partiala, ce inlocuieste toate aparitiile oldWord cu newWord in text,
    mai putin prima aparitie si ultima aparitie. Concret, regulile de inlocuire sunt:

daca oldWord nu apare deloc: nu se inlocuieste nimic.
daca oldWord apare o singura data: nu se inlocuieste nimic, fiind prima aparitie.
daca oldWord apare de 2 ori: nu se inlocuieste nimic, fiind prima respectiv ultima aparitie.
daca oldWord apare de cel putin 3 ori: se inlocuiesc toate aparitiile acestuia cu newWord, in afara de prima si ultima din text.
     */
    public static int CountAllStrOcc(String calStr, String findStr) {
        int lastIndex = 0;
        int count = 0;

        while (lastIndex != -1) {

            lastIndex = calStr.indexOf(findStr+" ", lastIndex);

            if (lastIndex != -1) {
                count++;
                lastIndex += findStr.length();
            }
        }
        return count;
    }

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);

            String sentence;
            String oldWord;
            String newWord;
            int indexFirstWord;
            int indexLastWord;


            System.out.println("Please enter the sentence: ");
            sentence = sc.nextLine();

            System.out.println("Please enter the word you want to replace: ");
            oldWord = sc.nextLine();

            System.out.println("Please enter the replace word: ");
            newWord = sc.nextLine();

            indexFirstWord = sentence.indexOf(oldWord);
            indexLastWord = sentence.lastIndexOf(oldWord);

//        if ((indexFirstWord < 0  && indexLastWord < 0)||
//                (indexFirstWord >= 0 && indexLastWord < 0)||
//                (indexFirstWord < 0 && indexLastWord >= 0)) {
//            System.out.println("Sentence is: \"" + sentence +"\"");
//        }
            if (CountAllStrOcc(sentence, oldWord) < 3) {
                System.out.println("Sentence is: \"" + sentence + "\"");
            } else{
            sentence = sentence.substring(0, indexFirstWord + 1) +
                        sentence.substring(indexFirstWord + 1, indexLastWord + 1).replace(oldWord + " ", newWord + " ") +
                        sentence.substring(indexLastWord + 1);
            System.out.println("Sentence is: \"" + sentence + "\"");
            }



        }
    }
