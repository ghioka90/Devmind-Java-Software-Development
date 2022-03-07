package Curs14;

public class ex2 {
    static void matrixPrint (int [][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                System.out.print(M[i][j] + "  ");
            }
            System.out.println();
        }
    }

    static void adunare (int [][] A, int [][]B){
        int[][] C = new int[A.length][B[0].length];
        System.out.println("Adunare");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C.length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C.length; j++) {
                System.out.print(C[i][j] + "  ");
            }
            System.out.println();
        }
    }

    static void scadere (int [][] A, int [][]B){
        int[][] C = new int[A.length][B[0].length];
        System.out.println("Scadere");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C.length; j++) {
                C[i][j] = A[i][j] - B[i][j];
            }
        }

        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C.length; j++) {
                System.out.print(C[i][j] + "  ");
            }
            System.out.println();
        }
    }

    static void inmultireScalar (int [][] A, int scalar){
        int[][] C = new int[A.length][A[0].length];
        System.out.println("Inmultirea cu scalar: " + scalar);
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                C[i][j] = A[i][j] * scalar;
            }
        }

        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                System.out.print(C[i][j] + "  ");
            }
            System.out.println();
        }
    }

    static void inmultireMatrici (int [][] A, int [][]B){
        int[][] C = new int[A.length][B[0].length];
        System.out.println("Inmultirea a doua matrici");
        System.out.println(A.length);
        System.out.println(B.length);
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                if (A.length == B.length){
                    for (int k = 0; k < B.length; k++) {
                        C[i][j] += A[i][k] * B[k][j];
                    }
                    }if (A.length != B.length){
                        for (int k = 0; k <= B[0].length; k++) {
                            C[i][j] += A[i][k] * B[k][j];
                        }
                }
            }
        }
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                System.out.print(C[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] A = {{1, 2, 4, 6 },
                    {4, 7, 5, 8 },
                    {-9, 7, 7, 10 },
                    {4, 7, 5, 8 }};

        int[][] B = {{3, 2, 1, 1 },
                    {9, -5, 3, 1 },
                    {-1, 4, 10, 1 },
                    {2, 5, 7, 1 }};

        int scalar = 4;

//        adunare(A,B);
//        scadere(A,B);
//        inmultireScalar(A,scalar);
//        inmultireScalar(B,scalar);
        inmultireMatrici(A,B);
    }
}