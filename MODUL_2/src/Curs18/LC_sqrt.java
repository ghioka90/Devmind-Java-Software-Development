package Curs18;

public class LC_sqrt {
    public static int mySqrt(int x) {
        int left = 0, right = x;
        if (x == 0 || x == 1){
            return x;
        }
        while (left <= right) {
            long middle = (left + right) / 2;


            if (x == middle * middle ) {
                return (int)middle;
            } else if (x < middle * middle) {
                right = (int)middle - 1;
            } else if (x > middle) {
                left  = (int)middle + 1;
            }
        }
        return right;
    }
    public static void main(String[] args) {

        System.out.println(mySqrt(8));
    }
}
