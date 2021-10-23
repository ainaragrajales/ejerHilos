package hilos.ejer3Tema2Mod2;

public class HiloVector extends Thread{

    //atributos
    private int id;
    private String nombre;

    //constructor
    public HiloVector(int id){
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 1; i <=5; i++){
            // cuando es implements Runnable en vez de this.getName(), hay que usar Thread.currentThread().getName()
            System.out.println("Hilo de nombre " + this.getName() + " contador: " + i);
        }
    }

}
