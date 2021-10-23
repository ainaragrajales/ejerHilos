package hilos.ejer7Tema1;

public class HiloRunnable implements Runnable{
    //Se utiliza Runnable cuando la clase ya hereda de otra clase

    //Atributos
    private int tipo;

    //Constructor
    public HiloRunnable(int tipo){
        this.tipo = tipo;
    }

    @Override
    public void run() {

        while (true){
            switch (tipo){
                case 1:
                    //numeros
                    for (int j = 1; j <= 20; j++){
                        System.out.println(j);
                    }
                    break;
                case 2:
                    char c;
                    for (c = 'a'; c <= 'z'; ++c){
                        System.out.println(c);
                    }
                    break;
            }
        }

    }
}
