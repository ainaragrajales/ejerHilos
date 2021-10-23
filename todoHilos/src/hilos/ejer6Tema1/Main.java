package hilos.ejer6Tema1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Hilo h1 = new Hilo();
        Hilo h2 = new Hilo();
        Hilo h3 = new Hilo();

        h1.start();
        h2.start();
        h1.join();
        h3.start();
        //cuando un hilo tiene el join(), el hilo declarado debajo del join no puede empezar hasta que el otro hilo termine
        //en este caso el hilo 3 no empezaría hasta que termine el hilo 1, en cambio da igual si ha terminado o no el hilo 2
    }

}
