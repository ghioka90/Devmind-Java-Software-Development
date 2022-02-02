package Curs19.Sortare;

public class ex1 {
    /*
    1. Implementeaza sortarea prin metoda bulelor pentru ordonarea crescatoare a elementelor in urmatoarele cazuri:

    1. array-ul va contine elemente de tipul double
    2. array-ul va contine elemente de tipul String - sortare alfabetica
     */
    public static void bubbleDoubleSort(double[] array) {
        int n = array.length;
        boolean swapped;
        double aux;

        do {
            swapped = false;

            for (int i = 1; i < n; i++) {

                if (array[i - 1] > array[i]) {
                    aux = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = aux;
                    swapped = true;
                }
            }
        } while(swapped);
    }
    public static void displayDoubleArray (double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void bubbleStringSort(String[] array) {
        int n = array.length;
        boolean swapped;
        String aux;

        do {
            swapped = false;

            for (int i = 1; i < n; i++) {

                if (array[i - 1].compareToIgnoreCase(array[i]) > 0) {
                    aux = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = aux;
                    swapped = true;
                }
            }
        } while(swapped);
    }
    public static void displayStringArray (String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {

        double[] dArray = {2.34, 4.12, 1.54, 8.53, 7.67, 7.66};

        bubbleDoubleSort(dArray);
        displayDoubleArray(dArray);
        System.out.println();

        String[] sArray = {"Alex", "marius", "Mariana", "andreea", "tudor", "cristi", "broasca"};
        bubbleStringSort(sArray);
        displayStringArray(sArray);
    }
}

