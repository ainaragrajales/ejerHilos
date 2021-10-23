package semaforos.ejer3;

import java.util.concurrent.Semaphore;

public class FabricanteMangas extends Thread{

    Semaphore cestaMangasCantidad;
    Semaphore cestaMangasCapacidad;

    public FabricanteMangas(Semaphore cestaMangasCapacidad, Semaphore cestaMangasCantidad) {
        this.cestaMangasCapacidad = cestaMangasCapacidad;
        this.cestaMangasCantidad = cestaMangasCantidad;
    }

    @Override
    public void run() {

        try {
            cestaMangasCapacidad.acquire(2);


            System.out.println("Cosiendo una manga");

            cestaMangasCantidad.release(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }
}
