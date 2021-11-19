package semaforos.ejer3;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {

        final int CAPACIDADMANGAS = 20;
        final int CAPACIDADCUERPOS = 8;
        Semaphore cestaMangasCapacidad, cestaMangasCantidad;
        Semaphore cestaCuerposCapacidad, cestaCuerposCantidad;
        FabricanteMangas fabMangas;
        FabricanteCuerpos fabCuerpos;
        MontadorJerseys montJerseys;

        cestaMangasCapacidad = new Semaphore(CAPACIDADMANGAS);
        cestaMangasCantidad = new Semaphore(0);
        cestaCuerposCapacidad= new Semaphore(CAPACIDADCUERPOS);
        cestaCuerposCantidad = new Semaphore(0);
        fabMangas = new FabricanteMangas(cestaMangasCapacidad, cestaMangasCantidad);
        fabCuerpos = new FabricanteCuerpos(cestaCuerposCapacidad, cestaCuerposCantidad);
        montJerseys = new MontadorJerseys(cestaMangasCantidad, cestaCuerposCantidad, cestaMangasCapacidad, cestaCuerposCapacidad);

        fabCuerpos.start();
        fabMangas.start();
        montJerseys.start();

    }

}
