package ALGORITMI;

public class convert_base {
    public static int lastDigit(int number) {
        return number % 10;
    }


    public static int power(int number, int power) {
        int result = 1;

        for (int i = 0; i < power; ++i) {
            result *= number;
        }

        return result;
    }

    public static int convert2to10(int base2number) {
        int base10number = 0;
        int index = 0;

        while (base2number != 0) {
            base10number += lastDigit(base2number) * power(2, index);
            index++;
            base2number /= 10;
        }

        return base10number;
    }

    public static int convert10to2(int base10number) {
        int count = 0;
        int base2number = 0;

        while (base10number != 0) {
            base2number = (base10number % 2) * power(10, count) + base2number;
            base10number /= 2;
            count++;
        }

        return base2number;
    }

    public static int convertKto10(int baseKnumber, int base) {
        int base10number = 0;
        int index = 0;

        while (baseKnumber != 0) {
            base10number += lastDigit(baseKnumber) * power(base, index);
            index++;
            baseKnumber /= 10;
        }

        return base10number;
    }

    public static int convert10toK(int base10number, int base) {
        int count = 0;
        int baseKnumber = 0;

        while (base10number != 0) {
            baseKnumber = (base10number % base) * power(10, count) + baseKnumber;
            base10number /= base;
            count++;
        }

        return baseKnumber;
    }


    public static void main(String[] args) {
    }
}
