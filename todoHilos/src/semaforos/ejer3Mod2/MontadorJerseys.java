package semaforos.ejer3Mod2;

import java.util.concurrent.Semaphore;

public class MontadorJerseys extends Thread{

    Cesto c;
    Semaphore mutex;
    int jerseys;

    public MontadorJerseys(Cesto c, Semaphore mutex) {
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

            if (c.getCuerpos() > 1 && c.getMangas() > 2) {
                try {
                    sleep(600);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                jerseys++;

                c.setCuerpos(c.getCuerpos() - 1);
                c.setMangas(c.getMangas() - 2);

                System.out.println("Se monta un jersey, hay " + jerseys + " jerseys montados y quedan " + c.getMangas() + " mangas y " + c.getCuerpos() + " cuerpos");

            }
            mutex.release();
        }

        //System.out.println("Se ha montado un jersey");
    }

}
