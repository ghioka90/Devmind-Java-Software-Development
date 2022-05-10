package Curs24;

public class Node {
    int value;
    Node next;
    Node previous;


    public Node(int value,Node next, Node previous){
        this.next = next;
        this.value = value;
        this.previous = previous;
    }

    public Node(){
    }

    public int value(){
        return value;
    }

    public void value(int value){
        this.value = value;
    }

    public Node next(){

        return next;
    }

    public void next(Node next){
        this.next=next;
    }

    public Node prev(){

        return previous;
    }

    public void prev(Node previous){
        this.previous = previous;
    }
}