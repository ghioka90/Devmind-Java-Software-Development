package P2_ImparteSurprize;

import java.util.ArrayList;

public abstract class AbstractGiveSurprises {

    private static final IBagFactory makeContainer = new BagFactoryOptimizeAccess();

    ArrayList<IBag> container = new ArrayList<IBag>();
    private int waitTime;
    private IBag containerType;

    public AbstractGiveSurprises(String contType, int wTime) {
        this.containerType = makeContainer.makeBag(contType);
        this.waitTime = wTime;
    }


    // metoda de adaugare a unei surprize
    void put(ISurprise newSurprise) {
        this.containerType.put(newSurprise);
    }

    // metoda care adauga toate surprizele
    void put(IBag surprises) {
        this.containerType.put(surprises);
    }

    public void give() {
        ISurprise surprise = this.containerType.takeOut();

        if (surprise != null) {
            surprise.enjoy();
            this.giveWithPassion();
        }
    }

    public void giveAll() {
        if (this.container.isEmpty()) {
            System.out.println("The bag is ");
        }
    }


    public boolean isEmpty() {
        return this.container.isEmpty();
    }



protected  abstract  void giveWithPassion();

    public static void main(String[] args) {
    }
}
