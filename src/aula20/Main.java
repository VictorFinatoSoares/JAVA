package com.finatodev;

import java.util.Scanner;

public class Main {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       ex01();
       sc.close();

    }

    public static void ex01() {
        System.out.print("Informe N: ");
        int n = sc.nextInt();

        int[] meuArray = new int[n];

        for (int i = 0; i < meuArray.length; i++) {
            System.out.printf("Informe o número [%d]: ", i + 1);
            meuArray[i] = sc.nextInt();
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
        int n = sc.nextInt();

        int[] meuArray = new int[n];

        for (int i = 0; i < meuArray.length; i++) {
            System.out.printf("Informe o número [%d]: ", i + 1);
            meuArray[i] = sc.nextInt();
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
