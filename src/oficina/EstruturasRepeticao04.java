package com.finatodev;

import java.util.Scanner;

public class EstruturasRepeticao04 {
    public static void main(String[] args) {
        ex03();

    }

    public static void ex01() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        int i = 1;
        int div = 0;

        while (i <= num) {

            if (num % i == 0) {
                System.out.printf("%d é divisível por: %d%n", num, i);
                div++;
            }

            i++;

        }

        System.out.printf("Total de divisores: %d%n", div);

        if (div == 2) {
            System.out.printf("%d é primo!", num);
        } else {
            System.out.printf("%d não é primo!", num);
        }


        sc.close();

    }

    public static void ex02() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");

        while (sc.hasNext()) {
            int num = sc.nextInt();
            int i = 1;
            int div = 0;

            while(i <= num) {
                if (num % i == 0) {
                    System.out.printf("%d é divisível por: %d%n", num, i);
                    div++;
                }

                i++;
            }


            System.out.printf("Total de divisores: %d%n", div);

            if (div == 2) {
                System.out.printf("%d é PRIMO! Encerrando...", num);
                break;
            }

            else {
                System.out.printf("%d não é PRIMO! Reiniciando...%n", num);
                System.out.print("Digite um número: ");

            }

        }

        sc.close();
    }

    public static void ex03() {
        Scanner sc = new Scanner(System.in);

        double conta = 0;

        while(true) {
            System.out.print("Opções:\n");
            System.out.print("\n[1] Adicionar Lanche (R$ 7,50)\n[2] Adicionar Refri (R$ 4,00)\n[3] Checar conta\n[4] Sair\n");

            System.out.print("\nEscolher: ");
            int escolha = sc.nextInt();

            if (escolha == 1) {
                conta += 7.5;
                System.out.println("Lanche adicionado no valor da conta!\n");

            }

            else if (escolha == 2) {
                conta += 4;
                System.out.println("Refri adicionado no valor da conta!\n");

            }

            else if (escolha == 3) {
                System.out.printf("Valor da conta: R$ %.2f%n", conta);

            }

            else if (escolha == 4) {
                System.out.println("Saindo...");
                break;

            }
        }


    }


}
