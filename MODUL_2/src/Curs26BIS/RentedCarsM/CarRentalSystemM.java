package Curs26BIS.RentedCarsM;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 2 Adauga aplicatiei inca o singura structura de date (hashtable?) care sa mentina evidenta autovehiculelor inchiriate de un anumit proprietar. Practic, sistemul va putea raspunde si urmatoarelor cereri:
 * <p>
 * getCarsNo <OWNER_NAME> : va returna numarul de masini inchiriate de proprietarul temporar OWNER_NAME
 * getCarsList <OWNER_NAME> : va returna lista de masini inchiriate de proprietarul temporar OWNER_NAME
 * Hints pentru o posibila implementare:
 * <p>
 * Hashtable-ul va avea tipul <String, RentedCars> unde RentedCars va fi o clasa definita de tine ce va tine evidenta numarului de masini si respectiv listei de autovehicule.
 * Pentru o structurare a codului corecta (d.p.d.v. OOP) clasa RentedCars ar trebui sa implementeze toata functionalitatea aferenta gestiunii autoturismelor per proprietar.
 */
public class CarRentalSystemM {

    //fields
    private static Scanner sc = new Scanner(System.in);
    private HashMap<String, String> rentedCars = new HashMap<>(100, 0.5f);//aici am plateNo si Owner
    private HashMap<String, RentedCarsM> owners = new HashMap<>(100, 0.5f);//aici am Owner si o lista de masini ale lui


    // cerinta 2.1: OK
    public int getCarsNo(String ownerName) {
        if (ownerExistance(ownerName)) {//daca acest owner exista in hashMap
            return owners.get(ownerName).numberOfCars();//asta imi returneaza o lista de la owner-ul respectiv,
            // pe care apelez metoda "size" practic, ca sa vad cate elem am in lista
        } else {
            System.out.println("Owner-ul nu are vehicule inchiriate.");
            return 0;
        }
    }


    // cerinta 2.2 OK
    public void getCarsList(String ownerName) {

        if (ownerExistance(ownerName)) {//daca acest owner exista

            RentedCarsM lista = owners.get(ownerName);//adica returnez practic arrayList-ul aferent acestui owner, care contine numerele de inmatriculare
            lista.printCars();//printez practic numerele de inmatriculare asociate cu acest owner
        }
        else {
            System.out.println("Lista este nula.");
        }
    }


    //getter pentru plateNo
    private static String getPlateNo() {
        System.out.println("Introduceti numarul de inmatriculare:");
        return sc.nextLine();
    }

    //getter pentru ownerName
    private static String getOwnerName() {
        System.out.println("Introduceti numele proprietarului:");
        return sc.nextLine();
    }

    //methods

    // search for a key in hashtable, in ambele
    public boolean isCarRent(String plateNo) {
        return rentedCars.containsKey(plateNo);
    }

    private boolean ownerExistance(String ownerName) {
        return owners.containsKey(ownerName);
    }


    // get the value associated to a key = get the owner
    public String getCarRent(String plateNo) {
        //cerinta 3 - eroare pt autov inexistent
        if (isCarRent(plateNo)) {//daca exista, returnam numele proprietarului
            return "Owner is: " + rentedCars.get(plateNo);
        } else {
            return "Vehiculul nu se afla in baza de date, deci nu avem owner.";
        }

    }


    // add a new (key, value) pair
//    public void rentCar2(String plateNo, String ownerName) {
//        //cerinta 1
//        //verif daca acest vehicul exista in colectie. Daca da, nu se va adauga.
//        if (isCarRent(plateNo)) {
//            System.out.println("Eroare. Vehiculul este deja inchiriat (se afla in baza de date).");
//            return;
//        }
//        rentedCars.put(plateNo, ownerName);
//    }

    //adaugare in hashmap o noua masina, sau adaugare aceluiasi owner o noua masina
    public void rentCar2(String plateNo, String ownerName) {
        //intai verific daca masina e dispo si poate fi inchiriata
        if (isCarRent(plateNo)) {//daca o am deja in baza de date = e deja inchiriata
            System.out.println("Eroare. Vehiculul este deja inchiriat (se afla in baza de date). Nu se poate inchiria acelasi vehicul.");
            return;
        }

        //verif daca acest owner exista in rentedCars2
        if (!ownerExistance(ownerName)) {//daca nu exista, il adaug
            RentedCarsM newRentedCar = new RentedCarsM();
            newRentedCar.addCar(plateNo);//adaug masina in lista
            owners.put(ownerName, newRentedCar);//deci acestui owner ii aloc o lista de masini
            System.out.println("Proprietarul a fost adaugat cu succes!");

        } else {//daca owner-ul exista deja, trebuie sa ii adaug DOAR o noua masina
            RentedCarsM rc = owners.get(ownerName);//deci asta iti da o lista cu masini pt acest owner, ca exista deja, deci are cel putin 1 masina
            rc.addCar(plateNo);//si mai adaug o masina acestui owner, daca il am deja in lista
        }


        //apoi adaug si in hashMap ul initial
        //cerinta 1
        rentedCars.put(plateNo, ownerName);
    }


//    // remove an existing (key, value) pair
//    public void returnCar(String plateNo) {
//        //cerinta 2
//        if (isCarRent(plateNo)) {//daca exista, stergem
//            rentedCars.remove(plateNo);
//            System.out.println("Vehiculul a fost returnat.");
//        } else {
//            System.out.println("Vehiculul nu exista in baza de date.");
//        }
//    }

    //trebuie sa sterg din ambele hashMap - uri
    public void returnCar2(String plateNo) {
        //cerinta 2
        if (isCarRent(plateNo)) {//daca exista, il stergem din ambele - din a 2a lista trebuie sa sterg doar masina respectiva
            String owner = rentedCars.get(plateNo);//deci stiu owner-ul, folosindu-ma de primul hashtable
            System.out.println("Owner-ul este: " + owner);

            //fac remove din ambele liste
            rentedCars.remove(plateNo);//din lista asta sterg direct masina si owner-ul

            //din cea de-a 2a lista sterg doar masina
            RentedCarsM rc = owners.get(owner);//deci obtin lista de masini
            rc.removeCar(plateNo);//din aceasta lista, sterg doar masina in cauza

            System.out.println("Vehiculul a fost returnat.");
        } else {
            System.out.println("Vehiculul nu exista in baza de date.");
        }
    }


    //cerinta 4 - nr total de vh inchiriate
    public int totalRented() {
        return rentedCars.size();
    }


    private static void printCommandsList() {
        System.out.println("help         - Afiseaza aceasta lista de comenzi");
        System.out.println("add          - Adauga o noua pereche (masina, sofer)");
        System.out.println("check        - Verifica daca o masina este deja luata");
        System.out.println("remove       - Sterge o masina existenta din hashtable");
        System.out.println("getOwner     - Afiseaza proprietarul curent al masinii");
        System.out.println("totalRented  - Afiseaza nr. total de vehicule inchiriate ");
        System.out.println("getCarsNo    - Afiseaza nr. de vehicule inchiriate de un anumit proprietar");
        System.out.println("getCarsList  - Afiseaza lista de vehicule inchiriate de un anumit proprietar");
        System.out.println("quit         - Inchide aplicatia");
    }

    public void run() {
        boolean quit = false;

        while (!quit) {
            System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
            String command = sc.nextLine();

            switch (command) {
                case "help" -> printCommandsList();
                case "add" -> rentCar2(getPlateNo(), getOwnerName());
                case "check" -> System.out.println(isCarRent(getPlateNo()));
                case "remove" -> returnCar2(getPlateNo());
                case "getOwner" -> System.out.println(getCarRent(getPlateNo()));
                case "totalRented" -> System.out.println(totalRented());
                case "getCarsNo" -> System.out.println(getCarsNo(getOwnerName()));
                case "getCarsList" -> getCarsList(getOwnerName());
                case "quit" -> quit = true;
                default -> {
                    System.out.println("Unknown command. Choose from:");
                    printCommandsList();
                }
            }

        }
    }

    public static void main(String[] args) {

        // create and run an instance (for test purpose)
        new CarRentalSystemM().run();

    }
}
