package Exercicio1 ;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class LerArquivo {
    public static void main(String[] args) {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Digite o nome do arquivo: ");
            String nomeArquivo = teclado.readLine();

            FileInputStream fis = new FileInputStream(nomeArquivo);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            System.out.println("\nConteúdo do arquivo");
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }

            // Fechando recursos
            br.close();
            isr.close();
            fis.close();

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
