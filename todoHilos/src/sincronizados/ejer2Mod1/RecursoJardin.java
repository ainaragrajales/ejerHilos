package sincronizados.ejer2Mod1;

public class RecursoJardin {

    //con esta clase se simulan las entradas y salidas del jardin

    //variable para contar el total de visitantes que están en el parque
    private int cuenta;
    public RecursoJardin(){
        cuenta = 20;
    }// se inicializa con 20 visitantes

    //método para incrementar cuenta, significando que aumenta en uno los visitantes
    public synchronized void entrada(){
        System.out.println("hilo " + Thread.currentThread().getName() + " ----- Entra en Jardin");
        cuenta++;
        System.out.println(cuenta + " en Jardin");
    }

    //método para disminuir cuenta, significando que disminuye en uno los visitantes
    public synchronized void salida(){
        System.out.println("hilo " + Thread.currentThread().getName() + " ----- Sale de Jardin");
        cuenta--;
        System.out.println(cuenta + " en Jardin");
    }
    public void saludo(){
        System.out.println("hola");
    }

}
