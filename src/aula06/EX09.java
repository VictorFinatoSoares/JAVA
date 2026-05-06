package aula06;

import java.util.Scanner;

public class EX09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota do Grau A: ");
        double ga = sc.nextDouble();
        System.out.print("Nota do Grau B: ");
        double gb = sc.nextDouble();

        if (ga < 0 || gb < 0) {
            System.out.println("Erro: notas não podem ser negativas.");
        } else {
            double media = ga * 0.3 + gb * 0.7;
            System.out.printf("Média: %.1f%n", media);
            if (media < 6.0) {
                System.out.println("É necessário realizar o Grau C.");
            } else {
                System.out.println("Grau C não necessário. Aprovado!");
            }
        }

        sc.close();
    }
}
