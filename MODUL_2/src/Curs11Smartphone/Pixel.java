package Curs11Smartphone;

public class Pixel {
    String color;


    public Pixel() {
        this.color = "#FFFFFF";
    }

    public Pixel(String color) {
        this.color = color;
    }

    public void setPixel(String color) {
        this.color = color;
    }

    @Override
    public String toString(){
        return this.color;
    }

    public static void main(String[] args) {
    }
}
