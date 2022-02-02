package Curs22;

import java.util.Arrays;
import java.util.Scanner;

public class ex7 {


    public static int countVowels(String str) {

        char[] ch = str.toLowerCase().toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length; i++){
            if (ch[i]=='a' || ch[i]=='e' || ch[i]=='i'|| ch[i]=='o' || ch[i]=='u'){
                count++;
            }
        }
        return count;
    }
    public static int countUniqueVowels(String str) {

        char[] ch = str.toLowerCase().toCharArray();
        int count = 0;
        String newString = "";
        for (int i = 0; i < ch.length; i++){
            String tempString = "";
            tempString += ch[i];
            if (!newString.contains(tempString) && (ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')){
                count++;
                newString += ch[i];
            }
        }
        return count;
    }

//    public static int countUniqueAppearanceVowels(String str) {
//        char[] ch = str.toLowerCase().toCharArray();
//        int count = 0;
//        int a, e, i, o, u = 0;
//        String newString = "";
//        for  (int i = 0; i < ch.length; i++){
//            switch (ch){
//                case "a":
//                    a++;
//                case "e":
//                    e++;
//
//
//
//            }
//        }
//    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = "Andrei va deveni programator";
        System.out.println(sentence + " --> " + countVowels(sentence));

        System.out.println(sentence + " --> " + countUniqueVowels(sentence));

    }
    }

