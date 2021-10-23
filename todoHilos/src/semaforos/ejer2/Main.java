package semaforos.ejer2;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {

        final int num_ninios = 7;
        final int resursos_max = 10;

        Semaphore semaphore = new Semaphore(resursos_max);

        for (int i = 0; i < num_ninios; i++) {
            (new Hilo("Niñ@ " + i, 1, semaphore)).start();
        }
        (new Hilo("Profesor@ ", 2, semaphore)).start();

    }

}
