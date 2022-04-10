package Curs22.Ex4;

import java.util.LinkedList;

public class MergeTwoSortedLinkedList {


    public static LinkedList<Integer> mergeTwoSortedLists(LinkedList<Integer> list1, LinkedList<Integer> list2){
        LinkedList<Integer> mergedList = new LinkedList<>();
        if (list1.size() > list2.size()){
            LinkedList<Integer> aux = list1;
            list1 = list2;
            list2 = aux;
        }


        while(!list1.isEmpty()){
            if (list1.getFirst() >= list2.getFirst()){
                mergedList.addFirst(list2.getFirst());
                mergedList.addFirst(list1.getFirst());
                list1.removeFirst();
                list2.removeFirst();
            }else{
                mergedList.addFirst(list1.getFirst());
                mergedList.addFirst(list2.getFirst());
                list1.removeFirst();
                list2.removeFirst();
            }
        }
        while(!list2.isEmpty()){
            mergedList.addFirst(list2.getFirst());
            list2.removeFirst();
        }

        return mergedList;
    }
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        list1.add(1);
        list1.add(2);
        list1.add(2);
        list1.add(3);
        list1.add(5);
        list1.add(6);
        list1.add(7);



        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);


        System.out.println(mergeTwoSortedLists(list1, list2));
    }
}
