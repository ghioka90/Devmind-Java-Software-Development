package Curs21;

public class LC_RemoveDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        // sentinel
        ListNode sentinel = new ListNode(0, head);

        // predecessor = the last node
        // before the sublist of duplicates
        ListNode previous = sentinel;


        while (head != null) {
            // if it's a beginning of duplicates sublist
            // skip all duplicates
            if (head.next != null && head.val == head.next.val) {
                // move till the end of duplicates sublist
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                // skip all duplicates
                previous.next = head.next;
                // otherwise, move predecessor
            } else {
                previous = previous.next;
            }

            // move forward
            head = head.next;
        }
        return sentinel.next;
    }
    public static void main(String[] args) {
    }
}
