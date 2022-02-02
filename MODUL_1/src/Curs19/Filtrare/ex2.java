package Curs19.Filtrare;

import java.util.Scanner;

public class ex2 {
    /*
    2. Citindu-se aceleasi date ca in exercitiul anterior, implementeaza o metoda lettersMatchIgnoreCase(String[] array, String key)
    care sa returneze un array ce contine toate cuvintele care au cel putin o litera identica cu key.
    Doua cuvinte au o litera identica daca: (1) litera este aceeasi (i.e. se ignora diferenta majuscula / minuscula)
    si (2) se afla pe aceeasi pozitie in cele doua cuvinte. Cateva exemple sunt:

        1. car ↔ rabbit: o litera identica (ingrosata)
        2. doctor ↔ risk: nicio litera identica
        3. design ↔ engineer: o litera identica (ingrosata)
        4. dance ↔ vaccine: 2 litere identice (ingrosate)
     */
    public static String[] lettersMatchIgnoreCase(String[] array, String key){
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (findSameLetter(array[i], key)) {
                count++;
            }
        }
        String[] filteredArray = new String[count];

        count = 0;

        for (int i = 0; i < array.length; i++) {
            if (findSameLetter(array[i], key)) {
                filteredArray[count] = array[i];
                count++;
            }
        }
        for (int j = 0; j < filteredArray.length; ++j) {
            System.out.print(filteredArray[j] + ", ");
        }
        System.out.print("\n");
        return filteredArray;
    }

    public static boolean findSameLetter(String word, String key){
        boolean finded = false;
        int wLength = word.length();
        int keyLenght = key.length();

        for ( int i = 0; i < Math.min(wLength, keyLenght); i++){
            if (word.toLowerCase().charAt(i) == key.toLowerCase().charAt(i)){
                finded = true;
            }
        }
        return finded;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int it = 0;


        System.out.println("Tasteaza numarul de elemente n:");
        n = sc.nextInt();
        String[] wordsArray = new String[n];
        System.out.println("Tasteaza " + n + " elemente:");

        while (it < n) {
            String word = sc.next();
            wordsArray[it] = word;
            it++;
        }
        System.out.println("Tasteaza cuvantul cheie:");
        String key = sc.next();

        lettersMatchIgnoreCase(wordsArray, key);

    }
}

