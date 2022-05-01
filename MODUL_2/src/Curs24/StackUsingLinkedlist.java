package Curs24;

import java.util.LinkedList;

class StackUsingLinkedlist {
    int capacity;
    int size;

    private LinkedList<Integer> list = new LinkedList();

    public StackUsingLinkedlist(int capacity){
        this.capacity = capacity;
        this.size = 0;
    }

    public void push(Integer number){
        //Pushes an item onto the top of this stack.
            if(this.size == this.capacity){
                System.out.println("Stack is full.");
            }else {
            list.addLast(number);
            size++;
            }

    }
    public Integer top(){
        //Looks at the object at the top of this stack without removing it from the stack.
        if (empty()) {
            System.out.println("Stack is empty.");
            return null;
        } else
        return list.getLast();
    }

    public Integer pop(){
        //Removes the object at the top of this stack
        // and returns that object as the value of this function.
        if (empty()) {
            System.out.println("Stack is empty.");
            return null;
        } else
            size--;
        return list.removeLast();
    }

    public boolean empty(){
        //Tests if this stack is empty.
        if (this.size == 0){
            return true;
        }else
            return false;
    }

    public void display(){
        if (empty()) {
            System.out.println("Stack is empty.");
        }else {
            System.out.print("Elements in the linked list stack are: ");
            for (Integer el : list) {
                System.out.print("[" + el + "]");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        StackUsingLinkedlist stack = new StackUsingLinkedlist(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.display();

        System.out.println("Top element is: " + stack.top());
        System.out.println("Removed element: " + stack.pop());
        System.out.println("Removed element: " + stack.pop());
        System.out.println("Stack is empty? " + stack.empty());

        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.display();
        System.out.println("Top element is: " + stack.top());
        System.out.println("Removed element: " + stack.pop());
        System.out.println("Removed element: " + stack.pop());
        System.out.println("Removed element: " + stack.pop());
        stack.display();
        System.out.println("Removed element: " + stack.pop());
        System.out.println("Removed element: " + stack.pop());
        System.out.println("Removed element: " + stack.pop());
        System.out.println("Stack is empty? " + stack.empty());
        stack.display();
    }
}
