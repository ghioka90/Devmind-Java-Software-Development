package Curs23;

import java.util.LinkedList;
import java.util.Stack;

public class LC_ImplementQueueUsingStackBONUS {
    Stack<Integer> sQueue = new Stack<>();

    public LC_ImplementQueueUsingStackBONUS() {

    }

    public void push(int x) { //Pushes an item onto the top of this stack.
        sQueue.push(x);
    }

    public int pop() { //Removes the object at the top of this stack and returns that object as the value of this function.
        return sQueue.remove(0);
    }

    public int peek() { //Looks at the object at the top of this stack without removing it from the stack.
        return sQueue.firstElement();
    }

    public boolean empty() { //Returns true if Stack is empty.
        return sQueue.isEmpty();
    }

    public static void main(String[] args) {
    }
}
