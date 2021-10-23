package semaforos.ejer3Mod2;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {

        Cesto c = new Cesto(0, 0);
        Semaphore mutex = new Semaphore(1);
        FabricanteCuerpos fc = new FabricanteCuerpos(c, mutex);
        FabricanteMangas fm = new FabricanteMangas(c, mutex);
        MontadorJerseys mj = new MontadorJerseys(c, mutex);

        fc.start();
        fm.start();
        mj.start();

    }

}
