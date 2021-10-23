package semaforos.ejemplo;

public class Gastador extends Thread{

    int numveces;
    Cuenta cuenta;

    public Gastador(Cuenta cuenta, int i) {
        numveces = i;
        this.cuenta = cuenta;
    }
    @Override
    public void run()
    {
        for (int i = 0; i < numveces; i++){
            //Si cada vez que sacamos dinero sacamos de 1 en 1 unidad, y hemos definido que
            //vamos a sacar dinero 10 veces, sacaremos un total de 10 unidades.
            //Pero como hemos creado 100 hilos, en total serĂ¡n 1000 unidades las que saquemos.
            cuenta.sacar(1);

        }
    }

}
