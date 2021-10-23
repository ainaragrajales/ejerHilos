package semaforos.ejemplo;

import java.util.concurrent.Semaphore;

public class Cuenta {

    int saldo;
    Semaphore candado;

    public Cuenta (int cantidad)
    {
        saldo = cantidad;
        candado = new Semaphore (1);
    }
    public void meter (int cantidad)
    {
        try {
            candado.acquire(1);
        } catch (InterruptedException e) {}

        saldo = saldo +cantidad;
        candado.release();
    }
    public void sacar (int cantidad )
    {
        try {
            candado.acquire();
        } catch (InterruptedException e) {}

        saldo = saldo - cantidad;
        candado.release();
    }
    public int getSaldo()
    {
        return saldo;
    }

}
