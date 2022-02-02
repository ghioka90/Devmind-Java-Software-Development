package ALGORITMI;

public class array {
    public static void updateElement(int[] array, int index, int newValue) {
        array[index] = newValue;
    }

    public static void displayArray(int[] array) {
        System.out.print("Values are: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static void diffArray(int A[], int B[]) {
        boolean equals;
        int count = 0;
        int[] C = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            equals = false;
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    equals = true;
                }
            }
            if (equals == false) {
                C[count] = A[i];
                count++;
            }
        }
        for (int k = 0; k < count; k++) {
            System.out.print(C[k] + " ");
        }
    }

    static void interArray(int A[], int B[]) {
//            boolean equals;
//            int count = 0;
//            int[] C = new int[A.length];
//            for (int i = 0; i < A.length; i++) {
//                equals = false;
//                for (int j = 0; j < B.length; j++) {
//
//                    if (A[i] == B[j]) {
//                        equals = true;
//                    }
//                }
//                if (equals == true) {
//                    C[count] = A[i];
//                    count++;
//                }
//            }
//            for (int k = 0; k < count; k++) {
//                System.out.print(C[k] + " ");
//            }
        }

    static void UnionArray(int A[], int B[]) {
        // Taking max element present in either array
        int m = A[A.length-1];
        int n = B[B.length-1];

        int ans = 0;

        if (m > n) {
            ans = m;
        }
        else
            ans = n;

        // Finding elements from 1st array
        // (non duplicates only). Using
        // another array for storing union
        // elements of both arrays
        // Assuming max element present
        // in array is not more than 10^7
        int newtable[] = new int[ans + 1];

        // First element is always
        // present in final answer
        System.out.print(A[0] + " ");

        // Incrementing the First element's count
        // in it's corresponding index in newtable
        ++newtable[A[0]];

        // Starting traversing the first
        // array from 1st index till last
        for (int i = 1; i < A.length; i++) {
            // Checking whether current element
            // is not equal to it's previous element
            if (A[i] != A[i - 1]) {
                System.out.print(A[i] + " ");
                ++newtable[A[i]];
            }
        }

        // Finding only non common
        // elements from 2nd array
        for (int j = 0; j < B.length; j++) {
            // By checking whether it's already
            // present in newtable or not
            if (newtable[B[j]] == 0) {
                System.out.print(B[j] + " ");
                ++newtable[B[j]];
            }
        }
    }

    public static boolean searchArray(String[] array, String value) {
        for (int i=0; i<array.length; i++) {
            if (array[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    public static boolean swapElements(double[] array, int index1, int index2) {
        // validarea indecsilor
        if (index1 < 0 || index1 >= array.length ||
                index2 < 0 || index2 >= array.length) {
            return false;
        }

        // algoritmul de interschimbare
        double aux = array[index1];
        array[index1] = array[index2];
        array[index2] = aux;

        return true;
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        int aux;

        do {
            swapped = false;

            for (int i = 1; i < n; i++) {

                if (array[i - 1] > array[i]) {
                    aux = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = aux;
                    swapped = true;
                }
            }
        } while(swapped);
    }

    public static void selectionSort(int[] array) {
        int n = array.length;
        int jMin, aux;

        for (int i = 0; i < n - 1; i++) {
            jMin = i;

            for (int j = i; j < n; ++j) {
                if (array[j] < array[jMin]) {
                    jMin = j;
                }

            }

            if (jMin != i) {
                aux = array[i];
                array[i] = array[jMin];
                array[jMin] = aux;
            }
        }
    }

    public static int countOccurrencesIgnoreCase(String[] array, String key) {
        int count = 0;

        for (int i = 0;  i < array.length; i++) {
            String lowerCaseWord = array[i].toLowerCase();
            String lowerCaseKey =  key.toLowerCase();
            if (lowerCaseWord.equals(lowerCaseKey)) {
                count++;
            }
        }

        return count;
    }

    public static boolean isPalindromIgnoreCase(String word){
        String lowerCaseWord = word.toLowerCase();
        int i = 0, j = lowerCaseWord.length() - 1;
        while (i < j){
            if (lowerCaseWord.charAt(i) != lowerCaseWord.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

        public static void main (String[]args){
        }
}

