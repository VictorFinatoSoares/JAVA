package aula28;

import java.util.Scanner;

public class Ex12 {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = lerInteiro(String.format("Preencha a posição [%d][%d]: ", i + 1, j + 1));
            }
        }

        int maiorElemento = maiorElemento(matriz);
        int[] posMaiorElemento = maiorElementoPos(matriz);

        System.out.printf("O maior elemento é: %d\nLinha: %d\nColuna: %d\n", maiorElemento, posMaiorElemento[0], posMaiorElemento[1]);
    }

    public static int maiorElemento(int[][] matriz) {
        int maior = 0;

        for (int[] linha:  matriz) {
            for (int num: linha) {
                if (num >= maior) {
                    maior = num;
                }
            }
        }

        return maior;
    }

    public static int[] maiorElementoPos(int[][] matriz) {
        int maior = maiorElemento(matriz);
        int[] pos = new int[2];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == maior) {
                    pos[0] = i; pos[1] = j;
                    break;
                }
            }
        }
        return pos;
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
