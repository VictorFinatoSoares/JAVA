package aula06;

import java.util.Scanner;

public class EX18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Saldo atual: R$ ");
        double saldo = sc.nextDouble();

        System.out.println("1 - Saque  |  2 - Depósito");
        System.out.print("Escolha: ");
        int opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.print("Valor a sacar: R$ ");
            double valor = sc.nextDouble();

            if (valor <= 0) {
                System.out.println("Valor inválido.");
            } else if (valor > saldo) {
                System.out.println("Saldo insuficiente!");
            } else {
                saldo -= valor;
                System.out.printf("Saque realizado! Saldo: R$ %.2f%n", saldo);
            }

        } else if (opcao == 2) {
            System.out.print("Valor a depositar (máx R$300): R$ ");
            double valor = sc.nextDouble();

            if (valor <= 0) {
                System.out.println("Valor inválido.");
            } else if (valor > 300) {
                System.out.println("Depósito máximo é R$300,00!");
            } else {
                saldo += valor;
                System.out.printf("Depósito realizado! Saldo: R$ %.2f%n", saldo);
            }

        } else {
            System.out.println("Opção inválida.");
        }

        sc.close();
    }
}
