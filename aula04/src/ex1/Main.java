package ex1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca(100.00 , "Pedro" , "999999999");
        ContaCorrente contaCorrente = new ContaCorrente(200.00 , "Taina" , "6666666666");

        System.out.println("Saldo atual conta pupanca de " + contaPoupanca.getNome() + " eh "+contaPoupanca.getSaldo());
        contaPoupanca.depositar(100);
        System.out.println("Saldo atual conta pupanca de " + contaPoupanca.getNome() + " eh "+contaPoupanca.getSaldo());
        contaPoupanca.sacar(50.00) ;
        System.out.println("Saldo atual conta pupanca de " + contaPoupanca.getNome() + " eh "+contaPoupanca.getSaldo());

        System.out.println("Saldo atual conta corrente de " + contaCorrente.getNome() + " eh "+contaCorrente.getSaldo());
        contaCorrente.depositar(500);
        System.out.println("Saldo atual conta corrente de " + contaCorrente.getNome() + " eh "+contaCorrente.getSaldo());
        contaCorrente.sacar(100.00) ;
        System.out.println("Saldo atual conta corrente de " + contaCorrente.getNome() + " eh "+contaCorrente.getSaldo());


    }
}