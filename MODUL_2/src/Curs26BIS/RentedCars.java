package Curs26BIS;

import java.util.ArrayList;
import java.util.HashMap;

public class RentedCars extends CarRentalSystem{


    private ArrayList<String> rentedCars;



    public RentedCars(){
        rentedCars = new ArrayList<>();
    }


    public ArrayList<String> getRentedCars() {

        return rentedCars;
    }
    public int getSize(){

        return getRentedCars().size();
    }

}
