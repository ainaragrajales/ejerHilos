package monitores.ejer2;

public class Main {

    public static void main(String[] args) {

        Almacen almacen = new Almacen(15);
        Productor prod = new Productor(almacen);

        for (int i = 0; i < 10; i++) {
            (new Consumidor(almacen)).start();

        }

        prod.start();

    }

}
