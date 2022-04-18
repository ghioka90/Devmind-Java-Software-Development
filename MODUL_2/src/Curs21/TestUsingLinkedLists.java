package Curs21;

public class TestUsingLinkedLists {

  public static void main(String[] args) {
    double[] values = {24.15, 24.15, 3.33, 1.01, 19.30, 16.11};
    Node<Double> list = makeList(values);

    // 1. Iterate over elements
    iterate(list);
    System.out.println();
    
    // 2. Search for an element
    double searchKey = 12.45;
    System.out.println("Element " + searchKey + " exists? Answer: " + find(list, searchKey));
    System.out.println();
    
    // 3. Insert an element
    insert(list, 87.26, 2);
    iterate(list);
    System.out.println();
    
    // 4. Remove an element
    remove(list, 4);
    iterate(list);
  }
}