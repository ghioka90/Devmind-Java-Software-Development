package ALGORITMI;

public class fibonaci {
    public static void printFibo(int n) {
        int a = 1, b = 1;
        int current = 0;

        System.out.println(n + " -> 1 1 ");

        while (a + b <= n) {
            current = a + b;

            System.out.print(current + " ");

            a = b;
            b = current;
        }
    }

    public static boolean isFiboElement(int number) {
        int a = 1, b = 1;
        int current = 0;

        if (number == 1) {
            return true;
        }

        while (a + b <= number) {
            current = a + b;

            if (current == number) {
                return true;
            }

            a = b;
            b = current;
        }

        return false;
    }
    public static void main(String[] args) {
    }
}
