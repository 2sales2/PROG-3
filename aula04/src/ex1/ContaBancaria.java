package ex1;

public abstract class ContaBancaria {
    protected double saldo ;
    protected String nome ;
    protected String cpf ;

    ContaBancaria(double newSaldo , String newNome , String newCpf){
        this.saldo = newSaldo ;
        this.nome = newNome ;
        this.cpf = newCpf ;
    }
    public abstract boolean sacar(double valor);
    public abstract void depositar(double valor);

    public double getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome ;
    }
}
