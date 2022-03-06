package Curs14;

public class ex2 {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3},
                {4, 7, 8},
                {-9, 7, 8}};
        int[][] B = {{3, 2, 1},
                {9, -5, 3},
                {-1, 4, 10}};

        int scalar = 4;

        int[][] C = new int[3][3];



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

        System.out.println("Inmultirea lui A cu scalar: " + scalar);
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C.length; j++) {
                C[i][j] = A[i][j] * scalar;
            }
        }
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C.length; j++) {
                System.out.print(C[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("Inmultirea lui A cu B");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C.length; j++) {
                C[i][j] = A[i][j] * scalar;
            }
        }
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C.length; j++) {
                System.out.print(C[i][j] + "  ");
            }
            System.out.println();
    }
}