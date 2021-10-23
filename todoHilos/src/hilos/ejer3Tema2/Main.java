package hilos.ejer3Tema2;

public class Main {

    public static void main(String[] args) {
        System.out.println("Empieza la aplicación!");
        Hilo h1 = new Hilo();
        Hilo h2 = new Hilo();
        Hilo h3 = new Hilo();

        h1.setName("prueba");
        h2.setName("campeon");
        h3.setName("java");

        h1.start();
        h2.start();
        h3.start();

        // con los join en los hilos se consigue que no termine el main hasta que se ejecuten los 3 hilos completamente y luego el main continua
        try {
            h1.join();
            h2.join();
            h2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Termina la aplicación!");



    }

}
