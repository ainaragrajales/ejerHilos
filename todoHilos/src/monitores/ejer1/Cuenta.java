package monitores.ejer1;

public class Cuenta {
    private static int dato;

    public Cuenta(int Vinicio) {
        dato = Vinicio;
    }

    public synchronized void incrementar(String nombre) {
        while (dato >= 250) {
            System.out.println(nombre + " bloqueado");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        dato = dato + 10;
        System.out.println("Ahorrando++++++ por " + nombre);
        System.out.println("Hay en la cuenta " + info() + " €");
        notifyAll();
    }

    public synchronized void disminuir(String nombre) {
        while (dato == 0) {
            System.out.println(nombre + " bloqueado");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        dato = dato - 10;
        System.out.println("Gastando------ por " + nombre);
        System.out.println("Hay en la cuenta " + info() + " €");
        notifyAll();
    }

    public synchronized int info() {
        return dato;
    }
}
