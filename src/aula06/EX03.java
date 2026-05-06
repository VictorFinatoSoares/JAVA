package aula06;

import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite A: ");
        int a = sc.nextInt();
        System.out.print("Digite B: ");
        int b = sc.nextInt();

        if (b == 0) {
            System.out.println("Erro: divisão por zero!");
        } else {
            double resultado = (double) a / b;
            System.out.printf("%.2f / %d = %.2f%n", (double) a, b, resultado);
        }

        sc.close();
    }
}
