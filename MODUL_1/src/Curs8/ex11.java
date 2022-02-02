package Curs8;
import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System. in);
        /*
        1.1. Se citeste de la tastatura un numar natural, x. Sa se afiseze in ordine inversa cifrele numarului, alaturi de un mesaj semnificativ:
         */
        System.out.println("Tastati un numar:");
        int numar = sc.nextInt();
        System.out.println("Cifrele numarului sunt:");
        while (numar != 0) {
            int ultimaCifra = numar % 10;
            System.out.print(ultimaCifra + ", ");
            numar /= 10;
        }
        System.out.println();




    }
}
