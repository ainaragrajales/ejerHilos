package semaforos.ejer1;

import java.util.concurrent.Semaphore;

public class Escritor extends Thread{

    private Semaphore semaforo;

    public Escritor(String nombre, Semaphore semaforo){
        this.setName(nombre);
        this.semaforo = semaforo;
    }

    @Override
    public void run() {

        write();
    }

    public void write(){
        System.out.println(Thread.currentThread().getName() + ": intentando escribir");
        try {
            semaforo.acquire(5);
            System.out.println(Thread.currentThread().getName() + ": escribiendo");
            Thread.sleep((long) (Math.random() * 50));
            semaforo.release(5);
            System.out.println(Thread.currentThread().getName() + ": ya he escrito");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
