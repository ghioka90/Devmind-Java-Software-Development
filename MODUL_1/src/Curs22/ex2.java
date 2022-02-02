package Curs22;

public class ex2 {
    /*
    2. Se da o propozitie, alcatuita din cuvinte (i.e. insiruiri de litere si cifre) separate prin spatii si semne de punctuatie.
    Scrie un program care preia o astfel de propozitie de la utilizator si determina daca propozitia formeaza un palindrom sau nu,
    ignorandu-se orice caracter diferit de litere sau cifre. La final, programul va afisa un mesaj corespunzator.
Cateva exemple de propozitii palindrom sunt:

A man, a plan, a canal: Panama!
Ele fac cafele.
     */
    static boolean sentencePalindrome(String str) {
        int j = 0;
        int i = str.length()-1;

        str = str.toLowerCase();

        while(j <= i) {

            char getAtj = str.charAt(j);
            char getAti = str.charAt(i);

            if (!Character.isLetter(getAtj))
                j++;

            else if(!Character.isLetter(getAti))
                i--;

            else if(getAtj == getAti) {
                j++;
                i--;
            }
            else
                return false;
        }
        return true;
    }

    static boolean sentencePalindrome2(String str) {
        int j = 0;
        int i = str.length()-1;

        while(j <= i) {

            char getAtj = Character.toLowerCase(str.charAt(j));
            char getAti = Character.toLowerCase(str.charAt(i));

            if (!Character.isLetter(getAtj))
                j++;

            else if(!Character.isLetter(getAti))
                i--;

            else if(getAtj == getAti) {
                j++;
                i--;
            }
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        String str = "A man, a plan, a canal: Panama!";
        if( sentencePalindrome(str))
            System.out.println("Sentence is palindrome");
        else
            System.out.println("Sentence is not palindrome");

        if( sentencePalindrome2(str))
            System.out.println("Sentence is palindrome");
        else
            System.out.println("Sentence is not palindrome");

    }
}

