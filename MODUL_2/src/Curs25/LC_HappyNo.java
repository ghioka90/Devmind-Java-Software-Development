package Curs25;

public class LC_HappyNo {
    public static boolean isHappy(int n) {
        boolean answer = false;

        while(n >= 10){
            n = happySum(n);

        }
        if(n == 1 || n == 7)
            return answer = true;
        else
            return answer;
    }
    public static int happySum(int n){
        int sum = 0;
        while( n > 0){
            int digit = n % 10;
            sum += digit*digit;
            n = n / 10;
        }
        return sum;
    }


    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));

    }

}
