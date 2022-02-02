package Curs5;

public class ex4 {
    public static void main(String[] args) {
        /*
        4. Se da variabila pleaseNegateMe, avand o valoare pozitiva. Scrie 3 moduri diferite care sa realizeze negarea variabilei, folosind:

Operatorul unar -
Operatorul *=
Operatorul /=
         */
        int pleaseNegateMe = 100;
        pleaseNegateMe = -pleaseNegateMe;
        System.out.println(pleaseNegateMe);
        pleaseNegateMe = 100;
        pleaseNegateMe *= -1;
        System.out.println(pleaseNegateMe);
        pleaseNegateMe = 100;
        pleaseNegateMe /= -1;
        System.out.println(pleaseNegateMe);
    }
}
