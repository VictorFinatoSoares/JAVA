package aula06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EX01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        while (true) {
            try {
                System.out.print("Digite um número inteiro: ");
                n = sc.nextInt();
                break;
            }  catch (InputMismatchException e) {
                System.out.println("ERRO: Entrada INVÁLIDA!\n");
                sc.nextLine();
                continue;
            }
        }

        if (n % 2 == 0) System.out.printf("%nO número %d é PAR.", n);
        else System.out.printf("%nO número %d é ÍMPAR.", n);

        sc.close();
    }
}
