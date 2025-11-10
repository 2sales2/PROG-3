package ex3;

public class Triatleta implements Ciclista , Corredor , Nadador {
   @Override
   public void nadar(){
       System.out.println("Estou nadando !");
   }

    @Override
    public void correr() {
        System.out.println("Estou correndo!");
    }

    @Override
    public void pedalar() {
        System.out.println("Estou pedalando!");
    }
}
