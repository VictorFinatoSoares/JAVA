package aula06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;

        while (true) {
            try {
                System.out.print("Digite o primeiro número: ");
                a = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("ERRO: Entrada INVÁLIDA!\n");
                sc.nextLine();
                continue;
            }
        }

        while (true) {
            try {
                System.out.print("Digite o segundo número: ");
                b = sc.nextInt();

                if (b == 0) {
                    System.out.println("ERRO: Divisão com ZERO não existe!\n");
                    sc.nextLine();
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("ERRO: Entrada INVÁLIDA!\n");
                sc.nextLine();
                continue;
            }
        }

        double resultado = (double) a / b;
        System.out.printf("\n%d dividido por %d = %.2f%n", a, b, resultado);

        sc.close();
    }
}
