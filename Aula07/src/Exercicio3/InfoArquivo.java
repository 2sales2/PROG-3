package Exercicio3;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class InfoArquivo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o caminho do arquivo ou diretório: ");
        String caminho = sc.nextLine();

        File f = new File(caminho);

        if (!f.exists()) {
            System.out.println("O arquivo/diretório não existe.");
            sc.close();
            return;
        }

        System.out.println("Existe: SIM");

        if (f.isFile()) {
            System.out.println("Tipo: Arquivo");
            System.out.println("Tamanho (bytes): " + f.length());
        } else if (f.isDirectory()) {
            System.out.println("Tipo: Diretório");
            System.out.println("Conteúdo do diretório:");

            String[] arquivos = f.list();
            if (arquivos != null) {
                Arrays.stream(arquivos).forEach(System.out::println);
            }
        }

        System.out.println("Caminho absoluto: " + f.getAbsolutePath());

        sc.close();
    }
}

