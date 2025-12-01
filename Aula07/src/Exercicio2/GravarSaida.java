package Exercicio2;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class GravarSaida {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            PrintStream ps = new PrintStream("saida.txt");

            System.out.println("Digite linhas de texto (digite FIM para encerrar):");

            while (true) {
                String linha = sc.nextLine();

                if (linha.equals("FIM")) {
                    break;
                }

                ps.println(linha);
            }

            ps.close();
            System.out.println("Arquivo 'saida.txt' criado com sucesso.");

        } catch (IOException e) {
            System.out.println("Erro ao gravar no arquivo: " + e.getMessage());
        }

        sc.close();
    }
}

