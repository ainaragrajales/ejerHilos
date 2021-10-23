package sincronizados.ejer2Mod2;

public class HiloJardin extends Thread{

    static int jardin = 20;
    public int tipo;

    public HiloJardin(String nombre, int tipo) {
        this.tipo = tipo;
        this.setName(nombre);
    }

    public synchronized void entrar(){
        System.out.println("hilo " + Thread.currentThread().getName() + " ----- Entra en Jardin");
        jardin++;
        System.out.println(jardin + " en jardin");
    }
    public synchronized void salir(){
        System.out.println("hilo " + Thread.currentThread().getName() + " ----- Sale del Jardin");
        jardin--;
        System.out.println(jardin + " en jardin");
    }
    public void saludo(){
        System.out.println("hola");
    }

    @Override
    public void run() {
        switch (tipo){
            case 1:
                entrar();
                saludo();
                break;
            case 2:
                salir();
                saludo();
                break;

        }
    }

}
