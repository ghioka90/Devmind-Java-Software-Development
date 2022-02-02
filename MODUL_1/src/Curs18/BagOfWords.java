package Curs18;

import java.util.Scanner;
 
public class BagOfWords {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String stopKeyword = "St0p!";
    
    int maxLength = 1000; // max number of words
    String[] largeArray = new String[maxLength];
    int numberOfElements = 0;
 
    String read = sc.next();
    while (!read.equals(stopKeyword)) {
      largeArray[numberOfElements] = read;
      numberOfElements++;
 
      // if max capacity is reached, quit reading new words
      if (numberOfElements == maxLength) {
        System.out.println("Maximum capacity reached, sorry!");
        break;
      }
 
      read = sc.next();
    }
 
    System.out.println("Number of elements read and stored: " + numberOfElements);
    System.out.println("Array dimension: " + largeArray.length);
    System.out.println("Elements:");
    for (int i=0; i<numberOfElements; i++) { // we can't use '.length'
      System.out.print(largeArray[i] + ", ");
    }
    System.out.println();
  }
}