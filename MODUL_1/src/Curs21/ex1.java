package Curs21;

public class ex1 {
    public static int parseInt(String str){
        int n = Integer.parseInt(str);
        return n;
    }
    public static double parseDouble(String str){
        double n = Double.parseDouble(str);
        return n;
    }
    public static boolean parseBoolean(String str){
        if (str.equalsIgnoreCase("true"))
            return true;
        if (str.equalsIgnoreCase("false"))
            return false;
        return false;
    }

    public static void main(String[] args) {
        String integer = "123";
        String Double = "247.52";
        String Boolean = "truew";

        System.out.println(parseInt(integer) + 2);
        System.out.println(parseDouble(Double) + 2.10);
        System.out.println(parseBoolean(Boolean));

    }
}
