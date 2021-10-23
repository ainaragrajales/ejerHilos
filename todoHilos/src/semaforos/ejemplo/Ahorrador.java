package semaforos.ejemplo;

public class Ahorrador extends Thread{

    int numveces;
    Cuenta cuenta;

    public Ahorrador(Cuenta cuenta, int i)
    {
        numveces = i;
        this.cuenta = cuenta;
    }
    @Override
    public void run()
    {
        for (int i = 0; i < numveces; i++)
        {
            //si cada vez que metemos dinero metemos 2 unidades y el for se ejecuta 10 veces,
            //tendremos 20 unidades. Como hay 100 hilos, son 2000 unidades y hay que sumar
            //las 100 unidades del saldo inicial --> 2100 unidades
            cuenta.meter(2);
            System.out.println("un ahorrador ha metido dinero, el saldo es: " + cuenta.getSaldo());
        }
    }

}
