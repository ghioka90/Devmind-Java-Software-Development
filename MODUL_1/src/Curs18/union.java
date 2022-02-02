package Curs18;

public class union {

    public static boolean search(int[] array, int value) {
        for (int i=0; i<array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
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

    static void unionArray(int A[], int B[]) {

        int i = 0;
        int count = 0;
        int C[] = new int[A.length + B.length];

        for (; i < A.length; i++) {
            if ((search(B, A[i])) != true) {
                C[count] = A[i];
                count++;
            }
        }

        for (; i < (A.length + B.length); i++) {
            C[count] = B[i - A.length];
            count++;
        }
//        bubbleSort(C);

        for (int k = 0; k < count; k++) {
            System.out.print(C[k] + " ");
        }
        System.out.println();

    }



    public static void main(String[] args) {
        int A[] = { 2, 100, 4, 18, 23 };
        int B[] = { 1, 9, 15, 100, 98, 18, 34, 44};

        System.out.print("A ∪ B = ");
        unionArray(A, B);
    }
}
