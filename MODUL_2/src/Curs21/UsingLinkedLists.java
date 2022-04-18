package Curs21;

public class UsingLinkedLists {
  
  // helper method to create a list from an array of values
  public static Node<Double> makeList(double[] values) {
    Node<Double> head = new Node<>();
    Node<Double> it = head;
    for (double el : values) {
      Node<Double> newNode = new Node<>(el);
      it.next(newNode);
      it = it.next();
    }
    return head.next();
  }

  // iterate over all elements of a linked list
  public static void iterate(Node<Double> listHead) {
    Node<Double> it = listHead; // The iterator points to the first element in the list
    while (it != null) { // while we have not reached the end of the list
      double crtElement = it.value(); // accessing the element in the Node indicated by the iterator
      System.out.println(crtElement); // for demo purpose: printing the element
      it = it.next(); // updating the iterator to point to the next node
    }
  }
  
  // search for a certain key in a linked list 
  public static boolean find(Node<Double> listHead, double searchKey) {
    final double EPS = 0.0000001; // maximum accepted value for double comparison
     
    // using a for loop for iteration
    for (Node<Double> it = listHead; it != null; it = it.next()) {
      if (Math.abs((it.value() - searchKey)) < EPS) { // comparing 2 double values
        return true;
      }
    }
    return false;
  }
  
  // insert the 'newValue' in the list at the 'pos' position
  public static Node<Double> insert(Node<Double> listHead, double newValue, int pos) {
    // Special case - inserting in place of the head of the list
    if (pos == 0) {
      // create a new node containing the new inserted element
      Node<Double> newNode = new Node<>(newValue);
 
      // newNode's next element is the old head of the list
      newNode.next(listHead);
 
      // head of the resulting list is the newly created node
      return newNode;
    }
 
    // Insertion steps:
    // (0) - move the iterator 'it' on the node *before* the insertion
    Node<Double> it = listHead; 
    for (int i=0; i<pos-1; i++) {
      it = it.next();
    }
 
    // (1) - create a node containing the new inserted element
    Node<Double> newNode = new Node<>(newValue); 
 
    // (2) - newNode indicates the 'after' node
    newNode.next(it.next());
 
    // (3) - previous node indicates the new created node
    it.next(newNode);
 
    return listHead;
  }
  
  // remove the element at the 'pos' position from the list and
  // return the new list head
  public static Node<Double> remove(Node<Double> listHead, int pos) {
    // Special case - removing the head of the list
    if (pos == 0) {
      // return the successor of the old head node
      return listHead.next();
    }
 
    // Removal steps:
    // (0) - move the iterator 'it' on the node *before* the one removed
    Node<Double> it = listHead;
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
}