package P2_ImparteSurprize;

public class BagFactoryOptimizeStorage implements IBagFactory{
    @Override
    public IBag makeBag (String type){
        switch (type){
            case"a":
                return new RANDOM_Bag();
            case "b":
                return new FIFO_Bag();
            case "c":
                return new LIFO_Bag();
            default:
                return null;
        }
    }
    public static void main(String[] args) {
    }
}
