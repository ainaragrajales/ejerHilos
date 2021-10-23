package hilos.ejer7Tema1;

public class Main {

    public static void main(String[] args) {
        HiloRunnable hr1 = new HiloRunnable(1);
        HiloRunnable hr2 = new HiloRunnable(2);

        Thread t1 = new Thread(hr1);
        Thread t2 = new Thread(hr2);

        t1.start();
        t2.start();
    }
}
