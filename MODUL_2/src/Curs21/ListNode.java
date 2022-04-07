package Curs21;
 
public class ListNode<E> {
  public E val;
  public ListNode<E> next;
  
  public ListNode(E val, ListNode<E> next) {
    this.val = val;
    this.next = next;
  }
  
  public ListNode(E val) {
    this(val, null);
  }
  
  public ListNode() {}
  
  public void val(E value) {
    this.val = value;
  }
  
  public E value() {
    return val;
  }
  
  public ListNode<E> next() {
    return next;
  }
  
  public void next(ListNode<E> next) {
    this.next = next;
  }
}