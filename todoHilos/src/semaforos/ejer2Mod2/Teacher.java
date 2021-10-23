package semaforos.ejer2Mod2;

import java.util.concurrent.Semaphore;

public class Teacher extends Thread{

    Semaphore profe;
    Semaphore mutex;
    Caja total;

    public Teacher(Semaphore profe, Semaphore mutex, Caja total) {
        this.profe = profe;
        this.mutex = mutex;
        this.total = total;
    }

    @Override
    public void run() {
        try {
            profe.acquire();
            System.out.println("Entra la profe a rellenar");
            mutex.acquire();

            try {
                sleep(1000);
            } catch (InterruptedException e){

            }
            total.setNumero(3);

            System.out.println("Despues de rellenar " + total.getNumero());
            mutex.release();


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
