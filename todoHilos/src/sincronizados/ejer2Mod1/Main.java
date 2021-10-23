package sincronizados.ejer2Mod1;

public class Main {

    public static void main(String[] args) {

        RecursoJardin jardin = new RecursoJardin();

        for (int i = 0; i < 10; i++) {
            // esta es otra manera de inicializar las variables cuando hay más de una y se controla con el for
            (new EntradaJardin("Entrada " + i, jardin)).start();
        }

        for (int i = 0; i < 15; i++) {
            (new SalidaJardin("Salida " + i, jardin)).start();
        }
    }

}
