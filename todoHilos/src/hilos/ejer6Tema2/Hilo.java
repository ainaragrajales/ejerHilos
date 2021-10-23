package hilos.ejer6Tema2;

public class Hilo extends Thread{

    //atributos
    private int retardo;
    private String saludo;

    //constructor
    public Hilo(String s, int r){
        this.saludo = s;
        this.retardo = r;
    }
    public Hilo(String s){
        this.saludo = s;
    }

    @Override
    public void run() {
        try {
            sleep(retardo);
        } catch (InterruptedException e){
            System.out.println("Se ha producido un error");
        }

        System.out.println("hola mundo " + this.saludo + " despues de haber dormido "+ this.retardo);
    }

}
