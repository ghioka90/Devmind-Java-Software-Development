package Curs28;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static int countChars(List<String> list) {
        int amount = 0;
        for (String word : list) {
            try {
                amount += word.length();
            } catch (IndexOutOfBoundsException e){
                amount += 0;
            }
        }
        return amount;
    }
    public static void main(String[] args) {
        List<String> list =  new ArrayList<String>();
        list.add("tennis");
        list.add("football");
        list.add(null);
        list.add("volei");

        System.out.println(countChars(list));
     }
}
