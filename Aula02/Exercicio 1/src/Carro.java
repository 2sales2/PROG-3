public class Carro {
    private String marca ;
    private String modelo ;
    private int ano ;

    Carro(){}
    Carro(String novaMarca , String novoModelo , int novoAno){
        this.marca = novaMarca ;
        this.modelo = novoModelo ;
        if(novoAno > 0 ){
            this.ano = novoAno ;
        }
    }

    public void exibirInfo(){
        System.out.println("Marca : " + this.marca + "\n" +
                            "Modelo : " + this.modelo + "\n" +
                            "Ano : " + this.ano );
    }
}
