package ex1;

public class ContaCorrente extends ContaBancaria {
    private final double taxaSaque = 1.0 ;
    ContaCorrente(double saldo , String nome , String cpf){
        super(saldo , nome , cpf);
    }
    @Override
    public boolean sacar(double valor){
        if(this.saldo > 0.0 ){
            this.saldo -= valor - taxaSaque ;
            return  true ;
        }
        else {
            return false ;
        }
    }

    @Override
    public void depositar(double valor){
        if(valor >= 0.0){
            this.saldo += valor ;
        }
        else {
            System.out.println("Valor Invalido!");
        }
    }
}
