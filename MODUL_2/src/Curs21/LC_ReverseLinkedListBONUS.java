package Curs21;

public class LC_ReverseLinkedListBONUS {
    public ListNode reverseList(ListNode head) {
        //if(head==null && head.next==null) return head;

        ListNode prev = null, curr = head;
        while( curr != null) {
            ListNode forw = curr.next;

            curr.next = prev;

            prev = curr;
            curr =forw;
        }

        return prev;
    }
    public static void main(String[] args) {
    }
}
