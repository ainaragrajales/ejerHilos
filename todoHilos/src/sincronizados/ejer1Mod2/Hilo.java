package sincronizados.ejer1Mod2;

public class Hilo extends Thread{

    Contador c;

    public Hilo(Contador c) {
        this.c = c;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            c.adding();
        }
    }

}
