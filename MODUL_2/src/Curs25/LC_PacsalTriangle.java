package Curs25;

import java.util.ArrayList;
import java.util.List;

public class LC_PacsalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> currRow, previous = null;

        for(int i = 0; i < numRows; ++i){
            currRow = new ArrayList<>();
            for(int j = 0; j <= i; ++j){
                if(j == 0 || j == i)
                    currRow.add(1);
                else
                    currRow.add(previous.get(j - 1) + previous.get(j));
            }
            previous = currRow;
            answer.add(currRow);
        }

        return answer;
    }
    public static void main(String[] args) {
    }
}
