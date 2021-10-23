package semaforos.ejer1;

import java.util.concurrent.Semaphore;

public class Lector extends Thread {

    private Semaphore semaforo;

    public Lector(String nombre, Semaphore semaforo){
        this.setName(nombre);
        this.semaforo = semaforo;
    }

    @Override
    public void run() {
        read();
    }

    public void read(){
        System.out.println(Thread.currentThread().getName() + ": intentando leer");
        try {
            semaforo.acquire();
            System.out.println(Thread.currentThread().getName() + ": leyendo");
            Thread.sleep((long) (Math.random() * 50));
            semaforo.release();
            System.out.println(Thread.currentThread().getName() + ": ya he leido");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
