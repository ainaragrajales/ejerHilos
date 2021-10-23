package semaforos.ejer2Mod2;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Caja total = new Caja(3);
        Semaphore mutex = new Semaphore(1);
        Semaphore profe = new Semaphore(1); //con esto nos aseguramos que no se pueda lanzar el hilo profesor
        profe.acquire();

        Kid n1 = new Kid(profe, mutex, total);
        Kid n2 = new Kid(profe, mutex, total);
        Kid n3 = new Kid(profe, mutex, total);
        Kid n4 = new Kid(profe, mutex, total);
        Kid n5 = new Kid(profe, mutex, total);
        Kid n6 = new Kid(profe, mutex, total);
        Kid n7 = new Kid(profe, mutex, total);
        Kid n8 = new Kid(profe, mutex, total);

        Teacher t1 = new Teacher(profe, mutex, total);

        t1.start();
        n1.start();
        n2.start();
        n3.start();
        n4.start();
        n5.start();
        n6.start();
        n7.start();
        n8.start();

    }

}
