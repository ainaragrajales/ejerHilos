package monitores.ejer3;

import java.util.Random;

public class Sala {

    private final int tUmbral=30;
    private final int nMaxPersonasNormalT=50;
    private final int nMaxPersonasAltaT=35;

    public int nPersonas;
    public int nMaxPersonas=nMaxPersonasNormalT;
    public int nJubilados=0;

    public synchronized void entrarSalaJubilado(){
        System.out.println("Entra en la sala un jubilado");
        nJubilados++;

        while (nPersonas>=nMaxPersonas) {
            try {
                System.out.println(" esperando a entrar un jubilado");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        nPersonas++;
        System.out.println(nPersonas);


    }

    public synchronized void entrarSala(){
        System.out.println("Entra una persona en la sala hay "+nPersonas);
        notificarTemp();
        while(nPersonas>= nMaxPersonas ) {

            System.out.println("esperando a entrar, no se puede acceder a la sala porque hay " + nPersonas+"personas");
            try {
                wait();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        nPersonas++;
        System.out.println("ya he entrado");

        System.out.println("personas dentro"+nPersonas);

    }



    public synchronized void salirSala(){

        nPersonas--;
        notifyAll();
        System.out.println("salen de la sala");
        System.out.println(nPersonas);
    }

    public synchronized void salirSalaJubilado(){
        nPersonas--;
        nJubilados--;
        notifyAll();
        System.out.println("salen de la sala");
    }



    public  void notificarTemp(){
        int t;
        Random r = new Random();
        t=r.nextInt(50);


        System.out.println("la temperatura es de"+t);
        if(t>tUmbral)
            nMaxPersonas=nMaxPersonasAltaT;
        if(t<tUmbral)
            nMaxPersonas=nMaxPersonasNormalT;



    }
}
