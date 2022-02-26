package Curs11Smartphone;

import java.util.ArrayList;

public class Screen {

    private ArrayList<Pixel> pixels = new ArrayList<Pixel>();

    private Dimensions theDimensions;

    public Screen(){}

    public Screen (int noPixels, int lenght, int width, int depth ){
        this.pixels = new ArrayList<Pixel>(noPixels);
        for (int i = 0; i < noPixels; i++){
            this.pixels.add(new Pixel());
        }
        this.theDimensions =  new Dimensions(lenght,width,depth);
    }

    public void setPixels(int index, String color) {
        this.pixels.get(index).setPixel(color);
    }

    public void colorScreen(String color){
        for ( int i = 0; i < this.pixels.size(); i++ ){
            this.pixels.get(i).setPixel(color);
        }
    }

    public static void main(String[] args) {
    }
}
