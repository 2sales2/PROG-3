package Exercicio2;

import java.lang.IllegalArgumentException ;
import  java.lang.Math ;
public class Teste {
    public static double calculaRaiz(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("Nao e possivel calcular a raiz de um numero negativo !!");
        }
        double result =  Math.sqrt(n);
        return result ;

    }
}
