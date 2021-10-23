package semaforos.ejemplo;

public class Main {
    static final int SALDOINICIAL= 10;
    static final int NUMVECES = 4;
    public static final int NUMHILOS = 10;

    public static void main(String[] args) {

        Cuenta cuenta;
        Ahorrador ahorradores[] = new Ahorrador [NUMHILOS];
        Gastador gastadores[] = new Gastador[NUMHILOS];
        cuenta = new Cuenta (SALDOINICIAL);

        for (int i = 0; i< NUMHILOS; i++)
        {
            ahorradores[i]= new Ahorrador(cuenta,NUMVECES);
            gastadores [i]= new Gastador (cuenta,NUMVECES);
        }
        for (int i = 0; i< NUMHILOS; i++)
        {
            ahorradores[i].start();
            gastadores [i].start();
        }
        for (int i = 0; i< NUMHILOS; i++)
        {
            try {
                //espera a que los hilos se mueran.
                ahorradores[i].join();
                gastadores[i].join();
            } catch (InterruptedException e) {e.printStackTrace();}
        }
        System.out.println (cuenta.getSaldo());

    }

}
