package Exercitii;

import java.util.ArrayList;

public class Cheesecake  extends Desert{
    public Cheesecake(int calories) {
        super(calories);
    }

    @Override
    public int getEnergyOn100() {
        return 0;
    }

    @Override
    public ArrayList<String> etIngredients() {
        return null;
    }
}
