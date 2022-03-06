package Curs15;

public class BigNumbers {

  public int[] sum(int[] op1, int[] op2) {
    // TODO: Your code goes here...
    int length = 0;
    int noSum = 0;
    int mem = 0;

    if (op1.length >= op2.length){
      length = op1.length + 1;
    }else {
      if (op1.length < op2.length){
        length = op2.length + 1;
      }
    }
    int [] sum = new int[length];


    for( int i = sum.length - 1; i >= 0; i--){
      if ((op1[i] + op2[i]) < 10 ) {
        sum[i] = op1[i] + op2[i] + mem;
        mem = 0;
      }else{
        if ((op1[i] + op2[i]) > 10 ){
          noSum = op1[i] + op2[i];
          sum[i] = noSum % 10;
          mem = 1;
        }
      }
    }
    return sum;



  }
  
  public static void main(String[] args) {
    System.out.println("Checking input...");
    
    int[] op1 = {2, 1, 7, 8};
    int[] op2 = {5, 9, 6};
    
    BigNumbers bn = new BigNumbers();
    int[] rez = bn.sum(op1, op2);
    int[] correct = {2, 7, 7, 4};
    System.out.println(noToString(op1) + " + " + noToString(op2) + 
                       " = " + noToString(rez) + " C: " + noToString(correct));
  }
  
  private static String noToString(int[] no) {
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < no.length; i++) {
      sb.append(no[i]);
    }
    return sb.toString();
  }
}