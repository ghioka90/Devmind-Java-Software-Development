package Curs23;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinStack {
    private Deque<Integer> stack = new ArrayDeque<>();
    private Deque<Integer> minStack = new ArrayDeque<>();

    /** initialize your data structure here. */
    public MinStack() {
        // helps to avoid treating .isEmpty() cases
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        stack.push(x);
        if (x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        int el = stack.pop();
        if (el == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
    public static void main(String[] args) {
    }
}
