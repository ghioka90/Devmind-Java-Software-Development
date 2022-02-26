package Curs11Smartphone;

public class Dimensions {
    int width;
    int lenght;
    int depth;

    public Dimensions(int width) {
        this.width = width;
    }

    public Dimensions(int width, int lenght) {
        this(width);
        this.lenght = lenght;
    }

    public Dimensions(int width, int lenght, int depth) {
        this(width, lenght);
        this.depth = depth;
    }
    public int getWidth() {
        return width;
    }

    public int getLenght() {
        return lenght;
    }

    @Override
    public String toString(){
        return "W: " + width + ",L: " + lenght + ",D: " + depth;
    }
    public static void main(String[] args) {
    }
}
