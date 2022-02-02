package WS01;

import java.util.ArrayList;

public class main {
    public String[] findWords(String[] words) {
        String case1 = "qwertyuiop";
        String case2 = "asdfghjkl";
        String case3 = "zxcvbnm";
        int wordsLength = words.length;
        ArrayList<String> resArray = new ArrayList<String>();



        for (int i = 0; i < wordsLength; i++) {
            String word = words[i];
            int count = 0;
            for (int j = 0; j < case1.length(); j++) {
                if ( word.toLowerCase().indexOf(case1.charAt(j)) != -1 ){
                   count++;
                }
            }
            if (count == word.length()){
                resArray.add(word);
            }
        }


        return resArray.toArray(new String[0]);
    }
    public static void main(String[] args) {
      String[]  words = {"Hello","Alaska","Dad","Peace"};


    }
}
