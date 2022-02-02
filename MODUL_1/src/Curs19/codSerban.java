package Curs19;

public class codSerban {
    public static int countOccurrencesIgnoreCase(String[] array, String key) {
        int count = 0;

        for (int i = 0;  i < array.length; i++) {
            if (array[i].equalsIgnoreCase(key)) {
                count++;
            }
        }

        return count;
    }

    public static int countOccurrencesIgnoreCase(char[] array, char letter) {
        int count = 0;

        for (int i = 0;  i < array.length; i++) {
            if (array[i] == letter) {
                count++;
            }
        }

        return count;
    }

    public static String[] filterBasedOnFirstLetter(String[] array, char letter) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (letter == array[i].charAt(0)) {
                count++;
            }
        }

        String[] filteredArray = new String[count];

        count = 0;

        for (int i = 0; i < array.length; i++) {
            if (letter == array[i].charAt(0)) {
                filteredArray[count] = array[i];
                count++;
            }
        }

        return filteredArray;
    }

    public static void filterArray() {
        String[] array = {"reference", "class", "method", "type", "constructor", "recursive"};
        String word = "structure";

        char[] usedLetters = new char[word.length()];

        for (int i = 0; i < word.length(); ++i) {
            if (countOccurrencesIgnoreCase(usedLetters, word.charAt(i)) == 0) {

                usedLetters[i] = word.charAt(i);
                String[] filteredArray = filterBasedOnFirstLetter(array, word.charAt(i));

                if (filteredArray.length > 0) {
                    System.out.print(word.charAt(i) + ": ");
                    for (int j = 0; j < filteredArray.length; ++j) {
                        System.out.print(filteredArray[j] + ", ");
                    }
                    System.out.print("\n");
                }
            }
        }
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        int aux;

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

    public static void selectionSort(int[] array) {
        int n = array.length;
        int jMin, aux;

        for (int i = 0; i < n - 1; i++) {
            jMin = i;

            for (int j = i; j < n; ++j) {
                if (array[j] < array[jMin]) {
                    jMin = j;
                }
            }

            if (jMin != i) {
                aux = array[i];
                array[i] = array[jMin];
                array[jMin] = aux;
            }
        }
    }

    public static void main(String[] args) {
//        String[] array = {"Java", "C", "Python", "JAVA", "perl", "C#", "java"};
//        String key = "JAVA";
//
//        System.out.println(countOccurrencesIgnoreCase(array, key));
//        System.out.println(countOccurrencesIgnoreCase(array, "GO"));
//
//        filterArray();

        int[] intArray = {7, 5, 9, 12, 3, 1};
//        bubbleSort(intArray);
        selectionSort(intArray);
//        System.out.println(Arrays.toString(intArray));

    }
}


