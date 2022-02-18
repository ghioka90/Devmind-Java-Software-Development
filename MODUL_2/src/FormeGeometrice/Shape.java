package FormeGeometrice;

public class Shape {
    public String text;
    public String material;

    public Shape(){

    }
    public Shape(String text, String material) {
        this.text = text;
        this.material = material;
    }

    public double getSize(){
        return -1;
    }

    public String toString(){
        return "made of " + material + ", contains the text: \"" + text +"\".";
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

        Shape other = (Shape) obj;
        if (this.text.equals(other.text) && this.material.equals(other.material)) {
            return true;
        }

        return false;
    }


    public static void main(String[] args) {
    }
}
