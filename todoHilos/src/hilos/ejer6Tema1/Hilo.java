package hilos.ejer6Tema1;

public class Hilo extends Thread{

    @Override
    public void run() {
        System.out.println("Empieza el programa " + this.getName());
        for (int i = 0; i < 16; i++){
            System.out.println(i + " " +this.getName());
            //con getState() puede devolver: new, runnable, no runnable, terminated
            System.out.println(Thread.currentThread().getState());
        }
        System.out.println("Termina el programa " + this.getName());
    }
}
