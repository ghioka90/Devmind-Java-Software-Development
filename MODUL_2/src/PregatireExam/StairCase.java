package PregatireExam;

public class StairCase {
    public static void staircase(int n) {
        // Write your code here
        char [][] stair = new char [n][n];
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                if (i+j >= n-1){
                    stair[i][j]='#';
                }else{
                    stair[i][j]=' ';
                }
            }
        }
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                System.out.print(stair[i][j]);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int n = 6;
        staircase(6);

    }
}
