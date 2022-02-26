package Curs11Smartphone;

public class Dimensions {
    int width, lenght, depth;

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

    public static void main(String[] args) {
    }
}
