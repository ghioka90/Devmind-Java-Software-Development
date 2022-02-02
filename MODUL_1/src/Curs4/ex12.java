package Curs4;

public class ex12 {
    public static void main(String[] args) {
     /*
     2. Afiseaza suma variabilelor, pornind de la secventa urmatoare de cod.
     Scrie un mesaj relevant pentru afisare (i.e. Suma tuturor numerelor este: sau orice altceva).
        Hint: ce tip de variabila trebuie sa folosim pentru stocarea sumei?
      */
        byte  aSmallValue = 23;
        int anIntegerBigValue = 15_000;
        double aFloatValue = 237.01;
        double sum = aSmallValue + anIntegerBigValue + aFloatValue;
        System.out.println( "Suma tuturor numerelor este:" + sum);
    }
}
