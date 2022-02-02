package Curs18;

public class ex1 {
    static void diffArray (int A[], int B[]){
        boolean equals;
        int count = 0;
        int[] C = new int [A.length];

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

    public static void main(String[] args) {
    /*
    1. Se citesc doi array (A respectiv B) de la tastatura, fiecare reprezentand cate o multime de numere.
    Prin definitie, orice multime de numere contine elemente unice, prin urmare cei doi vectori nu vor contine duplicate.
    Task-ul tau este sa implementezi operatia de diferenta a doua multimi (i.e. A \ B).

    Conform definitiei, diferenta a doua multimi va contine toate elementele din multimea A care nu se regasesc in multimea B.
    Formula matematica ce defineste operatia de scadere este: A \ B = { x ε A | x ∉ B }
         */
        // Exemplul 1:
        int[] A = {2, 100, 4, 18, 23,};
        int[] B = {1, 9, 15, 100, 98, 18, 34, 44};


        // Exemplul 2:
//        int[] A = {1, 6, 555, 0, 88};
//        int[] B = {2, 555, 0, 10, 6};

        System.out.print("A / B = ");
        diffArray(A,B);


    }
}

