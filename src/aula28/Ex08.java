package aula28;

import java.util.Scanner;

public class Ex08 {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int qLinhas = lerInteiro("Informe a quantidade de linhas: ");
        int qColunas = lerInteiro("Informe a quantidade de colunas: ");

        int[][] minhaMatriz = new int[qLinhas][qColunas];

        for (int i = 0; i < qLinhas; i++) {
            for (int j = 0; j < qColunas; j++) {
                minhaMatriz[i][j] = lerInteiro(String.format("Preencha a posição [%d][%d]: ", i + 1, j + 1));
            }
        }

        exibirMatriz(minhaMatriz);
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

    public static void exibirMatriz(int[][] matriz) {
        System.out.println("====== MATRIZ EM TABELA ======\n");

        for (int[] linha: matriz) {
            for (int num : linha) {
                System.out.printf("[ %d ] ", num);
            }
            System.out.println();
        }
    }
}
