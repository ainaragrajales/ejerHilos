package sincronizados.ejer2Mod1;

public class EntradaJardin extends Thread{

    //hilos que hacen la acción de entrar

    private RecursoJardin jardin;

    public EntradaJardin(String nombre, RecursoJardin jardin) {
        this.setName(nombre);
        this.jardin = jardin;
    }

    @Override
    public void run() {
        //llama al método sincronizado de entrar, no se puede acceder a el hasta que no haya ningun hilo que lo utilice
        jardin.entrada();
        jardin.saludo();
    }

}
