package Exercitii;

public abstract class Desert implements ISweet, IHealthValues {
    private int calories;
    public Desert(int calories) {
        this.calories = calories;
    }
    @Override public int getCaloriesNo() {
        return this.calories;
    }
}

