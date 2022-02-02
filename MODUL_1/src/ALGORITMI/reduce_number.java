package ALGORITMI;

public class reduce_number {
    public static int digitSum(int number) {
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }

    public static int reduceNumber(int number) {
        while (number > 9) {
            number = digitSum(number);
        }
        return number;
    }
    public static void main(String[] args) {
    }
}
