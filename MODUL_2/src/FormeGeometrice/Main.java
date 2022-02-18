package FormeGeometrice;

public class Main {

    public static void main(String[] args) {
        Triangle triunghi = new Triangle("Sunt un triunghi", "metal",3, 7);
        Rectangle patrulater = new Rectangle("Sunt un patrulater", "plastic",50, 15);


        triunghi.displayTriangleHeight();
        patrulater.displayRectangleHeight();
        System.out.println(triunghi.getSize());
        System.out.println(patrulater.getSize());
        System.out.println(triunghi.toString());
        System.out.println(patrulater.toString());

    }
}
