package Curs26BIS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CarRentalSystem {

    private static Scanner sc = new Scanner(System.in);
    private RentedCars plate;
    private HashMap<String, String> rentedCars = new HashMap<String,String>(100, 0.5f);
    private HashMap<String, RentedCars> list = new HashMap<String, RentedCars>(100,0.5f);

    public  String totalRented(){

        int totalCarsRented = rentedCars.size();
        return "Sunt "+ totalCarsRented+" inchiriate in acest moment";
    }



    private static String getPlateNo() {
        System.out.println("Introduceti numarul de inmatriculare:");
        return sc.nextLine();
    }

    private static String getOwnerName() {
        System.out.println("Introduceti numele proprietarului:");
        return sc.nextLine();
    }

    // search for a key in hashtable
    private boolean isCarRent(String plateNo) {
        return rentedCars.containsKey(plateNo);
    }

    private boolean ownerRegistered(String ownerName){
        return list.containsKey(ownerName);
    }

    // get the value associated to a key
    private String getCarRent(String plateNo) {
        if (rentedCars.get(plateNo) == null) {
            System.out.println("Vehiculul nu este adaugat...");
        } else {
            return rentedCars.get(plateNo);
        }
        return null;
    }
    // add a new (key, value) pair
    private void rentCar(String plateNo, String ownerName) {
        if (isCarRent(plateNo)) {
            System.out.println("Vehiculul este deja adaugat ");

        } else {
            rentedCars.put(plateNo, ownerName);
        }
    }

    // remove an existing (key, value) pair
    private void returnCar(String plateNo) {
        if(rentedCars.remove(plateNo)!=null && list.remove(plateNo)!= null){
            System.out.println("Vehiculul a fost sters cu succes!");
        }else{
            System.out.println("Vehiculul nu a fost sters, incercati din nou...");
        }

    }
    public int getCarsNo(String ownerName){

        return list.get(ownerName).getSize();
    }
    public ArrayList<String> getCarsList(String ownerName){

        return list.get(ownerName).getRentedCars();
    }


    private static void printCommandsList() {
        System.out.println("help         - Afiseaza aceasta lista de comenzi");
        System.out.println("add          - Adauga o noua pereche (masina, sofer)");
        System.out.println("check        - Verifica daca o masina este deja luata");
        System.out.println("remove       - Sterge o masina existenta din hashtable");
        System.out.println("getOwner     - Afiseaza proprietarul curent al masinii");
        System.out.println("total        - Afiseaza numarul total de masini inchiriate ");
        System.out.println("getRentedCar - Afiseaza numarul total de masini inchiriate de un sofer");
        System.out.println("getRentedCarList -Afiseaza lista cu masinile inchiriate de un sofer");
        System.out.println("quit         - Inchide aplicatia");
    }

    public void run() {
        boolean quit = false;
        while(!quit) {
            System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
            String command = sc.nextLine();
            switch(command) {
                case "help":
                    printCommandsList();
                    break;
                case "add":
                    String owner = getOwnerName();
                    String plateNo = getPlateNo();
                    rentCar(plateNo, owner);


                    plate = new RentedCars();
                    plate.getRentedCars().add(plateNo);
                    list.put(owner,plate);
                    break;
                case "check":
                    System.out.println(isCarRent(getPlateNo()));
                    break;
                case "remove":
                    returnCar(getPlateNo());

                    break;
                case "getOwner":
                    System.out.println(getCarRent(getPlateNo()));
                    break;
                case "quit":
                    System.out.println("Aplicatia se inchide...");
                    quit = true;
                    break;
                case "getRentedCar":
                    System.out.println("Introdu numele unui sofer din lista");
                    String listOwner = sc.nextLine();
                    System.out.println(getCarsNo(listOwner));
                    break;
                case "getRentedCarList":
                    System.out.println("Introdu numele unui sofer din lista");
                    String listOwner2 = sc.nextLine();
                    System.out.println(getCarsList(listOwner2));
                    break;
                case "total":
                    System.out.println(totalRented());
                    break;
                default:
                    System.out.println("Unknown command. Choose from:");
                    printCommandsList();
            }
        }
    }


    public static void main(String[] args) {

        // create and run an instance (for test purpose)
        new CarRentalSystem().run();

    }
}
