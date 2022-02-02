package workshop21_11;

public class AlgorithmsSerban {
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

        public static boolean isMagic(int number) {
            int reducedNumber = reduceNumber(number);

//        if (reducedNumber == 3 || reducedNumber == 7 || reducedNumber == 9) {
//            return true;
//        } else {
//            return false;
//        }

            return (reducedNumber == 3 || reducedNumber == 7 || reducedNumber == 9);
        }

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

    }

