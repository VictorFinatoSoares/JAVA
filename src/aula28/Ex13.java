package aula28;

import java.util.Scanner;

public class Ex13 {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int qLinhas = lerInteiro("Informe a quantidade de linhas: ");
        int qColunas = lerInteiro("Informe a quantidade de colunas: ");

        int[][] matrizA = new int[qLinhas][qColunas];
        int[][] matrizB = new int[qLinhas][qColunas];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = lerInteiro(String.format("(ARRAY A) Preencha a posição [%d][%d]: ", i + 1, j + 1));
            }
        }

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizB[i][j] = lerInteiro(String.format("(ARRAY B) Preencha a posição [%d][%d]: ", i + 1, j + 1));
            }
        }

        int[][] matrizC = somarMatrizes(matrizA, matrizB);

        exibir(matrizA);
        exibir(matrizB);
        exibir(matrizC);
    }

    public static int[][] somarMatrizes(int[][] matrizA, int[][] matrizB) {
        int[][] matrizC = new int[matrizA.length][matrizA[0].length];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        return matrizC;
    }

    public static void exibir(int[][] matriz) {
        for (int[] linhas : matriz) {
            for (int num : linhas) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();
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
