package Exercitii;

import java.util.List;

public class DiagonalDiference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        List<Integer> result;
        int diff = 0;
        int primDiag = 0;
        int secDiag = 0;
        for (int i = 0; i < arr.size(); i++){
            for (int j = 0; j < arr.get(i).size(); j++){
                if (i==j){
                    primDiag += arr.get(i).get(j);
                }else{
                    if (i+j == arr.size() - 1){
                        secDiag += arr.get(i).get(j);
                    }
                }
            }
        }
        return Math.abs(primDiag-secDiag);
    }
    public static void main(String[] args) {
    }
}
