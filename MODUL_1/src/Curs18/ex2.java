package Curs18;

public class ex2 {
        static void interArray(int A[], int B[]) {
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
                        if (equals == true) {
                                C[count] = A[i];
                                count++;
                        }
                }
                for (int k = 0; k < count; k++) {
                        System.out.print(C[k] + " ");
                }
        }

        public static boolean search(int[] array, int value) {
                for (int i = 0; i < array.length; i++) {
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
                } while (swapped);
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
        /*
        2. Similar cu exercitiul anterior, se citesc de la tastatura 2 array, ce reprezinta 2 multimi de numere: A respectiv B. Se cere sa se calculeze:

        1. intersectia celor doua multimi: A ∩ B = { x | x ε A si x ε B}
        cu alte cuvinte, intersectia a doua multimi va contine toate elementele care se gasesc atat in A cat si in B (i.e. elementele comune celor doua multimi).
         */
                // ex 1
                int[] A = {2, 100, 4, 18, 23};
                int[] B = {1, 9, 15, 100, 98, 18, 34, 44};


                // ex 2
//                int[] A = {1, 6, 555, 0, 88};
//                int[] B = {2, 555, 0, 10, 6};

                System.out.print("A ∩ B = ");
                interArray(A, B);
                System.out.println();

        /*
        2.reuniunea celor doua multimi: A ∪ B = { x | x ε A sau x ε B}
        cu alte cuvinte, reuniunea a doua multimi va contine toate elementele care se
        gasesc in cel putin una dintre cele doua multimi (i.e. toate elementele „la un loc“ a celor doua multimi).
         */
                System.out.print("A ∪ B = ");
                unionArray(A, B);
                System.out.println();


        }

}


