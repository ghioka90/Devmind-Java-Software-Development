package Curs5;

public class ex1 {
    public static void main(String[] args) {
        /*
        1. Folosind operatorii compusi de atribuire, prescurteaza cat mai multe instructiuni din sectiunea urmatoare.
        Ai in vedere ca nu toate instructiunile sunt compatibile, iar unele necesita o preprocesare pentru a deveni compatibile.
        Asigura-te ca rezultatele sunt in continuare aceleasi.
         */
        int operand1 = 24, operand2 = 35, operand3 = 15, operand4 = 55;
        int result;

        result = operand1 + operand2;
        result /= operand4;
        result += operand3;
        result *= (operand1 * 2);
        result -= operand3;
        result -= (-3) * 3 * operand4;

        System.out.println(-result);
    }
}
