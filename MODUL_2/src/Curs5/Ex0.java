package Curs5;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex0 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>(Arrays.asList("Dacia" ,"Renault", "Skoda", "Audi", "Porsche"));

        System.out.println("Metoda: void add(int index, E element)");
        cars.add(2, "Toyota");
        System.out.println(cars + "\n");

        System.out.println("Metoda: boolean add(E element)");
        cars.add("Honda");
        System.out.println(cars + "\n");

        System.out.println("Metoda: int size()");
        System.out.println(cars.size() + "\n");

        System.out.println("Metoda: boolean contains(\"Dacia\")");
        System.out.println(cars.contains("Dacia") + "\n");

        System.out.println("Metoda: get(int index)");
        System.out.println(cars.get(2) + "\n");

        System.out.println("Metoda: indexOf(\"Renault\")");
        System.out.println(cars.indexOf("Renault") + "\n");

        System.out.println("Metoda: lastIndexOf(\"Audi\")");
        System.out.println(cars.lastIndexOf("Audi") + "\n");

        System.out.println("Metoda: remove(\"Audi\")");
        System.out.println(cars.remove("Audi"));
        System.out.println(cars + "\n");

        System.out.println("Metoda: remove(index 3)");
        System.out.println(cars.remove(3));
        System.out.println(cars + "\n");

        System.out.println("Metoda: E set(int index, E element)");
        cars.set(0, "Honda");
        System.out.println(cars + "\n");

        System.out.println("Metoda: clear()");
        cars.clear();
        System.out.println(cars);



    }
}
