package Exercitii;

public class ADP {

        int birds = 10;
      private static int count;
      private static String[] stops = new String[] {"Washington","Monroe", "Jackson", "LaSalle"};


    static void reversingArray(int[] A) {
        int temp = 0;
        int lastIndex = A.length - 1;

        for (int i = 0; i <= lastIndex / 2; i++) {
            temp = A[i];
            A[i] = A[lastIndex - i];
            A[lastIndex - i] = temp;
        }
        for (int i = 0; i< A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    static boolean hasSpaces(String test){
        return test.contains(" ");
    }

    static void movingZeroToRight(int[] arr){
        int n = arr.length;
        int count = 0;
        for (int i = 0 ; i < n; i++){
            if (arr[i] != 0){
                arr[count++] = arr[i];
            }
        }
        while (count<n){
            arr[count++]=0;
        }
        for (int i = 0 ; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
        static boolean testEgualsHello(String test){
            return test.equals("HELLO");
        }

    public static void ascSort1(int[] arr) {
        int n = arr.length; count = 1;
        for (int i = 0; i < n; i++) {
            if (count != 0) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        count++;
                    }
                }
            }
            else{
                break;}
        }
        for (int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void ascSort2(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < size; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }





    public static void main (String[]args){
//        String testA = "AB";
//        String testB = "";
//
//        try {
//            testB = testA.substring(0, 1);
//            System.out.println(testB);
//            testB = testB + testA.substring(2, 3);
//            System.out.println(testB);
//            testB = testB + "C";
//        }
//        catch (Exception e){
//            testB = testB + "D";
//        System.out.println(testB);}
//        finally {
//            testB = testB + "E";
//        }
//        System.out.println(testB);

//        while (count < stops.length){
//            if (stops[count++].length() < 8) {
//               break;
//            }
//        System.out.println(stops[count].length());
//        System.out.println(count);
//        }

//        int trees = 5;
//            System.out.println(trees+birds);

//        String hello = "Hello";
//
//            System.out.println(testEgualsHello(hello));
//
//
        int[] A = { 2, 1, 3, 4, 5, 6, 7, 8, 9, 0};

//        ascSort2(A);
//
//        String myString = null;
//
//        if ("test".equals(myString)){
//            System.out.println(true);.3

//        }
        System.out.println();
      reversingArray(A);
//
//      String aString = "anaarespatii";
//
//      movingZeroToRight(A);

//        try {
//            int a = 0;
//            System.out.println ("a = " + a);
//            int b = 20 / a;
//            System.out.println ("b = " + b);
//        }
//
//        catch(ArithmeticException e) {
//            System.out.println ("Divide by zero error");
//        }
//
//        finally {
//            System.out.println ("inside the finally block");
//        }


}
}
