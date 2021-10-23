package semaforos.ejer1;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {
        final int num_escritores = 3;
        final int num_lectores = 10;
        final int resursos_max = 5;

        Semaphore semaphore = new Semaphore(resursos_max);

        for (int i = 0; i < num_escritores; i++) {
            (new Escritor("Escritor " + i, semaphore)).start();
        }

        for (int i = 0; i < num_lectores; i++) {
            (new Lector("Lector " + i, semaphore)).start();
        }
    }

}
