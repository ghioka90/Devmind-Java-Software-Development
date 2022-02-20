package Curs10FormeGeometrice;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Shape forma = new Shape("Nu stiu ce forma geometrica sunt", "polistiren");
        Shape forma2 = new Shape("Nici eu nu stiu ce sunt", "bumbac");

        Triangle triunghi = new Triangle("Sunt un triunghi", "metal",3, 7);
        Triangle triunghi2 = new Triangle("Sunt un triunghi2", "lemn",10, 7);

        Rectangle patrulater = new Rectangle("Sunt un patrulater", "lemn",53, 28);
        Rectangle patrulater2 = new Rectangle("Sunt un patrulater2", "plastic",50, 15);

        ArrayList<Shape> shapeArrayList = new ArrayList<Shape>();
        shapeArrayList.add(forma);
        shapeArrayList.add(forma2);
        shapeArrayList.add(triunghi);
        shapeArrayList.add(triunghi2);
        shapeArrayList.add(patrulater);
        shapeArrayList.add(patrulater2);


        triunghi.displayTriangleHeight();
        patrulater.displayRectangleHeight();
        System.out.println(triunghi.getSize());
        System.out.println(patrulater.getSize());
        System.out.println(triunghi.toString());
        System.out.println(patrulater.toString());

        Triangle triunghi3 = triunghi;
        System.out.println(triunghi.equals(triunghi2));
        System.out.println(triunghi.equals(triunghi3));
        System.out.println(triunghi.hashCode());
        System.out.println(triunghi2.hashCode());
        System.out.println(triunghi3.hashCode());

        for (int i = 0; i < shapeArrayList.size(); i++){
            System.out.println(shapeArrayList.get(i).toString());
        }

        for (int i = 0; i < shapeArrayList.size(); i++){
            System.out.println(shapeArrayList.get(i).getSize());
        }
        for (int i = 0; i < shapeArrayList.size(); i++){
            if(shapeArrayList.get(i) instanceof Triangle){
                Triangle triangleRef = (Triangle) shapeArrayList.get(i);
                triangleRef.displayTriangleHeight();
            }else if(shapeArrayList.get(i) instanceof Rectangle){
                Rectangle rectangleRef = (Rectangle) shapeArrayList.get(i);
                rectangleRef.displayRectangleHeight();
            }else{
                System.out.println("Error: unknown kind of shape");
            }
        }
    }
}
