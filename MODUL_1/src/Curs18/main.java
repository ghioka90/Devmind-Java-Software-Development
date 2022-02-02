package Curs18;


class main {

    static void UnionArray(int A[], int B[])
    {
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

    static void diffArray (int A[], int B[]){
        boolean equals;
        int count = 0;
        int[] C = new int [2];
        for (int i = 0; i < A.length; i++) {
            equals = false;
            for (int j = 0; j < B.length; j++) {

                if (A[i] == B[j]) {
                    equals = true;
                }
            }
            if (equals == false) {
                System.out.print(A[i] + " ");
            }
        }
    }

    static void interArray (int A[], int B[]){
        boolean equals;
        int count = 0;
        int[] C = new int [2];
        for (int i = 0; i < A.length; i++) {
            equals = false;
            for (int j = 0; j < B.length; j++) {

                if (A[i] == B[j]) {
                    equals = true;
                }
            }
            if (equals == true) {
                System.out.print(A[i] + " ");
            }
        }
    }

    // Driver Code
    public static void main(String args[])
    {
        int A[] = { 2, 100, 4, 18, 23 };
        int B[] = { 1, 9, 15, 100, 98, 18, 34, 44};

        System.out.print("A ∪ B = ");
        UnionArray(A, B);
        System.out.println();
        System.out.print("A / B = ");
        diffArray(A, B);
        System.out.println();
        System.out.print("A ∩ B = ");
        interArray(A,B);
        System.out.println();

    }
}

