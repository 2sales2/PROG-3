package Exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int teste_int ;
        String teste_string ;

        System.out.println("Digite um numero inteiro");
        teste_string = scanner.nextLine();

        try {
            //testando operacao
            teste_int = Integer.parseInt(teste_string);
            System.out.println("Casting feito com sucesso!!");
        }
        catch(NumberFormatException numberFormatException){
            System.out.println("Formato invalido para casting!!");
        }
        finally {
            System.out.println("Encerrando o programa ...");
        }
    }

}
