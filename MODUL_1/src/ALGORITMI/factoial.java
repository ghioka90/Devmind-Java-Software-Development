package ALGORITMI;

public class factoial {
    public static long factorial (int n){
        long result = 1;
        for (int i = 2; i <= n; i++)
            result *= i;
        return result;
    }

    public static int factorialRecursiv(int value) {
        if (value == 0 || value == 1) {
            return 1;
        }
        return value * factorialRecursiv(value-1);
    }

    public static void main(String[] args) {
    }
}
