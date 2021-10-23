package hilos.ejer4Tema2;

public class Main {

    public static void main(String[] args) {
        Hilo h1 = new Hilo(1);
        Hilo h2 = new Hilo(2);

        h1.setName("hilo 1");
        h2.setName("hilo 2");

        h1.start();
        h2.start();
        System.out.println(h1.getPriority() + " prioridad de " + h1.getName());
        System.out.println(h2.getPriority() + " prioridad de " + h2.getName());

        h1.setPriority(10);
        System.out.println(h1.getPriority() + " prioridad de " + h1.getName());
    }

}
