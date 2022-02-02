package ALGORITMI;

public class increasing_decreasing_no {
    public static int lastDigit(int number) {
        return number % 10;
    }

    public static boolean isIncreasingNumber(int number) {
        while (number > 9) {
            if (lastDigit(number) < lastDigit(number/10)) {
                return false;
            }
            number /= 10;
        }

        return true;
    }

    public static boolean isDecreasingNumber(int number) {
        while (number > 9) {
            if (lastDigit(number) > lastDigit(number/10)) {
                return false;
            }
            number /= 10;
        }

        return true;
    }
    public static void main(String[] args) {
    }
}
