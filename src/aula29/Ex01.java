package aula29;

import java.util.Scanner;

public class Ex01 {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] matriz = preencherMatriz(3, 4);
        exibirMatriz(matriz);

        System.out.printf("Quantidade de pares: %d\n", contarPares(matriz));
        zerarNegativos(matriz);

        System.out.println("Matriz sem negativos: ");
        exibirMatriz(matriz);
    }

    public static int contarPares(int[][] matriz) {
        int qtdPares = 0;

        for (int[] linha: matriz) {
            for (int num: linha) {
                if (num % 2 == 0) {
                    qtdPares++;
                }
            }
        }

        return qtdPares;
    }

    public static void zerarNegativos(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j< matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    matriz[i][j] = 0;
                }
            }
        }
    }

    public static int[][] preencherMatriz(int qLinhas, int qColunas) {
        int[][] matriz = new int[qLinhas][qColunas];

        for (int i = 0; i < qLinhas; i++) {
            for (int j = 0; j < qColunas; j++) {
                matriz[i][j] = lerInteiro(String.format("Preencha a posição [%d][%d]: ", i + 1, j + 1));
            }
        }

        return matriz;
    }

    public static void exibirMatriz(int[][] matriz) {
        for (int[] linha: matriz) {
            for (int num: linha) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static int lerInteiro(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return Integer.parseInt(sc.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("ERRO: A entrada precisa ser um NÚMERO INTEIRO!");
            }
        }
    }
}
