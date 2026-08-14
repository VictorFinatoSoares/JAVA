package aula06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EX02 {
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
                System.out.println("ERRO: Entrada INVÁLIDA!");
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
                System.out.println("ERRO: Entrada INVÁLIDA!");
                sc.nextLine();
                continue;
            }
        }

        if (a > b) System.out.printf("O maior é: %d%n", a);
        else if (a < b) System.out.printf("O maior é: %d%n", b);
        else System.out.println("Os dois valores são iguais!");;

        sc.close();
    }
}
