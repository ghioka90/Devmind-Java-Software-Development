package Curs7;

public class quiz {
    public boolean isUgly(int n) {
        if (n <= 0)
            return false;
        if (n == 1)
            return true;
        while ( n % 2 == 0)
            n /= 2;
        while ( n % 3 == 0)
            n /= 3;
        while ( n % 5 == 0)
            n /= 5;
        if (n == 1 )
            return true;
        else
            return false;

    }
    public static void main(String[] args) {
        System.out.println();
    }
}