package semaforos.ejer3Mod2;

import java.util.concurrent.Semaphore;

public class FabricanteMangas extends Thread{

    Cesto c;
    Semaphore mutex;

    public FabricanteMangas(Cesto c, Semaphore mutex) {
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
            if (c.getMangas()<20){
                try {
                    sleep(350);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                c.setMangas(c.getMangas()+1);
                System.out.println("Se teje una manga, hay " + c.getMangas() + " en total");
            }
            mutex.release();
        }
    }
}
