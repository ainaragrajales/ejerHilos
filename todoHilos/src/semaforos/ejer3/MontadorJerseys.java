package semaforos.ejer3;

import java.util.concurrent.Semaphore;

public class MontadorJerseys extends Thread{

    Semaphore cestaMangasCantidad, cestaMangasCapacidad;
    Semaphore cestaCuerposCantidad, cestaCuerposCapacidad;

    public MontadorJerseys(Semaphore cestaMangasCantidad, Semaphore cestaCuerposCantidad, Semaphore cestaMangasCapacidad, Semaphore cestaCuerposCapacidad) {
        this.cestaMangasCantidad = cestaMangasCantidad;
        this.cestaCuerposCantidad = cestaCuerposCantidad;
        this.cestaMangasCapacidad = cestaMangasCapacidad;
        this.cestaCuerposCapacidad = cestaCuerposCapacidad;
    }

    @Override
    public void run() {

        try {
            cestaMangasCantidad.acquire(2);
            cestaCuerposCantidad.acquire();
            System.out.println("Montando un jersey");
            cestaMangasCapacidad.release(2);
            cestaCuerposCapacidad.release();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        //System.out.println("Se ha montado un jersey");
    }

}
