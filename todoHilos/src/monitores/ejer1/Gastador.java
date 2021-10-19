package monitores.ejer1;

public class Gastador extends Thread{

    private Cuenta cuenta;

    public Gastador(String nombre, Cuenta cuenta) {
        this.setName(nombre);
        this.cuenta = cuenta;
    }

    @Override
    public void run() {

            cuenta.disminuir(Thread.currentThread().getName());
            try {
                sleep(450);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }
}
