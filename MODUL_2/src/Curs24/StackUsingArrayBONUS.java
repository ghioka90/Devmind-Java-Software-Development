package Curs24;

import java.lang.reflect.Array;

public class StackUsingArrayBONUS {
    int capacity;
    int size;

    private  Integer[] array;

    public StackUsingArrayBONUS(int capacity){
        this.capacity = capacity;
        this.size = 0;
        this.array = new Integer[capacity];
    }

    public void push(Integer number){
        if(this.size == this.capacity - 1){
            System.out.println("Stack is full.");
        }else {
            array[size] = number;
            size++;
        }

    }
    public Integer top(){
        if (empty()) {
            System.out.println("Stack is empty.");
            return null;
        } else
            return array[size - 1];
    }

    public Integer pop(){
        int temp;
        if (empty()) {
            System.out.println("Stack is empty.");
            return null;
        } else {
            temp = array[size-1];
            array[size -1] = null;
            size--;
        }
        return temp;
    }

    public boolean empty(){
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
            for (Integer el : array) {
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
        stack.push(6);
        stack.push(7);
        stack.display();
        System.out.println("Removed element: " + stack.pop());
        System.out.println("Removed element: " + stack.pop());
        System.out.println("Removed element: " + stack.pop());
        System.out.println("Stack is empty? " + stack.empty());
        stack.display();
    }
}
