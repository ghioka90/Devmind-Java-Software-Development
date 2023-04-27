package Exercitii;

import java.util.ArrayDeque;
import java.util.Deque;

public class main extends Coordinates {
    public static void main(String[] args) {
        Device device = new Phone();
        device.displayMessage("User input from the keyboard");

        Coordinates3D p1 = new Coordinates3D(2, 3, 1);
        Coordinates3D p2 = new Coordinates3D(4, 0, 2);
        if (p1 == p2) {
            System.out.println("Points are equal.");
        } else {
            System.out.println("Points are not equal.");
        }

        Integer[] rawCollection = {2, 1, 3, 5, 8};
        Deque<Integer> stack = new ArrayDeque<Integer>();
        for (int i=0; i<rawCollection.length; i++) {
            stack.push(rawCollection[i]);
        }
        stack.pop();
        stack.peek();
        stack.pop();
        stack.push(4);
        stack.pop();
        System.out.println(stack.peek());


    }
}
