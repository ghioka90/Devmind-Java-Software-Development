package Curs23;

import java.util.Deque;
import java.util.Stack;

public class LC_BaseballGameBONUS {
    public int calPoints(String[] ops) {
        Stack<Integer> record = new Stack<>();

        for(String el : ops){
            if (el.equals("C")) {
                record.pop();
            }else
                if (el.equals("D")){
                int lastEl = record.peek();
                lastEl = 2 * lastEl;
                record.push(lastEl);
            }else
                if(el.equals("+")){
                int lastEl = record.pop();
                int previousEl = record.pop();
                int result = lastEl + previousEl;
                record.push(previousEl);
                record.push(lastEl);
                record.push(result);
            }else{
                int number = Integer.parseInt(el);
                record.push(number);
            }
        }
        int sum = 0;
        while(record.size() > 0){
            sum += record.pop();
        }
        return sum;
    }
    public static void main(String[] args) {
    }
}
