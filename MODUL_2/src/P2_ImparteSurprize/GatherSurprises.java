package P2_ImparteSurprize;

import java.util.ArrayList;

public class GatherSurprises {// clasa care genereaza un tip random de n surprize
    //constructor
    private GatherSurprises(){
    }

    public static ISurprise gather(){
        int randomType = helpingClass.random.nextInt(helpingClass.typesOfSurprise);
        ISurprise generatedSurprise = null;

        switch (randomType){
            case 0:
                generatedSurprise = FortuneCookie.generate();
                break;
            case 1:
                generatedSurprise = Candies.generate();
                break;
            case 2:
                generatedSurprise = MinionToy.generate();
                break;

        }
        return generatedSurprise;
    }
    // metoda care populeaza un arraylist cu elemente(surprize) ce implemeteaza interfata iSurprise
    public static ArrayList<ISurprise> gather(int n) {
        ArrayList<ISurprise> surprises = new ArrayList<>(n);

        for (int i = 0 ; i < n; i++){
            surprises.add(gather());
        }
        return surprises;
    }



    public static void main(String[] args) {
    }
}
