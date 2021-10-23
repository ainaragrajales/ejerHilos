package sincronizados.ejer1;

public class Contador {

    //utilizar variable estática si no se quiere trabajar con objetos contador
    static int suma;

    //al utilizar la variable como estática, el método también se declara con static
    // con synchronized se controla que los hilos sólo accedan a la variable compartida de uno en uno
    public static synchronized void adding(){
        suma++;
        System.out.println("Para el thread " + Thread.currentThread().getName() + " la suma es: " + suma);
    }

}
