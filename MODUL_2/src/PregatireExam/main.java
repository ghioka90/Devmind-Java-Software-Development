package PregatireExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class main {
    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int max = 0;
        int count = 1;
        for (int i = 0; i < candles.size(); i++){
            if (candles.get(i) == max){
                count++;
            }else {
                if (candles.get(i) > max) {
                    max = candles.get(i);
                }
            }
        }
        return count;
    }


}

