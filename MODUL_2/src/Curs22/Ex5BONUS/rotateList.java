package Curs22.Ex5BONUS;

import java.util.LinkedList;

public class rotateList {
    public static LinkedList<Integer> rotateListRight(LinkedList<Integer> list, int key){
        LinkedList<Integer> rotatedList = new LinkedList<>();
        int position = list.size() - key;
        if (key == list.size()){
            return list;
        }else {
            for (int it = position; it <= list.size() - 1; it++) {
//                System.out.println(position);
                rotatedList.addLast(list.get(position));
//           list.remove(position);
//                position++;
            }
            System.out.println(position);
            for (int it = 0; it <= position - 1 ; it++) {
                rotatedList.addLast(list.getFirst());
//                list.removeFirst();
            }
            return rotatedList;
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        //cand key este 4 sau 5  afiseaza un element de 2 ori
        System.out.println(rotateListRight(list1, 4));
    }
}
