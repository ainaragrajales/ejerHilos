package hilos.ejer6Tema2;

public class Main {

    public static void main(String[] args) {

        Hilo h1, h2, h3, h4, h5, h6;

        h1 = new Hilo("hola soy Hilo 1", 100);
        h2 = new Hilo("hola soy Hilo 2", 50);
        h3 = new Hilo("hola soy Hilo 3", 324);
        h4 = new Hilo("hola soy Hilo 4", 215);
        h5 = new Hilo("hola soy Hilo 5", 1000);
        h6 = new Hilo("hola soy Hilo 6", 798);

        h1.start();
        h2.start();
        h3.start();
        h4.start();
        h5.start();
        h6.start();

    }

}
