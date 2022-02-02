package Curs5;

public class ex3 {
    public static void main(String[] args) {
        /*
        3. Implementeaza secventa urmatoare de cod si indica (in comentarii) succesiunea de actualizari ale valorii variabilei temperature.
        Atentie: este important sa indici toate actualizarile si in ordinea in care acestea au loc. Ulterior, vei explica trainerului rationamentul tau.
         */
        int temperature = 23; // celsius
        temperature = temperature++ - ++temperature + +(-(--temperature)) - (--temperature + temperature++);
/*                   = 23 - 25 +(- 24) - ( 23 + 23)
                     = 23 - 25 + (-24) - 46
                     = 23 - 25 - 24 - 46
                     = -2 - 24 - 46
                     = -26 - 46
                     = -72
 */

        System.out.println(temperature);

    }
}
