package aula06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EX06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor;

        while (true) {
            try {
                System.out.print("Digite o valor: ");
                valor = sc.nextDouble();

                if (valor <= 0) {
                    System.out.println("ERRO: O valor precisa ser maior que 0!");
                    continue;
                }

                break;
            } catch (InputMismatchException e) {
                System.out.println("ERRO: Entrada INVÁLIDA!");
                sc.nextLine();
                continue;
            }
        }

        int taxa;

        if (valor < 100) taxa = 10;
        else if (valor < 300) taxa = 20;
        else if (valor < 1000) taxa = 50;
        else taxa = 0;

        if (taxa > 0 ) System.out.printf("Taxa: %d%%\nNovo valor: R$%.2f\n", taxa, valor * (1 + (double) taxa / 100));
        else System.out.println("Valor >= 1000, sem taxa definida!");

        sc.close();
    }
}
