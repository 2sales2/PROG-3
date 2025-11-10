package ex2;

public class Main {
    public static void main(String[] args){
        Usuario u1 = new Usuario("Pedro" , NivelAcesso.BASICO);
        Usuario u2 = new Usuario("dudu" , NivelAcesso.INTERMEDIARIO);
        Usuario u3 = new Usuario("Vinicius" , NivelAcesso.ADMIN);

        System.out.println(u1.toString() + "\n\n" + u2.toString() + "\n\n" + u3.toString());

    }

}
