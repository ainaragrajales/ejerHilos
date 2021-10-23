package sincronizados.ejer2Mod1;

public class SalidaJardin extends Thread{

    //hilos que hacen la acción de salir

    private RecursoJardin jardin;

    public SalidaJardin(String nombre, RecursoJardin jardin) {
        this.setName(nombre);
        this.jardin = jardin;
    }

    @Override
    public void run() {
        //llama al método sincronizado de salir, no se puede acceder a el hasta que no haya ningun hilo que lo utilice
        jardin.salida();
        jardin.saludo();
    }

}
