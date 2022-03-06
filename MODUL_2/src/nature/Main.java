package nature;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Terrestrial aTerrestrialAnimal = new Terrestrial(false, 5, 10,"monkeys", 4,2);
//
//        aTerrestrialAnimal.eat(5);
//        aTerrestrialAnimal.fight();
//        aTerrestrialAnimal.description();
//        aTerrestrialAnimal.move(50);

//        Terrestrial teraCreature = new Terrestrial(false, 10, 100, "Reptiles", 0, 2);
//        teraCreature.move(10); // OK - call the 'Terrestrial'-overridden method 'move(int)'
//        teraCreature.fight(); // OK - call the 'Terrestrial'-specific method 'fight()'
//        System.out.println();

//      Case I - Upcasting:
//      We can treat the object 'Reptiles' as an 'Animal', by
//      referring the object using an 'Animal' reference
//        Animal animalRef = teraCreature; // upcasting
//        animalRef.move(10); // OK - call the 'Terrestrial'-overridden method 'move(int)'
        //animalRef.fight();            // ERROR - even if the object is a 'Terrestrial' and implicitly
                                        // has the 'fight()' method, it cannot be called using an 'Animal'
                                        // reference (i.e. because 'Animals' don't have that behavior)
//        System.out.println();

//      Case II - Further Upcasting:
//        Object object = teraCreature; // upcasting
//        Object object2 = animalRef; //  // upcasting II - equivalent to previous line
//        object.move(10); // ERROR - Similar case: class 'Object' doesn't have that method
//        object.fight(); // ERROR - Similar case...


        Zebra zebra = new Zebra(false,25, 40, "Mountain Zebra" , 4, 2);
        Tiger tiger = new Tiger(true, 40, 70, "Siberian tiger", 4, 2);
        Tiger tiger2 = new Tiger(true, 40, 70, "Bengal tiger", 4, 2);
        Rhino rhino = new Rhino(false, 80, 70, "White rhino", 4, 2);
rhino.eat(5);
rhino.move(20);
//        ArrayList<Terrestrial> zoo = new ArrayList<Terrestrial>();
//        zoo.add(zebra); // 'Zebra' object upcasting to 'Terrestrial' ref.
//        zoo.add(tiger); // 'Tiger' object upcasting to 'Terrestrial' ref.
//        zoo.add(tiger2); // 'Tiger' object upcasting to 'Terrestrial' ref.
//        zoo.add(rhino); // 'Rhino' object upcasting to 'Terrestrial' ref.
//
//        // Vocal show at the zoo:
//        for(int i=0; i<zoo.size(); i++) {
//            zoo.get(i).saySomething();
//        }
//        for(int i=0; i<zoo.size(); i++) {
//            zoo.get(i).camouflage();
//        }
//        Terrestrial tigruRo = new Terrestrial();


//        Zebra theZebra = (Zebra)zoo.get(0);
//        Tiger theFstTiger, theSndTiger;
//        theFstTiger = (Tiger)zoo.get(1);
//        theSndTiger = (Tiger)zoo.get(2);
//        Rhino theRhino = (Rhino)zoo.get(3);
    }
}
