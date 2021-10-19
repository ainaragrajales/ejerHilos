package monitores.ejer4;

public class Vehiculo extends Thread{

    public String nombre;
    public int peso;
    Puente puente;

    public Vehiculo(String nombre, int peso, Puente puente) {
        setName(nombre);
        this.peso = peso;
        this.puente = puente;
    }

    @Override
    public void run() {
        puente.entrarPuente(peso);

        try {
            sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        puente.salirPuente(peso);

    }

}
