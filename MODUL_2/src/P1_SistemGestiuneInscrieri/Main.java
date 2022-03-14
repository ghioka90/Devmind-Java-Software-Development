package P1_SistemGestiuneInscrieri;

import java.util.Scanner;

public class Main {
    private static GuestList guestList;
    private static void add(){
        String firstName, lastName, email;
        int phoneNo;
        Scanner sc =  new Scanner(System.in);

        System.out.println("Introduceti numele: ");
        firstName = sc.nextLine();
        System.out.println("Introduceti prenumele: ");
        lastName = sc.nextLine();
        System.out.println("Introduceti adresa de email: ");
        email = sc.nextLine();
        System.out.println("Introduceti numarul de telefon: ");
        phoneNo = sc.nextInt();
        guestList.add(firstName, lastName, email, phoneNo);

    }

    public static void remove() {
        Scanner sc =  new Scanner(System.in);
        String choice,firstName, lastName, email;
        int phoneNo;
        System.out.println("Pentru a sterge un participant trebuie selectat unul din urmatoarele criterii:\n" +
                "A - Nume si Prenume\n" +
                "B - eMail \n" +
                "C - Numart de telefon");
        choice = sc.nextLine();

        switch (choice){
            case "a","A":
                System.out.println("Introduceti numele: ");
                firstName = sc.nextLine();
                System.out.println("Introduceti prenumele: ");
                lastName = sc.nextLine();

                guestList.indexOf(guestList.participantList, firstName,lastName);
        }



    }

    public static void main(String[] args) {

        }
    }

