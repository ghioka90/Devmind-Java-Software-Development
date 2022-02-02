package Curs19.Sortare;

public class ex2BONUS {
    /*
    2. Implementeaza sortarea prin selectie pentru ordonarea descrescatoare a
    elementelor in urmatoarele cazuri:

    1. array-ul va contine elemente de tipul int
    2. array-ul va contine elemente de tipul String - sortare alfabetica
     */
    public static void intSelectionSort(int[] array) {
        int n = array.length;
        int jMax, aux;

        for (int i = 0; i < n - 1; i++) {
            jMax = i;

            for (int j = i; j < n; ++j) {
                if (array[j] > array[jMax]) {
                    jMax = j;
                }
            }

            if (jMax != i) {
                aux = array[i];
                array[i] = array[jMax];
                array[jMax] = aux;
            }
        }
    }
    public static void displayIntArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void strSelectionSort(String[] array) {
        int n = array.length;
        int jMax; String aux;

        for (int i = 0; i < n - 1; i++) {
            jMax = i;

            for (int j = i; j < n; ++j) {
                if (array[j].compareToIgnoreCase(array[jMax]) > 0) {
                    jMax = j;
                }
            }

            if (jMax != i) {
                aux = array[i];
                array[i] = array[jMax];
                array[jMax] = aux;
            }
        }
    }
    public static void displayStringArray (String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


    public static void main(String[] args) {

        int[] iArray = {24, 43, 54, 53, 7, 6};
        intSelectionSort(iArray);
        displayIntArray(iArray);

        System.out.println();

        String[] sArray = {"Alex", "marius", "Mariana", "andreea", "tudor", "cristi", "broasca"};
        strSelectionSort(sArray);
        displayStringArray(sArray);
    }
}
