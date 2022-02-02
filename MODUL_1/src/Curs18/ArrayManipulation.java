package Curs18;

public class ArrayManipulation {
  // update 'array' element at 'index' with 'newValue'
  public static void updateElement(int[] array, int index, int newValue) {
    array[index] = newValue;
  }
  
  public static void displayArray(int[] array) {
    System.out.print("Values are: ");
    for (int i=0; i<array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }
  
  public static void main(String[] args) {
    
    int[] randomArray = new int[10];
    
    // display initial values of the array
    // -> all elements are initialised to default value (using 'new')
    displayArray(randomArray);
    
    // I. change some values using a method
    updateElement(randomArray, 9, 130);
    updateElement(randomArray, 8, 470);
    updateElement(randomArray, 7, 100);
    
    // II. Copy the variable and modify the values through the copy
    // -> both variables refer same memory address
    int[] copyRandomArray = randomArray;
    copyRandomArray[0] = -100;
    copyRandomArray[1] = -200;
    updateElement(copyRandomArray, 2, -300);
    
    // display the new values
    // -> note the elements were updated in both cases: I. and II.
    displayArray(randomArray);
  }
}