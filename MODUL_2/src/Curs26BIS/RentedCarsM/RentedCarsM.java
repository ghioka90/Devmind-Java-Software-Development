package Curs26BIS.RentedCarsM;

import java.util.ArrayList;

public class RentedCarsM {

    //lista de masini
    private final ArrayList<String> listOfCars;

    public RentedCarsM() {
        this.listOfCars = new ArrayList<>();
    }

    //adaugare vehicul
    public void addCar(String plateNo) {
        this.listOfCars.add(plateNo);
    }

    //stergere vehicul
    public void removeCar(String plateNo) {
        this.listOfCars.remove(plateNo);
    }

    //numarul de masini
    public int numberOfCars() {
        return this.listOfCars.size();
    }

    public void printCars() {
        for (int i = 0; i < listOfCars.size(); i++) {
            System.out.print(listOfCars.get(i) + " ");
        }
        System.out.println();
    }


}
