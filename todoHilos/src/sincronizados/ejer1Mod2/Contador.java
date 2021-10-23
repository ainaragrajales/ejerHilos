package sincronizados.ejer1Mod2;

public class Contador {

    int suma = 0;

    // con synchronized se controla que los hilos sólo accedan a la variable compartida de uno en uno
    public synchronized void adding(){
        suma++;
        System.out.println("Para el thread " + Thread.currentThread().getName() + " la suma es: " + suma);
    }

}
