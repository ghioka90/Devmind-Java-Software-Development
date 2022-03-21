package ProblemeLC;

public class MatrixDiagonalSum1572 {
    public static int diagonalSum(int[][] mat) {
        int diagSum = 0;
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[0].length; j++){
                if (i==j || i+j==mat.length-1){
                    diagSum += mat[i][j];
                    System.out.println("element " + i +" "+ j + " -> " + mat[i][j]);
                    System.out.println("diagSum " + diagSum);
                }
            }
        }
         if (mat.length % 2 != 0){
             System.out.println("element " + (mat.length/2 ) + " -> " + mat[mat.length/2 ][mat.length/2]);
             diagSum -= mat[mat.length/2][mat.length/2];
         }

        return diagSum;
    }
    public static void main(String[] args) {
        int[][] B = {{1,2,3 },
                    {4,5,6},
                    {7,8,9}};

        System.out.println(diagonalSum(B));
    }
}
