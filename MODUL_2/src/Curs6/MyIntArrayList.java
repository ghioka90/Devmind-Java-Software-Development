package Curs6;

import java.util.Arrays;

public class MyIntArrayList {

  private int[] elements;
  private int size;


  public MyIntArrayList() {
    this(10);
  }


  public MyIntArrayList(MyIntArrayList c) {
    this.size = c.size;
    this.elements = new int[this.size + 1];
    for (int i = 0; i < this.size; i++) {
      this.elements[i] = c.get(i);
    }
  }


  public MyIntArrayList(int initialCapacity) {
    this.elements = new int[initialCapacity];
  }

  public void add(int index, int e) {
    if (this.size == this.elements.length) {
      this.elements = Arrays.copyOf(this.elements, this.size * 2);
    }
    if (index >= 0 && index < this.size) {
      for (int i = this.size; i > index; i--) {
        elements[i] = elements[i - 1];
      }
      elements[index] = e;
      this.size++;
    } else {
      System.out.println("Throwing IndexOutOfBoundsException when trying to" +
              " add element at position " + index);
    }
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
    for (int i = 0; i < this.size; i++) {
      if (this.elements[i] == e) {
        return i;
      }
    }
    return -1;
  }


  public boolean contains(int e) {
    for (int i = 0; i < this.size; i++) {
      if (this.elements[i] == e) {
        return true;
      }
    }
    return false;
  }


  public int lastIndexOf(int e) {
    int lastIndex = 0;
    for (int i = this.size; i >= 0; i--) {
      if (this.elements[i] == e) {
        lastIndex = i;
        break;
      }
    }
    return lastIndex;
  }


  public boolean remove(int e) {
    if (lastIndexOf(e) == this.size - 1) {
      size--;
      return true;
    }
    if (this.contains(e)) {
      for (int i = indexOf(e); i < this.size; i++) {
        this.elements[i] = this.elements[i + 1];
      }
      this.size--;
      return true;
    }
    return false;
  }


  public int removeElementAtIndex(int index) {
    if (index < 0 || index >= this.size) {
      // should throw IndexOutOfBoundsException
      System.out.println("Throwing IndexOutOfBoundsException when trying to" +
              " remove element at position " + index);
      return -1;
    }
    int removedElement = this.elements[index];
    for (int i = index; i < this.size; i++) {
      this.elements[i] = this.elements[i + 1];
    }
    this.size--;
    return removedElement;
  }


  public void clear() {
    this.size = 0;
  }


  public int get(int index) {
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


  public boolean addAll(MyIntArrayList c) {
    return addAll(this.size-1, c);
    }


  public boolean addAll(int index, MyIntArrayList c){
    if (c.size() == 0) {
      System.out.println("The specified collection is empty.");
      return false;
    }

      if (index >= 0 && index <= this.size){
        this.elements = Arrays.copyOf(this.elements,this.size + c.size() + 1);
        this.size += c.size();

        for ( int i = this.size - 1; i >= index; i--){
          this.elements[i] = this.elements[i - c.size()];
        }
        for (int i = 0; i <= c.size; i++){
          this.elements[index] = c.get(i);
          index++;
        }
        return true;
      }else{
        System.out.println("Throwing IndexOutOfBoundsException when trying to add" +
                " the collection " + c + " from position " + index);
        return false;
      }
  }


  public int[] toArray(){
    int[] newArray = new int[this.size];

    for (int i = 0; i < this.size-1; i++){
      newArray[i] = this.elements[i];
    }
    return newArray;
  }


  public void ensureCapacity(int minCapacity){
      this.elements = Arrays.copyOf(this.elements, minCapacity);
  }


  public void trimToSize(){
      this.elements = Arrays.copyOf(this.elements, this.size + 1);
    }

  public void printArray(){

    if (size != 0) {
      System.out.println("The arrayList is: ");
      for (int i = 0; i < size; i++){
        System.out.print( this.elements[i] + " ");
      }
      System.out.println();
    }else{
      System.out.println("The arrayList is empty.\n");
    }
  }
}