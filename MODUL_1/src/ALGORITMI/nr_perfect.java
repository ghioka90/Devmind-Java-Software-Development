package ALGORITMI;

public class nr_perfect {
    public static boolean isPerfectNumber(int number) {
    int sumDiv = 1;

    for (int div = 2; div <= number / 2; ++div) {
        if (number % div == 0) {
            sumDiv += div;
        }
    }

//        if (sumDiv == number) {
//            return true;
//        } else {
//            return false;
//        }

    return sumDiv == number;
}
    public static void main(String[] args) {

    }
}
