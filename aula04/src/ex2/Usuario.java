package ex2;

public class Usuario {
    String nome ;
    NivelAcesso nivel ;

    Usuario(String nome , NivelAcesso nivel){
        this.nome = nome ;
        this.nivel = nivel ;
    }

    public String toString() {
        return "Nome : " + nome + "\nnivel = " + nivel ;
    }
}
