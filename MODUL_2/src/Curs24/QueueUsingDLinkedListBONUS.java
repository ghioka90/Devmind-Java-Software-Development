package Curs24;

public class QueueUsingDLinkedListBONUS {
    Node head ;
    Node tail;
    int size = 0;

    public QueueUsingDLinkedListBONUS(){
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == tail;
    }

    public int getSize() {
        return size;
    }

    public void insert(int data){
        Node temp = new Node(data,null,null);
        temp.value = data;
        temp.next = null;

        if(head == null){
            head = tail = temp;
            head.previous = null;

        }
        else{
            tail.next = temp;
            temp.previous = tail;
            tail = temp;
        }
    }

    public int remove(){
        if(head.next == tail)
            return 0;
        Node temp = head.next;
        head.next = temp.next;
        temp.next.previous = head;
        list();
        return temp.value;



    }

    public void list(){
        System.out.println("Queues");
        if(size == 0){
            System.out.println("Is Empty");

        }
        Node temp = head;
        while(temp != tail.next()){
            System.out.println(temp.value() + " ");
            temp = temp.next();
        }
        System.out.println();
    }




    public static void main(String[] args) {

    }
}
