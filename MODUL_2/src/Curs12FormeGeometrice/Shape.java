package Curs12FormeGeometrice;

import java.util.Objects;

public abstract class Shape {
    public String material;
    public String text;

    public abstract void displayShapeHeight();

    public abstract void objShape();

    public abstract double getSize();
//    {
//        return -1;
//    }

    public abstract String toString();
//    {
//        return "made of " + material + ", contains the text: \"" + text +"\".";
//    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Shape other = (Shape) obj;
        if (this.text.equals(other.text) && this.material.equals(other.material)) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, material);
    }

    public static void main(String[] args) {
    }
}
