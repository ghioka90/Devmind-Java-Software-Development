package Curs26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
 
public class CarRentalSystem{
 
  private static Scanner sc = new Scanner(System.in);

  private HashMap<String, String> allRentedCars = new HashMap<>(100, 0.5f);
  private HashMap<String, RentedCars> list = new HashMap<>(50,0.5f); //2.
  private int noRentedCars = 0;


  private static String getPlateNo() {
    System.out.println("Introduceti numarul de inmatriculare:");
    return sc.nextLine();
  }
 
  private static String getOwnerName() {
    System.out.println("Introduceti numele proprietarului:");
    return sc.nextLine();
  }
 
  // search for a key in hashtable
  public boolean isCarRent(String plateNo) {
    return allRentedCars.containsKey(plateNo);
  }

  public boolean ownerRegistered(String ownerName){
    return list.containsKey(ownerName);
  }

//  public String theCarIsRentedTo(String plateNo) {//1.3.Sistemul afiseaza un mesaj de eroare prietenos (i.e. human readable)
//                                                  // atunci cand se doreste aflarea soferului pentru un autovehicul inexistent.
//    if(!isCarRent(plateNo)) {
//      System.out.println("Masina nu exista!");
//      return "";
//    }
//    return "Proprietarul este: " + allRentedCars.get(plateNo);
//  }
 
  // get the value associated to a key
  private String getCarRent(String plateNo) { //1.3.Sistemul afiseaza un mesaj de eroare prietenos (i.e. human readable)
                                              // atunci cand se doreste aflarea soferului pentru un autovehicul inexistent.
    if (!isCarRent(plateNo)){
      System.out.println("Masina nu exista!");
    }
    return "Proprietarul este: " + allRentedCars.get(plateNo);
  }
 
  // add a new (key, value) pair and check if the car is rented
  private void rentCar(String plateNo, String ownerName) {
    if (isCarRent(plateNo)){
      System.out.println("Masina este daja inchiriata.");//1.1. Sistemul afiseaza un mesaj de eroare la
                                                                        // adaugarea unui autoturism deja existent.
                                                                        // In urma operatiei colectia ramane nemodificata.
    }else{
      if (!ownerRegistered(ownerName)) {// daca soferul nu este inregistrat il adaugam
        RentedCars listOfCars = new RentedCars();
        listOfCars.add(plateNo);// adaugam masina in lista
        list.put(ownerName, listOfCars);// actualizam numarul de masini pentru un sofer
        System.out.println("Masina cu numarul de inamtriculare " + plateNo + " a fost inchiriata lui " + ownerName);
      }else {
        RentedCars car = list.get(ownerName);
        car.add(plateNo);
      }
//      this.noRentedCars++; //actualizam numarul total al  massinilor inchiriate
      allRentedCars.put(plateNo, ownerName);
    }
  }
 
  // remove an existing (key, value) pair
  private void returnCar(String plateNo) {//1.2. Sistemul afiseaza corespunzator un mesaj de succes sau
                                          // unul de eroare la stergerea unui autoturism din hashtable.
    if (isCarRent(plateNo)){
      String ownerName = allRentedCars.get(plateNo);
      allRentedCars.remove(plateNo);//eliminam masina din lista generala
      System.out.println("Masina cu numarul de inmatriculare: " + plateNo + " a fost returnata.");
//      this.noRentedCars--; //actualizam numarul total al massinilor inchiriate
//      ownerRentedCar.remove(plateNo);
      RentedCars car = list.get(ownerName);
      car.remove(plateNo); //eliminam masina din lista soferului
    }else {
      System.out.println("Masina cu numarul de inmatriculare: " + plateNo + " nu a fost inchiriata.");
    }
  }
  private int getCarsNo(String ownerName){//2.1. getCarsNo <OWNER_NAME> : va returna numarul de masini inchiriate de proprietarul temporar OWNER_NAME
    if (ownerRegistered(ownerName)) {
      return list.get(ownerName).numberOfCars();
    }else{
      return 0;
    }
  }

  private void getCarsList(String ownerName){//2.1. getCarsList <OWNER_NAME> : va returna lista de masini inchiriate de proprietarul temporar OWNER_NAME
    if (ownerRegistered(ownerName)) {
      RentedCars list = this.list.get(ownerName);
      list.printCarList();
    }else{
      System.out.println(ownerName + " nu a inchiriat nici o masina.");
    }
  }

  private void totalRented(){ //1.4. metoda totalRented
    System.out.println("Numarul total de masini inchiriate: " + this.allRentedCars.size());
  }
 
  private static void printCommandsList() {
    System.out.println("help              - Afiseaza aceasta lista de comenzi");
    System.out.println("add               - Adauga o noua pereche (masina, sofer)");
    System.out.println("check             - Verifica daca o masina este deja luata");
    System.out.println("remove            - Sterge o masina existenta din hashtable");
    System.out.println("getOwner          - Afiseaza proprietarul curent al masinii");
    System.out.println("getOwnerNoCars    - Afiseaza numarul total de masini inchiriate de un sofer");
    System.out.println("getOwnerCarsList  - Afiseaza lista masinilor inchiriate de un sofer");
    System.out.println("noRented          - Afiseaza numarul masinilor inchiriate pana in acest moment"); //4. comanda totalRented
    System.out.println("quit              - Inchide aplicatia");
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
          rentCar(getPlateNo(), getOwnerName());
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
        case "getOwnerNoCars":
          System.out.println(getCarsNo(getOwnerName()));
          break;
        case "getOwnerCarsList":
          getCarsList(getOwnerName());
          break;
        case "noRented": //1.4. comanda totalRented
          totalRented();
          break;
        case "quit":
          System.out.println("Aplicatia se inchide...");
          quit = true;
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