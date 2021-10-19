package monitores.ejer3;

public class Persona extends Thread{
    Sala s;
    boolean n;

    public Persona(Sala s, boolean jubilado){
        this.s=s;
        this.n=jubilado;

    }

    @Override
    public void run() {
        if (n) {

            s.entrarSala();

            try {
                this.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("una persona sale de la sala");
            s.salirSala();
        }
        else {
            Thread.currentThread().setPriority(10);
            s.entrarSalaJubilado();

            try {
                this.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("una persona sale de la sala");
            s.salirSalaJubilado();

        }

    }
}
