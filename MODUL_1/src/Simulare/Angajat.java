package Simulare;//package Simulare;
//import java.lang.reflect.*;
//import java.util.*;
//
//public class Angajat {
//
//
//
//    //I. Define all the necessary fields here
//    private final String uniqueID;
//    private double weight;
//    private String packageName;
//    private static String courierName;
//
//
//
//
//
//    private final String cnp;
//    private String nume;
//    private String email;
//    private String prenume;
//    private int salariu;
//    private static String angajator;
//
//    public String getNume() {
//        return nume;
//    }
//
//    public void setNume(String nume) {
//        this.nume = nume;
//    }
//
//    public String getPrenume() {
//        return prenume;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public static String getAngajator() {
//        return angajator;
//    }
//
//    public static void setAngajator(String angajator) {
//        Angajat.angajator = angajator;
//    }
//
//    //II. Define all the necessary constructors and methods here
//    public static String getCourierName(){
//        return Angajat.courierName;
//    }
//    public void setCourierName(String courierName){
//        Angajat.courierName = courierName;
//    }
//
//    public  String getPackageName(){
//        return this.packageName;
//    }
//    public String getUniqueID() {
//        return uniqueID;
//    }
//
//    public double getWeight() {
//        return weight;
//    }
//
//
//
//    public Angajat(String cnp, String nume, String prenume, String email){
//        this.nume = nume;
//        this.cnp = cnp;
//        this.prenume = prenume;
//        this.email = email;
//    }
//
//    public Angajat(String cnp, String nume, String prenume,){
//        this(cnp, nume, prenume, null);
//    }
//
//    public void maresteSalariu(int bonus) {
//        //III.a. Enter your code here
//        this.salariu += bonus;
//        //You can also define any additional methods
//    }
//
//    private boolean lenght(){
//        if (cnp.length() == 13) {
//            return true;
//        }else
//            return false;
//    }
//
//    private boolean isDigit (){
//        for (int i = 0; 0 < this.cnp.length(); i++) {
//            if (!Character.isDigit(cnp.charAt(i)))
//                return false;
//        }
//        return true;
//    }
//    private boolean firstDigitNotZero(){
//        int fistDigit = Character.getNumericValue(cnp.charAt(0));
//        if (fistDigit != 0){
//            return true;
//        }else{
//            return false;
//        }
//    }
//    public String toString() {
//        //III.c. Enter your code here
//        //You can also define any additional methods
//        String toString = "Angajatul " + nume + prenume + ", CNP " + cnp + " are salariul de " + salariu + " RON/luna si lucreaza la " + angajator;
//        return toString;
//
//    }
//
//    public void addItem(double itemWeight) {
//        //III.a. Enter your code here
//        this.weight = itemWeight;
//        //You can also define any additional methods
//    }
//
//    public boolean checkID() {
//        //III.b. Enter your code here
//        //You can also define any additional methods
//        return (isDigit() && div3() && digitSumDiv4() && dif5() && lenght());
//    }
//
//    public static int beautifulDays(int i, int j, int k) {
//        // Write your code here
//        int count = 0;
//        for (int it = i; it <= j ; it++){
//            int number = it;
//            int reversed = 0;
//            while (number != 0){
//                int digit = number % 10;
//                reversed = reversed * 10 + digit;
//                number /= 10;
//                int dif = number - reversed;
//                if (dif % k == 0){
//                    count++;
//                }
//
//            }
//        }
//        return count;
//
//    }
//
////    private boolean isDigit (){
////        for (int i = 0; 0 < this.uniqueID.length(); i++) {
////            if (!Character.isDigit(uniqueID.charAt(i)))
////                return false;
////        }
////            return true;
////    }
//    private boolean div3 () {
//        int count = 0;
//        for (int i =0; 0 <uniqueID.length(); i++){
//            int currChar = Character.getNumericValue(uniqueID.charAt(i));
//            if (currChar % 2 == 1){
//                count++;
//            }
//        }
//        if (count % 3 == 0){
//            return true;
//        }else{
//            return false;
//        }
//    }
//    private boolean digitSumDiv4 (){
//        int sum = 0;
//        for (int i=0; i<this.uniqueID.length(); i++) {
//            int curentDigit = Character.getNumericValue(uniqueID.charAt(i));
//            sum += curentDigit;
//        }
//        return (sum % 4 == 0);
//    }
//
//
//    private boolean dif5() {
//        for (int i = 0; 0 < (uniqueID.length() - 1); i++) {
//            int dif = Character.getNumericValue(uniqueID.charAt(i)) - Character.getNumericValue(uniqueID.charAt(i + 1));
//            if ((dif <= 5) || (dif >= -5)) {
//                return true;
//            } else {
//                return false;
//            }
//        }
//    }
//
////    private boolean lenght(){
////        if (uniqueID.length()>=10 && uniqueID.length()<=12){
////            return true;
////        }else
////            return false;
////    }
//
//
//
//
//
//    public String computeDetails() {
//        String toString = "Pachetul " + this.packageName + " avand codul "
//                + this.uniqueID + " si greutatea " + this.weight
//                + " apartine curierului " + this.courierName + ".";
//        return toString;
//    }
//
//
//
//    /*-----------------------------------------------------------
//     * The methods below are used for Testing Purposes only.
//     * Do not modify them.
//     -----------------------------------------------------------*/
//    protected void printObjectFields() {
//        System.out.println("Pachetul " + this.packageName + ", avand codul "
//                + this.uniqueID + ", si greutatea " + this.weight
//                + " apartine curierului " + Angajat.courierName + ".");
//    }
//
//
//
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int testNumber = sc.nextInt();
//        sc.close();
//
//        switch (testNumber) {
//            case 0:
//                System.out.println("Ok! Let's start!");
//                break;
//            case 1:
//                Angajat genericPackage1 = new Angajat("111", 2.5, "Laptop");
//                Angajat genericPackage2 = new Angajat("113", 30.25, "Monitor");
//
//                System.out.println(genericPackage1.getUniqueID() + " - " + genericPackage1.getWeight() + " - " + genericPackage1.getPackageName());
//                genericPackage1.setCourierName("FanCourier");
//                System.out.println(genericPackage2.getCourierName());
//                System.out.println(genericPackage1.getCourierName());
//
//                try {
//                    Arrays.asList(Angajat.class.getDeclaredFields()).stream()
//                            .filter(f -> f.getName().equalsIgnoreCase("uniqueID"))
//                            .map(f -> Modifier.isFinal(f.getModifiers())).forEach(System.out::println);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//                break;
//
//            case 2:
//                Angajat genericPackage12 = new Angajat("111", 2.5, "Laptop");
//                genericPackage12.setCourierName("DHL");
//                genericPackage12.printObjectFields();
//                genericPackage12.addItem(2.5);
//                genericPackage12.setCourierName("FanCourier");
//                genericPackage12.printObjectFields();
//                break;
//
//            case 3:
//                Angajat genericPackage13 = new Angajat("111", 2.5, "Laptop");
//                genericPackage13.setCourierName("DHL");
//                genericPackage13.addItem(10.75);
//                genericPackage13.printObjectFields();
//                break;
//            case 4:
//                Arrays.asList(
//                                new Angajat("1234512347", 2.0, "Monitor"),
//                                new Angajat("10000303000", 3.7, "Monitor"),
//                                new Angajat("1181000000", 3.7, "Monitor"),
//                                new Angajat("118100*000", 3.7, "Monitor"),
//                                new Angajat("1234512345", 3.7, "Monitor"),
//                                new Angajat("1234512347", 3.7, "Monitor")).stream()
//                        .map(a -> a.getUniqueID() + "\t-> " + a.checkID()).forEach(System.out::println);
//                break;
//            default:
//                break;
//
//        }
//    }
//}
//
