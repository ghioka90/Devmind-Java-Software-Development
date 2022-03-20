package P2_ImparteSurprize;

public class BagFactoryOptimizeAccess implements IBagFactory{

    //metoda de generare a unui container
    @Override
    public IBag makeBag (String type){
        switch (type){
            case"RANDOM":
                return new RANDOM_Bag();
            case "FIFO":
                return new FIFO_Bag();
            case "LIFO":
                return new LIFO_Bag();
            default:
                return null;
        }
    }

    public static void main(String[] args) {
    }
}
