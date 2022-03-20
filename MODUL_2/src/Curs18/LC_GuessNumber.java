package Curs18;

public class LC_GuessNumber {
    public int guessNumber(int n) {
        int left = 0, right = n;
        while (left <= right) {
            int middle = left + (right-left) / 2;
            int result =  middle;
            if ( result == 0) {
                return middle;
            } else if (result == -1) {
                right = middle - 1;
            } else
                left = middle + 1;
        }
        return left;
    }

    public static void main(String[] args) {
    }
}
