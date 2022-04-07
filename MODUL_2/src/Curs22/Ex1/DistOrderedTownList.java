package Curs22.Ex1;

import java.util.ListIterator;
import java.util.LinkedList;
import java.util.List;

public class DistOrderedTownList extends Town {

    private List<Town> towns = new LinkedList();

    public boolean addELement(Town el) {
        ListIterator<Town> it = towns.listIterator();

        while(it.hasNext()) {
            int compare = it.next().compareTo(el);

            if(compare < 0) {
            }else if(compare > 0) {
                it.previous();
                it.add(el);
                return true;
            }else {
                return false;
            }
        }
        it.add(el);
        return true;
    }

    @Override
    public String toString() {
        String rez = "";
        for(Town el : towns) {
            rez += "\t " + el.getName() + " " + el.getDistance() + " \n";
        }
        return rez;
    }

    public static void main(String[] args) {
    }
}
