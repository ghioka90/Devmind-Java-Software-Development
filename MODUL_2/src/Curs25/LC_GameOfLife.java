package Curs25;

public class LC_GameOfLife {
    public void gameOfLife(int[][] board) {
        int[] dirI = {-1, -1, 0, +1, +1, +1, 0, -1};
        int[] dirJ = {0, +1, +1, +1, 0, -1, -1, -1};

        int [][] A = new int[board.length][board[0].length];

        for(int i = 0; i < board.length; i++){
            for (int j = 0; j< board[0].length; j++){
                int counter = 0;
                for (int n = 0; n < dirI.length; n++){
                    if (board[i+dirI[n]][j+dirJ[n]] == 1){
                        counter++;
                    }
                }
                if (board[i][j] == 1 && counter < 2)
                    A[i][j] = 0;
                if (board[i][j] == 1 && (counter == 2 || counter == 3))
                    A[i][j] = 1;
                if (board[i][j] == 1 && counter > 3)
                    A[i][j] = 0;
                if (board[i][j] == 0 && counter == 3)
                    A[i][j] = 1;
            }
        }
        for(int i = 0; i < board.length; i++){
            for (int j = 0; j< board[0].length; j++) {
                board[i][j] = A [i][j];
            }
        }

    }
    public static void main(String[] args) {
    }
}
