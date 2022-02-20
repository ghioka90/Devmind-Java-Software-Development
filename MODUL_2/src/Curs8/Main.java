package Curs8;

public class Main {
    public static void main(String[] args) {
        OnRoad car1 = new OnRoad("214587", 3,"Skoda",4,5);
        OnRoad car2 = new OnRoad("214587",1,"Audi", 4,3);

        OnWater ship1 = new OnWater("sdhy5484",20,"Victoria",3,20000);
        OnWater ship2 = new OnWater("sdhy5494",30,"Speranta",1,8000);

        OnAir plane1 = new OnAir("abc24587",200,"Air Force One",4,true);
        OnAir plane2 = new OnAir("abc25478",50,"Hercules",4,false);


        car1.goTo(21.2,50.5);
        car1.addFuel(30);
        car1.printlnfo();
        System.out.println();

        car2.goTo(10.5,40.9);
        car2.addFuel(40);
        car2.printlnfo();
        System.out.println();


        ship1.goTo(200.45,700.50);
        ship1.addFuel(200.5);
        ship1.printlnfo();
        System.out.println();

        ship2.goTo(245.45,563.50);
        ship2.addFuel(284.5);
        ship2.printlnfo();
        System.out.println();


        plane1.goTo(8745.7,2847.4);
        plane1.addFuel(1000);
        plane1.printlnfo();
        System.out.println();

        plane2.goTo(5274.7,2174.24);
        plane2.addFuel(874);
        plane2.printlnfo();
        System.out.println();






    }
}
