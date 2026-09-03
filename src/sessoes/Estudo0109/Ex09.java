package sessoes.Estudo0109;

import java.util.Scanner;

public class Ex09 {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Informe a quantidade de linhas: ");
        int l = Integer.parseInt(sc.nextLine());

        System.out.print("Informe a quantidade de colunas: ");
        int c = Integer.parseInt(sc.nextLine());

        int[][] minhaMatriz = preencherMatriz(l, c);

        exibirMatriz(minhaMatriz);
        somaLinhas(minhaMatriz, l, c);
        somaColunas(minhaMatriz, l, c);
        somaMatriz(minhaMatriz);

        sc.close();
    }

    public static int[][] preencherMatriz(int linhas, int colunas) {
        int[][] matrizPreenchida = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("Informe a posição (%d, %d): ", i + 1, j + 1);
                matrizPreenchida[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

        return matrizPreenchida;
    }

    public static void exibirMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int i : linha) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void somaLinhas(int[][] matriz, int qLinhas, int qColunas) {
        for (int i = 0; i < qLinhas; i++) {
            int somaLinha = 0;
            for (int j = 0; j < qColunas; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.printf("A soma da linha %d é: %d%n", i + 1, somaLinha);
        }
    }

    public static void somaColunas(int[][] matriz, int qLinhas, int qColunas) {
        for (int j = 0; j < qColunas; j++) {
            int somaColuna = 0;
            for (int i = 0; i < qLinhas; i++) {
                somaColuna += matriz[i][j];
            }
            System.out.printf("A soma da coluna %d é: %d%n", j + 1, somaColuna);
        }
    }

    public static void somaMatriz(int[][] matriz) {
        int soma = 0;

        for (int[] linhas: matriz) {
            for (int i: linhas) {
                soma += i;
            }
        }

        System.out.printf("A soma total da matriz é: %d", soma);
    }
}
