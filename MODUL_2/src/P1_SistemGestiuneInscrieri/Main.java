package P1_SistemGestiuneInscrieri;

import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    private static GuestList guestList;
//
//    while(true){
//        System.out.println("Tasteaza \"help\" pentru lista de comenzi.");
//        String command = sc.nextLine();
//
//        if (command.equals("quit")){
//            System.out.println("Aplicatia se va inchide");
//            break;
//        }
//        switch (command){
//            case "help":
//                listOfCommands();
//            case "add":
//                add();
//            case "check":
//                check();
//            case "remove":
//                remove();
//            case "update":
//                update();
//            case "guests":
//
//        }
//    }

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

//    private static void check(){
//        guestList.searchBy()
//
//    }

    public static void remove() {
        Scanner sc =  new Scanner(System.in);
        String choice,firstName, lastName, email;
        int phoneNo;
        System.out.println("Pentru a sterge un participant trebuie selectat unul din urmatoarele criterii:\n" +
                "A - Nume si Prenume\n" +
                "B - eMail \n" +
                "C - Numart de telefon\n");
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

    public static void update(){

    }


    public static void listOfCommands(){
        System.out.println("" +
                "\thelp         - Afiseaza aceasta lista de comenzi\n" +
                "\tadd          - Adauga o noua persoana (inscriere)\n" +
                "\tcheck        - Verifica daca o persoana este inscrisa la eveniment\n" +
                "\tremove       - Sterge o persoana existenta din lista\n" +
                "\tupdate       - Actualizeaza detaliile unei persoane\n" +
                "\tguests       - Lista de persoane care participa la eveniment\n" +
                "\twaitlist     - Persoanele din lista de asteptare\n" +
                "\tavailable    - Numarul de locuri libere\n" +
                "\tguests_no    - Numarul de persoane care participa la eveniment\n" +
                "\twaitlist_no  - Numarul de persoane din lista de asteptare\n" +
                "\tsubscribe_no - Numarul total de persoane inscrise\n" +
                "\tsearch       - Cauta toti invitatii conform sirului de caractere introdus\n" +
                "\tquit         - Inchide aplicatia");
    }

    public static void main(String[] args) {

        }
    }

