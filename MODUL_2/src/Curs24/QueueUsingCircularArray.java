package Curs24;

import java.util.ArrayList;

class QueueUsingCircularArray {
    private int size, first, last;
    private ArrayList<Integer> queue = new ArrayList<Integer>();


    QueueUsingCircularArray(int size) {
        this.size = size;
        this.first = this.last = -1;
    }

    public void offer(int number) {


        if((first == 0 && last == size - 1) ||
                (last == (first - 1) % (size - 1))) {
            System.out.print("Queue is Full");
        }
        else if(empty()) {
            first = 0;
            last = 0;
            queue.add(last, number);
        }

        else if(last == size - 1 && first != 0) {
            last = 0;
            queue.set(last, number);
        }

        else{
            last = (last + 1);
            if(first <= last) {
                queue.add(last, number);
            }
            else{
                queue.set(last, number);
            }
        }
    }

    public Integer poll() {

        int temp;
        if(empty()) {
            return null;
        }

        temp = queue.get(first);

        if(first == last){
            first = -1;
            last = -1;
        } else
            if(first == size - 1){
            first = 0;
        } else {
            first = first + 1;
        }

        return temp;
    }

    public Integer peek(){
        //Retrieves, but does not remove, the head of this queue,
        //or returns null if this queue is empty.
        int temp;
        if(empty()) {
            return null;
        }

        temp = queue.get(first);
        return temp;
    }

    public boolean empty(){
        if(first == -1) {
            return true;
        }else
            return false;
    }

    public void display(){

        if(empty()) {
            System.out.print("Queue is Empty");
        }else {
            System.out.print("Elements in the circular queue are: ");
            if (last >= first) {
                for (int i = first; i <= last; i++) {
                    System.out.print("[" + queue.get(i) + "]");
                }
                System.out.println();
            } else {
                for (int i = first; i < size; i++) {
                    System.out.print("[" + queue.get(i) + "]");
                }
                for (int i = 0; i <= last; i++) {
                    System.out.print("[" + queue.get(i) + "]");
                }
                System.out.println();
            }
        }
    }


    public static void main(String[] args) {

        QueueUsingCircularArray circularQueue = new QueueUsingCircularArray(5);

        circularQueue.offer(1);
        circularQueue.offer(2);
        circularQueue.offer(3);
        circularQueue.offer(4);
        circularQueue.display();

        System.out.println("First element of queue: " + circularQueue.peek());

        System.out.println("Removed element: " + circularQueue.poll());

        System.out.println("Removed element: " + circularQueue.poll());

        circularQueue.display();

        circularQueue.offer(5);
        circularQueue.offer(6);
        circularQueue.offer(7);

        System.out.println("First element of queue: " + circularQueue.peek());

        circularQueue.display();

        circularQueue.offer(8);
        System.out.println("Removed element: " + circularQueue.poll());
        System.out.println("Removed element: " + circularQueue.poll());
        circularQueue.display();
        System.out.println("Removed element: " + circularQueue.poll());
        System.out.println("Removed element: " + circularQueue.poll());
        System.out.println("Removed element: " + circularQueue.poll());
        System.out.println("Stack is empty? " + circularQueue.empty());
        circularQueue.display();
    }
}