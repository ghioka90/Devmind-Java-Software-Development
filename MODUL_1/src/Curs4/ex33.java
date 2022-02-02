package Curs4;

public class ex33 {
    public static void main(String[] args) {
        /*
        3. Follow-up la Exercitiul 1. Cerinta: Ne dorim sa proiectam un generator de paranteze,
        care sa asigure ordinea de la stanga la dreapta de executie a operatiilor, pentru orice expresie matematica. Exercitiul are 3 etape:

            1 Gandeste-te cum ar trebui sa functioneze un generator automat de paranteze (fara sa-l implementezi)
            si cum vor arata expresiile matematice rezultate (i.e. dupa aplicarea algoritmului de generare a parantezelor).
            2 Ulterior, adauga manual paranteze expresiei de la Exercitiul 1., conform functionalitatii generatorului de paranteze proiectat de tine.
            Nota: Nu trebuie sa implementezi generatorul de paranteze (algoritmul depaseste notiunile invatate).
            Doar adauga expresiei de la Exercitiul 1. paranteze, conform functionarii generatorului.
            3 La final, testeaza expresia obtinuta la subpunctul anterior si asigura-te ca da rezultatul corect.
            4 Argumenteaza (cu trainerul) de ce generatorul tau produce rezultatul dorit pentru orice ecuatie matematica.
         */
        //*daca avem o expresie cu n termeni putem proiecta un program care sa deschida la inceputul expresiei
        // n paranteze si sa le inchida dupa fiecare termen.
        double leftToRightOrderComputation3 = (((((((100d) + 5d) * 10d) - 2.23d) * 18d) / 4d) + 2d);
        System.out.println(leftToRightOrderComputation3);

    }
}
