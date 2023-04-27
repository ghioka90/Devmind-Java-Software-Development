package Exercitii;

public class Ball {
    private String color;
    private double diameter;

    public Ball(String color, double diameter) {
        this.color = color;
        this.diameter = diameter;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}
