package Curs19.Cautare;

public class ex2 {
    /*
    2. Un numar palindrom este un numar care este egal cu simetricul sau (ex: 121, 10001, 22344322, 88, 7 etc.).
    Similar, un sir de caractere este palindrom daca este identic cu simetricul sau (ex: „abba“, „ana“, „noon“, „radar“, „madam“).
    Implementeaza o metoda (i.e. isPalindromIgnoreCase(String)) care determina daca un sir de caractere este sau nu palindrom,
    fara a se tine cont de tipul literelor (i.e. majuscule vs. minuscule). Testeaza metoda in main pentru cat mai multe cazuri de exceptie.
     */

    public static boolean isPalindromIgnoreCase(String word){
        String lowerCaseWord = word.toLowerCase();
        int i = 0, j = lowerCaseWord.length() - 1;
        while (i < j){
            if (lowerCaseWord.charAt(i) != lowerCaseWord.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {


        System.out.println(isPalindromIgnoreCase("baoboab"));

    }
}
