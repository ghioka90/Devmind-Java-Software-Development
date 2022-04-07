package Curs21;

public class UsingLinkedLists {

  // helper method to create a list from an array of values
  private static ListNode<Double> makeList(double[] values) {
    ListNode<Double> head = new ListNode<>();
    ListNode<Double> it = head;


    for (double el : values) {
      ListNode<Double> newListNode = new ListNode<>(el);
      it.next(newListNode);
      it = it.next();
    }
    return head.next();
  }

  // iterate over all elements of a linked list
  public static void iterate(ListNode<Double> listHead) {
    ListNode<Double> it = listHead; // The iterator points to the first element in the list
    while (it != null) { // while we have not reached the end of the list
      double crtElement = it.value();// accessing the element in the Node indicated by the iterator
      System.out.println(crtElement); // for demo purpose: printing the element
      it = it.next(); // updating the iterator to point to the next node
    }
  }

  static final double EPS = 0.0000001; // maximum accepted error for comparison
  // search for a certain key in a linked list
  public static boolean find(ListNode<Double> listHead, double searchKey) {

    // using a for loop for iteration
    for (ListNode<Double> it = listHead; it != null; it = it.next()) {
      if (Math.abs((it.value() - searchKey)) < EPS) { // comparing 2 double values
        return true;
      }
    }
    return false;
  }

  // insert the 'newValue' in the list at the 'pos' position
  public static ListNode<Double> insert(ListNode<Double> listHead, double newValue, int pos) {
    // Special case - inserting in place of the head of the list
    if (pos == 0) {
      // create a new node containing the new inserted element
      ListNode<Double> newListNode = new ListNode<>(newValue);

      // newNode's next element is the old head of the list
      newListNode.next(listHead);

      // head of the resulting list is the newly created node
      return newListNode;
    }

    // Insertion steps:
    // (0) - move the iterator 'it' on the node *before* the insertion
    ListNode<Double> it = listHead;
    for (int i=0; i<pos-1; i++) {
      it = it.next();
    }

    // (1) - create a node containing the new inserted element
    ListNode<Double> newListNode = new ListNode<>(newValue);

    // (2) - newNode indicates the 'after' node
    newListNode.next(it.next());

    // (3) - previous node indicates the new created node
    it.next(newListNode);

    return listHead;
  }

  // remove the element at the 'pos' position from the list and
  // return the new list head
  public static ListNode<Double> remove(ListNode<Double> listHead, int pos) {
    // Special case - removing the head of the list
    if (pos == 0) {
      // return the successor of the old head node
      return listHead.next();
    }

    // Removal steps:
    // (0) - move the iterator 'it' on the node *before* the one removed
    ListNode<Double> it = listHead;
    for (int i=0; i<pos-1; i++) {
      it = it.next();
    }

    // (1) - update the reference of the previous node
    //       to indicate the node after the deleted one
    it.next(it.next().next());

    // return the current list head
    return listHead;
  }

  public static ListNode removeDuplicates(ListNode<Double> listHead) {
    double prevElement = listHead.value();
    ListNode<Double> it = listHead;
    while (it != null) {
      if (it.next == null){
        break;
      }

      if (it.val == it.next.val) {
        it.next = it;
      } else {
        it = it.next;
      }
    }
    return listHead;
    }
//
//    // return the current list head
//    return listHead;
//  }

  public static int useList2(ListNode<Double> list) {
    int count = 0;
    while (list.next() != null && list.next().next()!= null) {
      list = list.next();
      count++;
    }

    return count;
  }

  
  public static void main(String[] args) {
    double[] values = {24.15, 24.15, 3.33, 1.01, 19.30, 16.11};
    ListNode<Double> list = makeList(values);




//    double searchKey = 12.45;
//    System.out.println("Element " + searchKey + " exists? Answer: " + find(list, searchKey));
//
//    list = insert(list, 87.26, 2);
//    iterate(list);
//
//    remove(list, 4);
//    iterate(list);
//    removeDuplicates(list);
//    iterate(list);
    removeDuplicates(list);

  }
}