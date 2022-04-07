package Curs21;

public class LC_RemoveDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode it = head;
        while (it != null){
            if (it.next == null){
                break;
            }

            if (it.val == it.next.val){
                it.next = it.next.next;
            }else{
                it = it.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
    }
}
