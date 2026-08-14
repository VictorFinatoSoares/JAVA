package aula06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int c;

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
                break;
            } catch (InputMismatchException e) {
                System.out.println("ERRO: Entrada INVÁLIDA!\n");
                sc.nextLine();
                continue;
            }
        }

        while (true) {
            try {
                System.out.print("Digite o terceiro número: ");
                c = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("ERRO: Entrada INVÁLIDA!\n");
                sc.nextLine();
                continue;
            }
        }

        if (a < b && a < c) System.out.printf("O menor é: %d", a);
        else if (b < a && b < c) System.out.printf("O menor é: %d", b);
        else if (c < a && c < b) System.out.printf("O menor é: %d", c);
        else System.out.printf("Todos os números são iguais, o menor é %d.", a);
        sc.close();
    }
}
