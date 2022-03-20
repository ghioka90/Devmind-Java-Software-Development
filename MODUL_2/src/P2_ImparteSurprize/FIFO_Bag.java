package P2_ImparteSurprize;
import java.util.ArrayList;

public class FIFO_Bag implements IBag{

    ArrayList<ISurprise> FIFOBag = new ArrayList<ISurprise>();

    //metoda de adaugare a unei suprize care implemeaza interfata ISurprise
    @Override
    public void put (ISurprise newSurprise){
        if (newSurprise == null){
            System.out.println("Surpriza este NULL, deci nu se poate adauga.");
        }
        this.FIFOBag.add(newSurprise);
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
    //metoda de extragere a primei surprize adaugate in container
    @Override
    public ISurprise takeOut(){

        if (this.FIFOBag.size()==0){
            System.out.println("Tolba FIFO este goala.");
        }

        //extragem prima surpriza
        ISurprise newSurprise = this.FIFOBag.get(0);
        this.FIFOBag.remove(newSurprise);

        return newSurprise;
    }

    @Override
    public boolean isEmpty(){
        return this.FIFOBag.size() == 0;
    }

    @Override
    public  int size(){
        return FIFOBag.size();
    }
    public static void main(String[] args) {
    }
}
