package monitores.ejer2;

import java.util.Random;

public class Almacen {

    public static int dato;
    Random r = new Random();
    int num, num2;


    public Almacen(int Vinicio) {
        dato = Vinicio;
    }

    public synchronized void generar(){

        num = r.nextInt(10);
        while (dato > 0){
            System.out.println("Productor bloqueado");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        dato = dato + num;
        System.out.println("Productor ha producido " + num);
        System.out.println("Queda "+ dato);
        notifyAll();
    }

    public synchronized void consumir(){
        num2 = r.nextInt(10);
        while (dato < num2 ){
            System.out.println("Consumidor bloqueado");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        dato = dato -num2;
        System.out.println("Consumidor ha consumido " + num2);
        System.out.println("Queda "+ dato);
        notifyAll();
    }

}
