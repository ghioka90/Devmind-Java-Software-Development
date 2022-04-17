package Curs22.Ex2;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class removeDuplicates {
    public static void removeDuplic(LinkedList<Integer> list) {
        Integer previousElement = 0;
        for(int it = 0; it < list.size(); it++ ) {
            if (list.get(it) == previousElement) {
                System.out.println(list.get(it));
                System.out.println(it);
                list.remove(it);
            }
            previousElement = list.get(it);
        }
    }
    private List<Integer> elements = new LinkedList();

    public boolean add(Integer el) {
        ListIterator<Integer> it = elements.listIterator();

        while(it.hasNext()) {
            int compare = it.next().compareTo(el);

            if(compare < 0) {
            }else if(compare >= 0) {
                it.previous();
                it.add(el);
                return true;
            }else {
                return false;
            }
        }
        it.add(el);
        return true;
    }

    public void removeDuplicates21() {
        ListIterator<Integer> it = elements.listIterator();

        if(it.hasNext()) {
            Integer previousElement = it.next();
            while(it.hasNext()) {
                Integer nextElement = it.next();
                if(previousElement.compareTo(nextElement) == 0) {
                    it.remove();
                }
                previousElement = nextElement;
            }
        }
    }

    public void removeDuplicates22() {
        ListIterator<Integer> it = elements.listIterator();
        boolean hasBeenRemoved;
        int count = 0;

        if(it.hasNext()) {
            Integer previousElement = it.next();
            hasBeenRemoved = false;
            while(it.hasNext()) {

                Integer nextElement = it.next();
                if(previousElement.compareTo(nextElement) == 0) {
                    it.remove();
                    it.next();
                    hasBeenRemoved = true;
                    }else
                        if (hasBeenRemoved == true){
                            it.previous();
                            it.next();
                            it.remove();
                            hasBeenRemoved = false;
                        }

                previousElement = nextElement;
            }
        }
    }

    @Override
    public String toString() {
        String rez = "";
        for(Integer el : elements) {
            rez += "\t " + el + " ";
        }
        return rez;
    }

    public static void main(String[] args) {

        removeDuplicates newList = new removeDuplicates();

        newList.add(1);
        newList.add(1);
        newList.add(2);
        newList.add(3);
        newList.add(3);
        newList.add(3);
        newList.add(3);
        newList.add(3);
        newList.add(4);
        newList.add(5);
        newList.add(6);

        System.out.println(newList);
//        newList.removeDuplicates21();
//        System.out.println(newList);
        newList.removeDuplicates22();
        System.out.println(newList);


    }
}
