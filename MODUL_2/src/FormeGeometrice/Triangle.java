package FormeGeometrice;

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



    public static void main(String[] args) {
    }
}
