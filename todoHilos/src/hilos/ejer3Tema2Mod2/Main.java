package hilos.ejer3Tema2Mod2;

public class Main {

    public static void main(String[] args) {
        //cuandos los hilos son de la misma clase, se pueden implementar con un array
        System.out.println("Creando el vector");
        HiloVector[] vec = new HiloVector[3];
        System.out.println("Lanzamos los hilos");
        for (int i = 0; i < vec.length; i++){
            vec[i] = new HiloVector(i);
            vec[i].start();
        }

        for (int j = 0; j < vec.length; j++) {
            try {
                vec[j].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Fin de la aplicación");
    }

}
