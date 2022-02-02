package Curs19.Cautare;

public class ex1 {
    /*
        1. Implementeaza o metoda (i.e. countOccurrencesIgnoreCase(String[] array, String key)) care determina numarul
        de elemente key din cadrul array si returneaza aceasta valoare.
        Metoda nu tine cont de tipul literelor (i.e. majuscule vs. minuscule).
        Testeaza metoda in main pentru cat mai multe cazuri de exceptie.
         */
    public static int countOccurrencesIgnoreCase(String[] array, String key) {
        int count = 0;

        for (int i = 0;  i < array.length; i++) {
            String lowerCaseWord = array[i].toLowerCase();
            String lowerCaseKey =  key.toLowerCase();
            if (lowerCaseWord.equals(lowerCaseKey)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
    String[] words = {"Java", "C", "Python", "JAVA", "perl", "C#", "java"};
    String key = "JAVA";

    System.out.println("The keyword " + key + " was found " + countOccurrencesIgnoreCase(words , key) + " times.");

    }
}
