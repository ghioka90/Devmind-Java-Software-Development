package Curs14;

import java.util.ArrayList;

public class ex1 {
    public static void main(String[] args) {
        int matrixDimension = 5;
        int mainDiagValue = 1;
        int sndDiagValue = 2;
        int centervalue = 3;
        int leftValue = 4;
        int upValue = 5;
        int rightValue = 6;
        int bottomValue = 7;

        int[][] matrix = new int[matrixDimension][matrixDimension];
        ArrayList<ArrayList<Integer>> arrayListMatrix;

        arrayListMatrix = new ArrayList<ArrayList<Integer>>(matrixDimension);
        for (int i = 0; i < matrixDimension; i++) {
            ArrayList<Integer> newRow = new ArrayList<Integer>(matrixDimension);
            for (int j = 0; j < matrixDimension; j++) {
                newRow.add(0);
            }
            arrayListMatrix.add(newRow);
        }
        //populare matrice array si ArrayList;
        for (int i = 0; i < matrixDimension; i++){
            for (int j = 0; j < matrixDimension; j++){
                if (i == j ){
                    matrix[i][j] = mainDiagValue;
                    arrayListMatrix.get(i).set(j,mainDiagValue);
                }
                if (i + j == matrixDimension - 1) {
                    matrix[i][j] = sndDiagValue;
                    arrayListMatrix.get(i).set(j,sndDiagValue);
                }
                if (i == j && i + j == matrixDimension - 1){
                    matrix[i][j] = centervalue;
                    arrayListMatrix.get(i).set(j,centervalue);
                }
                if  (i > j && i + j < matrixDimension - 1){
                    matrix[i][j] = leftValue;
                    arrayListMatrix.get(i).set(j,leftValue);
                }
                if  (i < j && i + j < matrixDimension - 1){
                    matrix[i][j] = upValue;
                    arrayListMatrix.get(i).set(j,upValue);
                }
                if  (i < j && i + j > matrixDimension - 1){
                    matrix[i][j] = rightValue;
                    arrayListMatrix.get(i).set(j,rightValue);
                }
                if  (i > j && i + j > matrixDimension - 1){
                    matrix[i][j] = bottomValue;
                    arrayListMatrix.get(i).set(j,bottomValue);
                }
            }
        }



        for (int i = 0; i < matrixDimension; i++) {
            System.out.println();
            for (int j = 0; j < matrixDimension; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
        }

        System.out.print("\n\n");

        for(int i=0; i < arrayListMatrix.size(); i++) {
            for (int j = 0; j < arrayListMatrix.get(i).size(); j++) {
                System.out.print(arrayListMatrix.get(i).get(j) + "\t");
            }
            System.out.println();
        }
    }
}
