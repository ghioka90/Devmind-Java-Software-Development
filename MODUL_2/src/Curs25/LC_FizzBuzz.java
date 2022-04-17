package Curs25;

import java.util.ArrayList;
import java.util.List;

public class LC_FizzBuzz {
    public static List<String> fizzBuzz(int n) {
       List <String> answer = new ArrayList<String>();

        for ( int i = 1; i <= n; i++){
            if (i % 3 == 0 && i % 5 == 0){
                answer.add("FizzBuzz");
            }else{
                if (i % 5 == 0){
                    answer.add("Buzz");
                }else{
                    if (i % 3 == 0){
                        answer.add("Fizz");
                    }else{
                        answer.add(String.valueOf(i));
                    }
                }
            }
        }
        return answer;

    }
    public static void main(String[] args) {
    }
}
