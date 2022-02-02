package ALGORITMI;

public class inmultire_prin_adunare {
    public static int inmultirePrinAdunare (int a, int b){
        int it;
        int sum = 0;
        for (it = 1; it <= b; it ++)
            sum += a;
        return sum;
    }


    public static void main(String[] args) {
    }
}
