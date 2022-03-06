package Curs12FormeGeometrice;

import java.util.Objects;

public class Rectangle extends Shape {
    public int width;
    public int height;

    public Rectangle(){}

    public Rectangle( int width, int height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(String material,int width, int height){
        this.material = material;
        this.width= width;
        this.height = height;
    }

    @Override
    public void displayShapeHeight (){
        System.out.println("Rectangle height is: " + height);
    }

    @Override
    public String toString(){
        return "Rectanagle: height is: " + this.height + ", width is: " + this.width + ", made of " + material + ", contains the text: \"" + text +"\".";
    }

    @Override
    public double getSize (){
        return this.height*this.width;
    }

    @Override
    public void objShape(){
        System.out.println("This is a Triangle");
    }

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

        Rectangle rectangleObj = (Rectangle) obj;
        if (super.equals(rectangleObj) &&
            this.width == rectangleObj.width &&
            this.height == rectangleObj.height) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), width, height);
    }

    public static void main(String[] args) {
    }
}
