package quizuri;


public class Main {

        public static void main(String[] args) {
            StaticNumber sn1 = new StaticNumber();
            StaticNumber sn2 = new StaticNumber();

            sn1.setRealValue(2.0);
            sn2.realValue = sn1.realValue * 2;
            StaticNumber.realValue = sn1.realValue + sn2.realValue;

            System.out.println(sn1.realValue);
            System.out.println(sn2.getRealValue());
            System.out.println(StaticNumber.realValue);
        }
    }

