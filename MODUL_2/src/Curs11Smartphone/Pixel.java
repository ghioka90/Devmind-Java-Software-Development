package Curs11Smartphone;

public class Pixel {
    String color;
    int noPixels;

    public Pixel() {
        this.color = "#FFFFFF";
    }

    public Pixel(int noPixels) {
        this.noPixels = noPixels;
    }

    public Pixel(String color) {
        this.color = color;
    }

    public Pixel(String color, int noPixels) {
        this.color = color;
        this.noPixels = noPixels;
    }

    public void setPixel(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
    }
}
