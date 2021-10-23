package semaforos.ejer2Mod2;

import java.util.concurrent.Semaphore;

public class Kid extends Thread{

    Semaphore profe;
    Semaphore mutex;
    Caja total;


    public Kid(Semaphore profe, Semaphore mutex, Caja total) {
        this.profe = profe;
        this.mutex = mutex;
        this.total = total;
    }

    @Override
    public void run() {
        try {
            mutex.acquire();
            System.out.println("Niño intenta jugar");
            System.out.println("numero de juguetes" + total.getNumero());
            if (total.getNumero() == 1){
                System.out.println("Niño coje el último juguete");
                System.out.println("Niño avisa de que no quedan juguetes");
                total.setNumero(total.getNumero() -1);
                mutex.release();
                profe.release();

            } else if (total.getNumero() > 1){

                System.out.println("niño coje jueguete porque hay " + total.getNumero());
                total.setNumero(total.getNumero() -1);
            }

            try {
                sleep(1000);
            } catch (InterruptedException e){

            }
            mutex.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
