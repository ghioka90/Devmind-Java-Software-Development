package Curs21;

public class LC_RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0) {
            return head;
        }
        ListNode it = head;
        int length = 1;
        while (it.next != null){
            it = it.next;
            length++;
        }
        it.next = head;

        k %= length;
        for ( int i = 0; i < length - k ; i++){
            it = it.next;
        }
        head = it.next;
        it.next = null;

        return head;
    }

    public static void main(String[] args) {
    }
}
