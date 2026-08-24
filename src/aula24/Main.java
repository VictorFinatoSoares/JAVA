package aula24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe N: ");
        int n = Integer.parseInt(sc.nextLine());

        int[][] matriz = new int[n][n];

        // Loop para preencher a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Informe a posição (%d, %d): ", i + 1, j + 1);
                matriz[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

        // Loop que mostra a matriz inteira
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Loop que mostra o que está na diagonal principal
        System.out.println("Elementos na diagonal principal: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        // Loop que mostra abaixo da diagonal principal
        System.out.println("\nElemenos ABAIXO da diagonal principal:");
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }

        // Loop que mostra acima da diagonal principal
        System.out.println("\nElemenos ACIMA da diagonal principal:");
        for (int j = 1; j < matriz.length; j++) {
            for (int i = 0; i < j; i++) {
                System.out.print(matriz[i][j] + " ");
            }
        }


    }
}
