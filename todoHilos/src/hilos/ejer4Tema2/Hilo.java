package hilos.ejer4Tema2;

public class Hilo extends Thread{

    //Atributos
    private int tipo;

    //Constructor
    public Hilo(int tipo){
        this.tipo = tipo;
    }

    @Override
    public void run() {


        switch (tipo){
            case 1:
                //numeros pares
                for (int j = 0; j <= 100; j++){
                    if (j % 2 == 0){
                        System.out.println(j + " " + this.getName());
                    }

                }
                break;
            case 2:
                //numeros impares
                for (int i = 0; i <= 100; i++){
                    if (i % 2 != 0){
                        System.out.println(i + " " + this.getName());
                    }

                }
                break;
        }


    }

}
