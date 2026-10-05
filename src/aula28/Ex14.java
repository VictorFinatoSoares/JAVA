package aula28;

import java.util.Scanner;

public class Ex14 {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = lerInteiro("Informe o N: ");
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = lerInteiro(String.format("Preencha a posição [%d][%d]: ", i + 1, j + 1));
            }
        }

        exibir(matriz);

        System.out.println(matrizIdentidade(matriz) ? "A matriz é identidade!" : "A matriz não é identidade");
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

    public static boolean matrizIdentidade(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][i] != 1)
                    return false;

                if (i != j) {
                    if (matriz[i][j] != 0) {
                        return false;
                    }
                }

            }
        }

        return true;
    }
}
