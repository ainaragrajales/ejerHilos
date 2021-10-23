package sincronizados.ejer1;

public class Main {

    public static void main(String[] args) {

        Hilo h = new Hilo();
        Hilo h1 = new Hilo();
        Hilo h2 = new Hilo();
        Hilo h3 = new Hilo();

        h.start();
        h1.start();
        h2.start();
        h3.start();

    }

}
