package Curs31.Ex2;

import Curs31.Ex2.CarRentalSystemIO;

import java.io.Serializable;
import java.util.ArrayList;

public class RentedCarsIO implements Serializable {

    private ArrayList<String> listCars;

    public RentedCarsIO() {
       listCars = new ArrayList<>();
    }

    public ArrayList<String> getRentedCars() {
        return listCars;
    }

    public void add(String plateNo){
        this.listCars.add(plateNo);
    }
    public void remove(String plateNo){
        this.listCars.remove(plateNo);
    }

    public int numberOfCars(){
        return this.listCars.size();
    }

    public int getSize(){
        return listCars.size();
    }

    public void printCarList(){
        for ( int i = 0; i < listCars.size(); i++){
            System.out.println("["+ listCars.get(i) +"]\t");
        }
    }

}