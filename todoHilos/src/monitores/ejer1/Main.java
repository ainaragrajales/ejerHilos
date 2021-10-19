package monitores.ejer1;

public class Main {

    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta(0);
        for (int i = 0; i < 5; i++) {

            (new Ahorrador(("Ahorrador" + i), cuenta)).start();
            (new Gastador(("Gastador" + i), cuenta)).start();

        }

    }
}
