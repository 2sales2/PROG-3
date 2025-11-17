package Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n ;
        double result ;

        System.out.println("Digite um numero :");
        n = scanner.nextInt();
        try {
          result = Teste.calculaRaiz((int) n);
          System.out.println("A raiz quadrada de "+n+" eh "+result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
