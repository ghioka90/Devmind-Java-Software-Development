package Curs6;


import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        MyIntArrayList intArrayList1 = new MyIntArrayList(3);
        MyIntArrayList intArrayList2 = new MyIntArrayList(3);


        intArrayList1.add(22);
        intArrayList1.add(33);
        intArrayList1.add(44);

        intArrayList1.printArray();

        intArrayList1.add(223);
        intArrayList1.add(224);
        intArrayList1.add(225);

        intArrayList1.add(2, 55);
        intArrayList1.add(0, 11);
        intArrayList1.add(7, 999);


        intArrayList1.printArray();

        System.out.println(intArrayList1.size());

        intArrayList1.remove(225);
        intArrayList1.remove(22);
        intArrayList1.removeElementAtIndex(0);

        intArrayList1.printArray();
        System.out.println(intArrayList1.size());


    }
}
