package P2_ImparteSurprize;

import java.util.ArrayList;

public class RANDOM_Bag implements IBag{

    //container random in care putem stoca oricare tip de surpriza;
    ArrayList<ISurprise> randomBag = new ArrayList<ISurprise>();

    //metoda de adaugare a unei suprize care implemeaza interfata ISurprise
    @Override
    public void put (ISurprise newSurprise){
        if (newSurprise == null){
            System.out.println("Surpriza este NULL, deci nu se poate adauga.");
        }
        this.randomBag.add(newSurprise);
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
    //metoda de extragere a unei surprize
    @Override
    public ISurprise takeOut(){
        int randomNo = 0;
        if (this.randomBag.size()==0){
            System.out.println("Tolba randomBag este goala.");
        }
        randomNo = helpingClass.random.nextInt(this.randomBag.size());

        ISurprise newSurprise = this.randomBag.get(randomNo);
        this.randomBag.remove(newSurprise);

        return newSurprise;
    }

    @Override
    public boolean isEmpty(){
        return this.randomBag.size() == 0;
    }

    @Override
    public  int size(){
        return randomBag.size();
    }

    public static void main(String[] args) {
    }
}
