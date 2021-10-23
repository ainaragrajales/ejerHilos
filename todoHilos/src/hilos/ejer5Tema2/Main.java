package hilos.ejer5Tema2;

public class Main {

    public static void main(String[] args) {

        Hilo h1 = new Hilo(1);
        Hilo h2 = new Hilo(2);

        h1.start();
        try {
            Thread.currentThread().sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        h2.start();

    }

}
