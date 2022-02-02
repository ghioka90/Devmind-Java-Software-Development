package Curs21;

import java.util.Scanner;

public class ex3 {

public static void wordsTransform(String str) {
    StringBuilder sBuilder = new StringBuilder(str);

    for (int i = 0; i < str.length(); i++) {
        if (Character.isUpperCase(str.charAt(i))) {
            sBuilder.setCharAt(i, Character.toLowerCase(str.charAt(i)));
        }
        if (Character.isLowerCase(str.charAt(i))) {
            sBuilder.setCharAt(i, Character.toUpperCase(str.charAt(i)));
        }
    }
    System.out.println(sBuilder);
}

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        String sentence = "The number 1 deadliest animal on the PLANET Earth is the ©Mosquito!®";

        wordsTransform(sentence);
        }

}