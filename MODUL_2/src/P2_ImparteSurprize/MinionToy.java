package P2_ImparteSurprize;

import java.util.ArrayList;

public class MinionToy implements ISurprise{
    private String minionName;
    private static int count = 0;// un counter in care contorizam pozitia ultimului minion oferit
    private static ArrayList<String> nameOfMinion = helpingClass.minionNames();
    //constructor
    public MinionToy(String minionName) {
        this.minionName = minionName;
    }

    //medota de deschidere a surprizei care afiseaza un mesaj cu numele minionulio
    @Override
    public void enjoy(){
        System.out.println("Felicitari! Ai primit minionul " + this.minionName + ".");
    }

    //metoda generate care returneaza minioni consecutiv
    public static MinionToy generate() {
        String minionName = nameOfMinion.get(count);
        count++;
        if (count > nameOfMinion.size() - 1){
            count = 0;
        }
        return new MinionToy(minionName);
    }
    //metoda de afisare
    @Override
    public String toString (){
        return "\nMinion toy name: " + minionName;
    }

    public static void main(String[] args) {
    }


}
