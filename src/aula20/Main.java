package com.finatodev;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       ex02();
       sc.close();

    }

    public static void ex01() {
        System.out.print("Informe N: ");

        int n = 0;

        try {
            n = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida");
        }
        int[] meuArray = new int[n];

        for (int i = 0; i < meuArray.length; i++) {
            System.out.printf("Informe o número [%d]: ", i + 1);
            try {
                meuArray[i] = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida");
            }
        }

        System.out.print("Informe o valor que quer procurar: ");
        int valor = sc.nextInt();

        int quantidade = 0;
        for (int i = 0; i < meuArray.length; i++) {
            if (meuArray[i] == valor) {
                System.out.printf("Número %d encontrado na posição %d%n", valor, i);
                quantidade++;
            }
        }

        if (quantidade == 0) System.out.println("Valor não encontrado!");
    }

    public static void ex02() {
        System.out.print("Informe N: ");

        int n = 0;
        try {
            n = sc.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("Entrada inválida");
            return;
        }
        int[] meuArray = new int[n];

        for (int i = 0; i < meuArray.length; i++) {
            System.out.printf("Informe o número [%d]: ", i + 1);
            try {
                meuArray[i] = sc.nextInt();
            } catch(InputMismatchException e) {
                System.out.println("Entrada inválida");
                return;
            }
        }


        boolean arrayCrescente = true;

        for (int i = 1; i < meuArray.length; i++) {
            if (meuArray[i] < meuArray[i - 1]) {
                System.out.printf("O array NÃO está em ordem crescente!%nValor quebrado na posição %d (%d é menor que o anterior, %d)", i, meuArray[i], meuArray[i - 1]);
                arrayCrescente = false;
            }
        }

        if (arrayCrescente) {
            int diferenca = meuArray[meuArray.length - 1] - meuArray[0];
            System.out.printf("O array está em ordem crescente!%nDiferença entre o maior e menor: %d", diferenca);
        }
    }
}
