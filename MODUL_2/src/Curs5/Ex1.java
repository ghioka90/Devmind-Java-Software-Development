package Curs5;

import java.util.ArrayList;
import java.util.Arrays;


public class Ex1 {

    public static void elementsWithMaxFerq(ArrayList<String> arrayString) {
        ArrayList<String> eleMaxFreq = new ArrayList<String>();
        int maxFreq = 0;
        for (int i = 0; i < arrayString.size(); i++) {
            int freq = 0;
            if (!eleMaxFreq.contains(arrayString.get(i))) {
            for (int j = i; j < arrayString.size(); j++) {
                if (arrayString.get(i) == arrayString.get(j))
                    freq++;
                }
                if (freq == maxFreq)
                    eleMaxFreq.add(arrayString.get(i));
                if (freq > maxFreq) {
                    maxFreq = freq;
                    eleMaxFreq.clear();
                    eleMaxFreq.add(arrayString.get(i));
                }
            }
        }
        System.out.println("Elements with maximum frequency are: " + eleMaxFreq + ", and the frequence is: " + maxFreq);
    }

    public static void elementsWithMinFerq(ArrayList<String> arrayString) {
        ArrayList<String> eleMinFreq = new ArrayList<String>();
        int minFreq = arrayString.size() + 1;
        int freq;
        for (int i = 0; i < arrayString.size(); i++) {
//            System.out.println(eleMinFreq);
            freq = 0;
//            System.out.println();
//            System.out.println(i);
            int j;
//            System.out.println(arrayString.indexOf(arrayString.get(i)));
            if (!eleMinFreq.contains(arrayString.get(i))) {
                for (j = 0; j < arrayString.size(); j++) {
                    if (arrayString.get(i) == arrayString.get(j))
                        freq++;

//                    System.out.println(freq);
                }
                if (freq == minFreq) {
                    eleMinFreq.add(arrayString.get(i));
//                    System.out.println("Added at i = " + i + " and j = " + j);
//                    System.out.println(eleMinFreq);
                }
                if (freq < minFreq) {
                    minFreq = freq;
                    eleMinFreq.clear();
                    eleMinFreq.add(arrayString.get(i));
//                    System.out.println("Added at i = " + i + " and j = " + j);
//                    System.out.println(eleMinFreq);
                }
            }
        }
        System.out.println("Elements with minimum frequency are: " + eleMinFreq + ", and the frequence is: " + minFreq);
    }

        public static void main (String[]args){
            ArrayList<String> cityes =
                    new ArrayList<String>(Arrays.asList("Iasi", "Bucuresti", "Buzau", "Buzau", "Buzau", "Buzau", "Constanta", "Constanta", "Constanta"));
            elementsWithMaxFerq(cityes);
            elementsWithMinFerq(cityes);

        }

    }