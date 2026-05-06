package aula06;

import java.util.Scanner;

public class EX06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor: ");
        double valor = sc.nextDouble();

        if (valor < 0) {
            System.out.println("Erro: valor negativo!");
        } else if (valor < 100) {
            double novo = valor * 1.10;
            System.out.printf("Taxa 10%% | Novo valor: R$ %.2f%n", novo);
        } else if (valor < 300) {
            double novo = valor * 1.20;
            System.out.printf("Taxa 20%% | Novo valor: R$ %.2f%n", novo);
        } else if (valor < 1000) {
            double novo = valor * 1.50;
            System.out.printf("Taxa 50%% | Novo valor: R$ %.2f%n", novo);
        } else {
            System.out.println("Valor >= R$1000: sem taxa definida.");
        }

        sc.close();
    }
}
