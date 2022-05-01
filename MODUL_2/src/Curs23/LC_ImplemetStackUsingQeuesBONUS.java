package Curs23;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LC_ImplemetStackUsingQeuesBONUS {
    Queue<Integer> qStack;

    public LC_ImplemetStackUsingQeuesBONUS() {
        qStack = new LinkedList<>();
    }

    public void push(int x) {
        qStack.add(x);
        for(int i = 1; i < qStack.size(); i++)
            qStack.add(qStack.poll());
    }

    public int pop() { //Removes the object at the top of this stack and returns that object as the value of this function.
        return qStack.poll();
    }

    public int top() { //Looks at the object at the top of this stack without removing it from the stack.
        return qStack.peek();
    }

    public boolean empty() {
        return qStack.isEmpty();
    }

    public static void main(String[] args) {
    }
}
