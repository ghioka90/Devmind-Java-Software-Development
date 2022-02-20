package Curs10FormeGeometrice;

import java.util.Objects;

public class Triangle extends Shape{
    public int base;
    public int height;

    public Triangle(){}

    public Triangle( int base, int height){
        this.base = base;
        this.height = height;
    }

    public Triangle(String text, String material,int base, int height){
        super(text, material);
        this.base = base;
        this.height = height;
    }
    public void displayTriangleHeight (){
        System.out.println("Triangle height is: " + height);
    }
    @Override
    public double getSize(){
        return (this.base * this.height) / 2.0;
    }
    @Override
    public String toString(){
        return "Triangle: height is: " + this.height + ", base is: " + this.base + ", made of " + material + ", contains the text: \"" + text +"\".";
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

        Triangle triangleObj = (Triangle) obj;
        if (super.equals(triangleObj) &&
                this.base == triangleObj.base &&
                this.height == triangleObj.height) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), base, height);
    }

    public static void main(String[] args) {
    }
}
