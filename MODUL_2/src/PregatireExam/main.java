package PregatireExam;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static ArrayList<String> update(ArrayList<String> species) {
        species.add("Tyrannosaurus");
        species.add(0, "Sauropoda");

        species = new ArrayList<String>(species);
        species.add("Giganotosaurus");

        return species;
    }


    public static void main(String[] args) {
        ArrayList<String> dinosaurs = new ArrayList<String>();
        dinosaurs.add("Spinosaurus");
        System.out.println();
        ArrayList<String> dinosaursUpdated = update(dinosaurs);

        System.out.println(dinosaurs.size() + dinosaursUpdated.size());
    }
}
