package workshop21_11;

import java.util.Scanner;

public class Algorithms {
    Scanner sc = new Scanner(System.in);

    public static boolean perfectNo (int n) {
        int i, Sum = 0;
        for (i = 1; i < n; i++) {
            if (n % i == 0) {
                Sum += i;
            }
        }
//        if (Sum == n) {
//            return true;
//        } else {
//            return false;
//        }
        return Sum == n;
    }

    public static int digitSum (int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static boolean magicNo (int n) {
        while (n > 9){
            n = digitSum(n);
        }
        if (n == 7 || n == 3 || n == 9)
            return true;
        else
            return false;
    }

    public static int lastDigit (int n) {
        return n % 10;
    }

    public static boolean numarCrescator (int n) {
        if (n > 9) {
            while (n > 0) {
                if (lastDigit(n) >= lastDigit(n / 10)) {
                    n /= 10;
                } else
                    return false;
            }
            return true;
        }
        return false;
    }
    public static boolean numarDescrescator (int n) {
        if (n > 9) {
            while (n > 1) {
                if (lastDigit(n) < lastDigit(n / 10)) {
                    n /= 10;
                } else
                    return false;
            }
            return true;
        }
        return false;
    }
//    public static boolean interval(boolean n) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Introdudeti limita din stanga a intervaluliu: ");
//        int leftLimit = sc.nextInt();
//        System.out.println("Introdudeti limita din freapta a intervaluliu: ");
//        int rightLimit = sc.nextInt();
//        for (int i = leftLimit; i <= rightLimit; i++) {
//            if (n == true)
//                return i;
//        }
//    }
    public static int getMultipleOf5 (int n){
        int multiple = n / 5;
        return multiple * 5;
    }

    public static int fibonacciSeries(int n) {
        int i, firstValue = 0, secondValue = 1, next = 0;
        for (i = 0; i < n; i++) {
            if (i <= 1) {
                next = i;
            } else {
                next = firstValue + secondValue;
                firstValue = secondValue;
                secondValue = next;
            }
        }
        return next;
    }


    public static void main(String[] args) {
    }

}


