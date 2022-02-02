package ALGORITMI;

public class ec {
    public static int computeS(int op1, int op2) {
        int result = 0;
        int cr = 0;
        int dig = 1;
        while (op1 > 0 && op2 > 0) {
            int sum = op1 % 10 + op2 % 10 + cr;
            cr = sum / 10;

            op1 /= 10;
            op2 /= 10;

            result += dig * (sum % 10);
            dig *= 10;
        }

        if (op1 > 0 || op2 > 0 || cr > 0) {
            op1 += op2 + cr;

            while (op1 > 0) {
                result += dig * (op1 % 10);
                op1 /= 10;
                dig *= 10;
            }
        }

        return result;
    }
    public static long bigCommonNumber(int value1, int value2) {
        long auxValue1 = value1;
        long auxValue2 = value2;

        while (auxValue1 != auxValue2) {
            if (auxValue1 < auxValue2) {
                auxValue1 += value1;
            } else {
                auxValue2 += value2;
            }
        }

        return auxValue1;
    }

    public static void main(String[] args) {
        System.out.println(bigCommonNumber(2,  8));
    }
}
