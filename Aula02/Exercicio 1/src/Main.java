//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carro corrola = new Carro("Toyota", "Corrola", 2025);
        Carro etios = new Carro("Toyota" , "Etios" , 2015);

        corrola.exibirInfo();
        etios.exibirInfo();
    }
}