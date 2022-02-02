package Curs3;

public class Ex23 {
    public static void main(String[] args) {
        /*
        3. Corecteaza erorile din urmatoarea secventa de cod astfel incat sa ruleze fara erori.
        Poti modifica orice in afara de tipul variabilelor. Inainte sa copiezi codul pe calculator,
        incearca sa identifici singur cat mai multe nereguli si sa le corectezi.
        Cate ai gasit? Ulterior, scrie codul corectat pe calculator.
        Cate erori au ramas nedepistate? Si cate ai reusit sa corectezi singur dintre ele?
         */
        byte verySmallNumber = -123;
        short verySmallNumber1 = 12_323;
        int integerNumber1 = verySmallNumber * 2;
        long veryBigNumber = 123_456_000_000_001L;
        integerNumber1 = integerNumber1 + 20;
        System.out.println(verySmallNumber);
        System.out.println(verySmallNumber1);
        System.out.println(veryBigNumber);
    }
}
