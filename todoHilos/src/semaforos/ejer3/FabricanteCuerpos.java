package semaforos.ejer3;

import java.util.concurrent.Semaphore;

public class FabricanteCuerpos extends Thread{

    Semaphore cestaCuerposCantidad;
    Semaphore cestaCuerposCapacidad;

    public FabricanteCuerpos(Semaphore cestaCuerposCapacidad, Semaphore cestaCuerposCantidad) {

        this.cestaCuerposCapacidad = cestaCuerposCapacidad;
        this.cestaCuerposCantidad = cestaCuerposCantidad;
    }

    @Override
    public void run() {

        try {
            cestaCuerposCapacidad.acquire();


            System.out.println("Cosiendo una manga");

            cestaCuerposCantidad.release();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
