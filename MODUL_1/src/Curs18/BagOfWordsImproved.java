package Curs18;

import java.util.Scanner;
 
public class BagOfWordsImproved {
  
  public static String[] increaseCapacity(String[] array, int newLength) {
    // a. create a new array, that is double in size
    String[] largerArray = new String[newLength];
    
    // b. copy all elements in the new array
    for(int i=0; i<array.length; i++) {
      largerArray[i] = array[i];
    }
    
    // c. return the reference of the new array 
    //    in order to override existing reference
    return largerArray;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String stopKeyword = "St0p!";
    
    int initCapacity = 2; // the initial capacity of the array
    String[] array = new String[initCapacity];
    int numberOfElements = 0;
 
    String read = sc.next();
    while (!read.equals(stopKeyword)) {
      array[numberOfElements] = read;
      numberOfElements++;
      
      // if max capacity is reached, "resize" the array
      if (numberOfElements == array.length) {
        array = increaseCapacity(array, array.length * 2);
      }
      
      read = sc.next();
    }
 
    System.out.println("Number of elements read and stored: " + numberOfElements);
    System.out.println("Array dimension: " + array.length);
    System.out.println("Elements:");
    for (int i=0; i<numberOfElements; i++) { // we can't use '.length'
      System.out.print(array[i] + ", ");
    }
    System.out.println();
  }
}