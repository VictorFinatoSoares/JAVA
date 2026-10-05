package aula28;

import java.util.Scanner;

public class Ex10 {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = lerInteiro("Informe o N: ");
        int[][] matriz = new int[n][n];

            for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = lerInteiro(String.format("Preencha a posição [%d][%d]: ", i + 1, j + 1));
            }
        }

        System.out.println("Seu array ficou assim:");
        exibir(matriz);

        System.out.printf("Soma da diagonal principal: %d\n", somaDiagonalPrincipal(matriz));
        System.out.printf("Soma da diagonal secundária: %d\n", somaDiagonalSecundaria(matriz));

        if (somaDiagonalPrincipal(matriz) > somaDiagonalSecundaria(matriz)) {
            System.out.println("A soma da diagonal PRINCIPAL é maior!");
        } else if (somaDiagonalSecundaria(matriz) > somaDiagonalPrincipal(matriz)) {
            System.out.println("A soma da diagonal SECUNDÁRIA é maior!");
        } else {
            System.out.println("As duas somas são iguais!");
        }
    }

    public static int somaDiagonalPrincipal(int[][] matriz) {
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][i];
        }

        return soma;
    }

    public static int somaDiagonalSecundaria(int[][] matriz) {
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][matriz.length - 1 - i];
        }

        return soma;
    }

    public static void exibir(int[][] matriz) {
        for (int[] linhas : matriz) {
            for (int num : linhas) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static int lerInteiro(String msg) {
        int num;

        while (true) {
            try {
                System.out.printf(msg);
                num = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("ERRO: Você precisa informar um número INTEIRO!");
            }
        }
        return num;
    }
}
