package sincronizados.ejer1Mod2;

public class Main {

    public static void main(String[] args) {

        Contador c = new Contador();

        Hilo h = new Hilo(c);
        Hilo h1 = new Hilo(c);
        Hilo h2 = new Hilo(c);
        Hilo h3 = new Hilo(c);

        h.start();
        h1.start();
        h2.start();
        h3.start();

    }

}
