package semaforos.ejer3Mod2;

import java.util.concurrent.Semaphore;

public class FabricanteCuerpos extends Thread {

    Cesto c;
    Semaphore mutex;

    public FabricanteCuerpos(Cesto c, Semaphore mutex) {
        this.c = c;
        this.mutex = mutex;
    }

    @Override
    public void run() {
        while (true) {
            try {
                mutex.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (c.getCuerpos() < 8) {
                try {
                    sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                c.setCuerpos(c.getCuerpos() + 1);
                System.out.println("Se teje un cuerpo, hay " + c.getCuerpos() + " en total");

            }
        }

    }

}
