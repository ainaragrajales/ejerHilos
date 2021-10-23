package hilos.ejer3Tema2;

public class Hilo extends Thread{

    @Override
    public void run() {
        for (int i = 1; i <=5; i++){
            // cuando es implements Runnable en vez de this.getName(), hay que usar Thread.currentThread().getName()
            System.out.println("Hilo de nombre " + this.getName() + " contador: " + i);
        }
    }

}
