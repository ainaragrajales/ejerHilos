package monitores.ejer3;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Sala s = new Sala();
        Random random = new Random();
        boolean r;

        for (int i = 0; i < 50; i++) {
            r = random.nextBoolean();
            (new Persona(s, r)).start();
        }

    }

}
