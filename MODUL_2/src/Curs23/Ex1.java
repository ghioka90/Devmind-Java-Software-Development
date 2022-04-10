package Curs23;

import java.util.Stack;

public class Ex1 {
    public static boolean parantezeValide(String strg){
        Stack<Character> stack = new Stack<>();

        for (char currChar : strg.toCharArray()) {
            if (currChar == '(' || currChar == '[' || currChar == '{') {
                stack.push(currChar);
                System.out.println(stack);
            } else if (currChar == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
                System.out.println(stack);
            } else if (currChar == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
                System.out.println(stack);
            } else if (currChar == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
                System.out.println(stack);
            } else {
                stack.push(currChar);
                System.out.println(stack);
            }
        }
        System.out.println(stack);
        if (stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        String strg = "{}";

        System.out.println(parantezeValide(strg));
    }
}
