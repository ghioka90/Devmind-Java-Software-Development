package Curs22.Ex1;

import Curs22.Ex1.DistOrderedTownList;
import Curs22.Ex1.Town;

public class TestDistOrdered {
    public static void main(String[] args) {
        DistOrderedTownList townList = new DistOrderedTownList();

        townList.addELement(new Town("Timisoara", 100));
        townList.addELement(new Town("Arad", 150));
        townList.addELement(new Town("Bucuresti", 0));
        townList.addELement(new Town("Buzau", 110));
        townList.addELement(new Town("Ploiesti", 65));
        townList.addELement(new Town("Costanta", 230));
        System.out.println(townList);

    }
}
