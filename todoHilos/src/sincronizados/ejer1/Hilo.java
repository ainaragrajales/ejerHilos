package sincronizados.ejer1;

public class Hilo extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            Contador.adding();

        }
    }

}
