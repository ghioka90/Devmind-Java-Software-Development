package ALGORITMI;

public class number_length {
    public static int numberLength(int n){
        int it = 0;
        while (n != 0){
            n /= 10;
            it ++;
        }
        return it;
    }
    public static void main(String[] args) {
    }
}
