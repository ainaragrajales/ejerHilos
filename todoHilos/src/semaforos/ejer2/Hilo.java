package semaforos.ejer2;

import java.util.concurrent.Semaphore;

public class Hilo extends Thread{

    private Semaphore semaforo;

    public int tipo;
    public int veces = 10;

    public Hilo(String nombre, int tipo, Semaphore semaforo) {
        this.setName(nombre);
        this.tipo = tipo;
        this.semaforo = semaforo;
    }

    @Override
    public void run() {

        switch (tipo) {
            case 1:
                sacarJuguetes();
                break;
            case 2:
                meterJuguetes();
                break;
        }

    }

    public void sacarJuguetes() {
        System.out.println(Thread.currentThread().getName() + ": intentando sacar juguete");
        try {
            semaforo.acquire();
            System.out.println(Thread.currentThread().getName() + ": sacando juguete");
            Thread.sleep((long) (Math.random() * 50));
            semaforo.release();
            System.out.println(Thread.currentThread().getName() + ": ya ha sacado el juguete");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void meterJuguetes() {
        try {
            semaforo.acquire(10);
            System.out.println(Thread.currentThread().getName() + ": metiendo juguetes");
            Thread.sleep((long) (Math.random() * 50));
            semaforo.release(10);
            System.out.println(Thread.currentThread().getName() + ": ya ha metido los juguetes");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
