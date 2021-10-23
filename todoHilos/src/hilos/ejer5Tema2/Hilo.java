package hilos.ejer5Tema2;

public class Hilo extends Thread{

    //Atributos
    private int tipo;

    //Constructor
    public Hilo(int tipo){
        this.tipo = tipo;
    }

    @Override
    public void run() {
        while (true) {
            switch (tipo){
                case 1:
                    System.out.print("PING ");
                    try {
                        this.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    System.out.print("pong ");
                    try {
                        this.sleep(301);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }
    }

}
