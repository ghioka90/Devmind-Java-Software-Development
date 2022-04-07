package Curs22;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class towns {
    public static void main(String[] args) {
        LinkedList<String> towns = new LinkedList<>();

// populate list with towns:
        towns.add("Cluj");
        towns.add("Targu Jiu");
        towns.add("Suceava");
        towns.add("Bucuresti");
        towns.add("Brasov");
        towns.add("Buzau");
        towns.remove("Bucuresti");

        for (int i=0; i<towns.size(); i++) {
            System.out.println("Current town is: " + towns.get(i));
        }
        System.out.println();

        // iterate over a list, using a standard iterator:
        Iterator<String> i = towns.iterator();
        while(i.hasNext()) {
            System.out.println("Current town is: " + i.next());
        }
        System.out.println();

        // iterate over a list, using the enhanced for loop:
        for(String town : towns) {
            System.out.println("Current town is: " + town);
        }
        System.out.println();

        // iterate over a list, using a specialized LinkedList iterator:
        ListIterator<String> listIt = towns.listIterator();

        // I. forward
        while (listIt.hasNext()) {
            System.out.println("Current town is: " + listIt.next());
        }
        System.out.println();

        // II. backward
        while (listIt.hasPrevious()) {
            System.out.println("Current town is: " + listIt.previous());
        }
        System.out.println();

//        private static Scanner scanner = new Scanner(System.in);
//
//        public static void printManual() {
//            System.out.println("Options are:\n" +
//                    "\t0 - quit\n" +
//                    "\t1 - next element\n" +
//                    "\t2 - previous element\n" +
//                    "\t3 - this list\n");
//        }
//
//        public static void iterate(LinkedList<String> towns) {
//            ListIterator<String> li = towns.listIterator();
//            printManual();
//
//            while(true) {
//                int option = scanner.nextInt();
//                switch (option) {
//                    case 0:
//                        return;
//                    case 1:
//                        if (li.hasNext()) {
//                            System.out.println(li.next());
//                        }
//                        break;
//                    case 2:
//                        if (li.hasPrevious()) {
//                            System.out.println(li.previous());
//                        }
//                        break;
//                    case 3:
//                        printManual();
//                        break;
//                    default:
//                        System.out.println("Unknown command");
//                        printManual();
//                        break;
//                }
//            }
//        }

    }
}
