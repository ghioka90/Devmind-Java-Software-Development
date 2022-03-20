package Curs18;

public class BS_PerfectSquare {

    public static boolean isPerfectSquare(int num) {
        long left = 0, right = num / 2, it = 0;
        boolean result = false;
        if (num == 1)
            result = true;
        if (num == 2)
            result = false;
        if (num == 4)
            result = true;
        while (left <= right) {

            it++;
            long middle = (left + right) / 2;

            if ( num == middle * middle) {
                result = true;
               break;
            } else if (num < middle * middle) {
                right = middle - 1;
            } else if (num > middle * middle) {
                left = middle + 1;
            }
            System.out.println("interation " + it);
            System.out.println("left " + left);
            System.out.println("right " + right);
            System.out.println("result " + result);
            System.out.println();
        }

        return result;
    }
    public static void main(String[] args) {

        int n = 808201;

        System.out.println(n + " perfect square? " + isPerfectSquare(n));
    }
}
