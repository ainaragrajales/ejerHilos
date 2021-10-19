package monitores.ejer1;

public class Ahorrador extends Thread{

    private Cuenta cuenta;

    public Ahorrador(String nombre, Cuenta cuenta) {
        this.setName(nombre);
        this.cuenta = cuenta;
    }

    @Override
    public void run() {

            cuenta.incrementar(Thread.currentThread().getName());
            try {
                sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }
}
