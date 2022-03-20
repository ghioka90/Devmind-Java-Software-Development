package P2_ImparteSurprize;

import java.util.ArrayList;

public class LIFO_Bag implements IBag{
    ArrayList<ISurprise> LIFOBag = new ArrayList<ISurprise>();

    //metoda de adaugare a unei suprize care implemeaza interfata ISurprise
    @Override
    public void put (ISurprise newSurprise){
        if (newSurprise == null){
            System.out.println("Surpriza este NULL, deci nu se poate adauga.");
        }
        this.LIFOBag.add(newSurprise);
    }

    //metoda de adaugare a unui container de surprize ce implementeaza iBag
    @Override
    public void put (IBag newBag){
        if (newBag.isEmpty()){
            System.out.println("Tolba este goala!");
        }

        while (!newBag.isEmpty()){
            ISurprise newSurpriseToAdd = newBag.takeOut();
            put(newSurpriseToAdd);
        }
    }
    //metoda de extragere a ultimei surprize adaugate in container
    @Override
    public ISurprise takeOut(){
        if (this.LIFOBag.size()==0){
            System.out.println("Tolba LIFO este goala.");
        }
        //extragem ultima surpriza
        ISurprise newSurprise = this.LIFOBag.get(this.LIFOBag.size()-1);
        this.LIFOBag.remove(newSurprise);

        return newSurprise;
    }

    @Override
    public boolean isEmpty(){
        return this.LIFOBag.size() == 0;
    }

    @Override
    public  int size(){
        return LIFOBag.size();
    }
    public static void main(String[] args) {
    }
}
