package Curs27;

import java.util.ArrayList;
import java.util.HashSet;

public class LC_KeyboardRow {
    public String[] findWords(String[] words) {
        HashSet row1 = new HashSet();
        HashSet row2 = new HashSet();
        HashSet row3 = new HashSet();

        ArrayList<String>  alWords = new ArrayList<>();


        row1.add('q');
        row1.add('w');
        row1.add('e');
        row1.add('r');
        row1.add('t');
        row1.add('y');
        row1.add('u');
        row1.add('i');
        row1.add('o');
        row1.add('p');

        row2.add('a');
        row2.add('s');
        row2.add('d');
        row2.add('f');
        row2.add('g');
        row2.add('h');
        row2.add('j');
        row2.add('k');
        row2.add('l');

        row3.add('z');
        row3.add('x');
        row3.add('c');
        row3.add('v');
        row3.add('b');
        row3.add('n');
        row3.add('m');



        for (int i = 0; i < words.length; i++ ) {
            String currWord = words[i];
            boolean result = true;
            for (int a = 0; a < currWord.length(); a++) {
                if (!row1.contains(currWord.toLowerCase().charAt(a)) && result) {
                    result = false;
                }
            }
            if (result) {
                alWords.add(currWord);
                continue;
            }

            result = true;
            for (int b = 0;  b < currWord.length(); b++) {
                if (!row2.contains(currWord.toLowerCase().charAt(b)) && result) {
                    result = false;
                }
            }
            if (result){
                alWords.add(currWord);
                continue;
            }

            result = true;
            for (int c = 0;  c < currWord.length(); c++) {
                if (!row3.contains(currWord.toLowerCase().charAt(c)) && result) {
                    result = false;
                }
            }
            if (result){
                alWords.add(currWord);
            }
        }
        String[] resultWords;
        resultWords = alWords.toArray(new String[0]);
        return resultWords;
    }
    public static void main(String[] args) {
    }
}
