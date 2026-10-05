package aula28;

import java.util.Scanner;

public class Ex09 {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] matriz = new int[3][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = lerInteiro(String.format("Preencha a posição [%d][%d]: ", i + 1, j + 1));
            }
        }

        int linha = lerInteiro("Qual linha você deseja descobrir a soma (1-3)? ");
        int coluna = lerInteiro("Qual coluna você deseja descobrir a soma (1-4)? ");

        System.out.println("Sua matriz ficou assim:");
        exibir(matriz);

        System.out.printf("A soma da linha %d é: %d\n", linha, somarLinha(matriz, linha - 1));
        System.out.printf("A soma da coluna %d é: %d\n", coluna, somarColuna(matriz, coluna - 1));
        System.out.printf("A soma da matriz é: %d\n", somaTotal(matriz));
    }

    public static int somarLinha(int[][] matriz, int linha) {
        int somaLinha = 0;

        for (int j = 0; j < matriz[linha].length; j++) {
            somaLinha += matriz[linha][j];
        }
        return somaLinha;
    }

    public static int somarColuna(int[][] matriz, int coluna) {
        int somaColuna = 0;

        for (int[] linha: matriz) {
            somaColuna += linha[coluna];
        }

        return somaColuna;
    }

    public static int somaTotal(int[][] matriz) {
        int somaTotal = 0;

        for (int i = 0; i < matriz.length; i++) {
            somaTotal += somarLinha(matriz, i);
        }

        return somaTotal;
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

    public static void exibir(int[][] matriz) {
        for (int[] linhas : matriz) {
            for (int num : linhas) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
