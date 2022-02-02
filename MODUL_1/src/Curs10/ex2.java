package Curs10;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        2. Folosind structura invatata in acest capitol, scrie un program care citeste
        de la tastatura numele unei luni si afiseaza numarul de zile al acelei luni.
        Numele lunilor incep cu majuscula si se continua cu litere mici.
         */
        String luna = sc.nextLine();

        switch (luna){
            case "Ianuarie" , "Martie" ,"Mai" , "Iulie", "August" ,"Octombrie","Decembrie":
                System.out.println("Luna " + luna + " are 31 de zile.");
                break;
            case "Februarie":
                System.out.println("Luna " + luna + " are 28 de zile.");
                break;
            case "Aprilie" , "Iunie" , "Septembrie" , "Noiembrie":
                System.out.println("Luna " + luna + " are 30 de zile.");
                break;
            default:
                System.out.println("\"" + luna + "\" nu este o luna sau o comanda valida.");
                break;
        }

    }
}
