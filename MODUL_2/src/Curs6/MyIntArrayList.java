package Curs6;

import java.util.Arrays;

public class MyIntArrayList {

  private int[] elements;
  private int size;
  
  public MyIntArrayList() {
    this(10);
  }

  public MyIntArrayList(MyIntArrayList c){

  }
  
  public MyIntArrayList(int initialCapacity) {
    this.elements = new int[initialCapacity];
  }
  
  public boolean add(int e) {
    if (this.size == this.elements.length) {
      this.elements = Arrays.copyOf(this.elements, this.size * 2);
    }
    
    this.elements[size] = e;
    this.size++;

    return true;
  }
  
  public int size() {
    return this.size;
  }
  
  public int indexOf(int e) {
    for (int i=0; i<this.size; i++) {
      if (this.elements[i] == e) {
        return i;
      }
    }
    return -1;
  }

  public boolean contains(int e) {
    for (int i=0; i<this.size; i++) {
      if (this.elements[i] == e) {
        return true;
      }
    }
    return false;
  }

  public boolean lastIndexOf(int e) {
    for (int i=this.size; i>=0; i--) {
      if (this.elements[i] == e) {
        return true;
      }
    }
    return false;
  }

//  public int remove(int e) {
//    if (index < 0 || index >= this.size) {
//      // should throw IndexOutOfBoundsException
//      System.out.println("Throwing IndexOutOfBoundsException when trying to" +
//              " remove element at position " + index);
//      return -1;
//    }
//
//    int removedElement = this.elements[index];
//    for (int i=index; i<this.size; i++) {
//      this.elements[i] = this.elements[i+1];
//    }
//    this.size--;
//
//    return removedElement;
//  }

  public int removeElementAtIndex(int index) {
    if (index < 0 || index >= this.size) {
      // should throw IndexOutOfBoundsException
      System.out.println("Throwing IndexOutOfBoundsException when trying to" +
                         " remove element at position " + index);
      return -1;
    }
    
    int removedElement = this.elements[index];
    for (int i=index; i<this.size; i++) {
      this.elements[i] = this.elements[i+1];
    }
    this.size--;
    
    return removedElement;
  }
  
  public void clear() {
    this.size = 0;
  }

  public int get(int index){
    return this.elements[index];
  }
  
  public int set(int index, int e) {
    if (index < 0 || index >= this.size) {
      // should throw IndexOutOfBoundsException
      System.out.println("Throwing IndexOutOfBoundsException when trying to set" +
                         " the element " + e + " at position " + index);
      return -1;
    }
    
    int replacedElement = this.elements[index];
    this.elements[index] = e;
    return replacedElement;
  }

//  public boolean addAll(MyIntArrayList c){
//    if( c.size() == 0){
//      return false;}
//
//
//  }
  
}