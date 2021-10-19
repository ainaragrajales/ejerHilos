package monitores.ejer4;

public class Puente {

    private final int pesoMax = 15000;
    private final int numMax = 5;
    public int numCoches;
    public int pesoTotal;

    public Puente(int numCoches, int pesoTotal) {
        this.numCoches = numCoches;
        this.pesoTotal = pesoTotal;
    }

    public synchronized void entrarPuente(int peso) {

        while ((numCoches >= numMax) || ((pesoTotal + peso) >= pesoMax)) {
            System.out.println("¡¡¡ " + Thread.currentThread().getName() + " está bloqueado !!!");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Entra el " + Thread.currentThread().getName() + " que pesa " + peso);
        numCoches++;
        pesoTotal = pesoTotal + peso;
        System.out.println("            -> Hay " + numCoches + " coches y el peso total es de " + pesoTotal + "kg");
        notifyAll();
    }

    public synchronized void salirPuente(int peso) {
        System.out.println("Sale el coche" + Thread.currentThread().getName() + " que pesa " + peso + "kg");
        numCoches--;
        pesoTotal = pesoTotal - peso;
        System.out.println("            -> Quedan " + numCoches + " coches y el peso total es de " + pesoTotal + "kg");
        notifyAll();
    }

}
