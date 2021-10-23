package sincronizados.ejer2Mod2;

public class Main {

    public static void main(String[] args) {
        HiloJardin h1 = new HiloJardin("1", 1);
        HiloJardin h2 = new HiloJardin("2", 1);
        HiloJardin h3 = new HiloJardin("3", 2);
        HiloJardin h4 = new HiloJardin("4", 1);

        h1.start();
        h2.start();
        h3.start();
        h4.start();
    }

}
