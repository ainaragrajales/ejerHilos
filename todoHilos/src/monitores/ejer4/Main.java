package monitores.ejer4;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Puente puente = new Puente(0, 0);

        Random rand = new Random();
        int n;

        for (int i = 0; i < 15; i++) {
            n = rand.nextInt(10000);
            (new Vehiculo(("Coche " + i), n, puente)).start();
        }


    }

}
