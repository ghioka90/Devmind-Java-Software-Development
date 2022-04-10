package Curs22.Ex3;

import javax.net.ssl.HostnameVerifier;
import java.util.LinkedList;
import java.util.ListIterator;

public class BigNumbers {

    public static LinkedList<Integer> sum(LinkedList<Integer> op1, LinkedList<Integer> op2) {
        // TODO: Your code goes here...
        LinkedList<Integer> sumList = new LinkedList<>();
         if (op1.size() > op2.size()){
             LinkedList<Integer> aux = op1;
             op1 = op2;
             op2 = aux;
         }
         int overload = 0;
         int sum = 0;

         while (!op1.isEmpty()){
             sum = op1.getLast() + op2.getLast();
             sumList.addFirst(sum % 10 + overload);
             overload = sum / 10;
             op1.removeLast();
             op2.removeLast();
         }
         while (!op2.isEmpty()){
             sumList.addFirst(op2.getLast() + overload);
             overload = 0;
             op2.removeLast();
             sum = 0;
         }
        System.out.println(sum);
         if (sum >= 10){

             sumList.addFirst(sum/10);
         }
        return sumList;
    }


    public static void main(String[] args) {
        LinkedList<Integer> op1 = new LinkedList<>();
        LinkedList<Integer> op2 = new LinkedList<>();

        op1.add(5);
        op1.add(3);
        op1.add(2);
        op1.add(2);


        System.out.println("Operand 1 : " + op1);
        op2.add(7);
        op2.add(3);
        op2.add(2);
        op2.add(2);

        System.out.println("Operand 2 : " + op2);



        System.out.println("Operand 1 + Operand 2 = " + sum(op1,op2));


    }
}
