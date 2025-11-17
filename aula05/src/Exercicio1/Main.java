package Exercicio1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a , b , result;

        System.out.println("Enter a number : ");
        a = scanner.nextInt();
        System.out.println("Enter a other number : ");
        b = scanner.nextInt();
        scanner.close();

        To_divide.to_divide(a,b);

    }
}