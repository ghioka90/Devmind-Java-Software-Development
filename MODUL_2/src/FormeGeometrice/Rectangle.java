package FormeGeometrice;

public class Rectangle extends Shape {
    public int width;
    public int height;

    public Rectangle(){}

    public Rectangle( int width, int height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(String text, String material,int width, int height){
        super(text, material);
        this.width = width;
        this.height = height;
    }

    public void displayRectangleHeight (){
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

    public static void main(String[] args) {
    }
}
