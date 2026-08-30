package aula24;

import java.util.Scanner;

public class Main {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ex02();
        sc.close();
    }

    public static void ex01() {

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
        System.out.println("\nElementos ABAIXO da diagonal principal:");
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }

        // Loop que mostra acima da diagonal principal
        System.out.println("\nElementos ACIMA da diagonal principal:");
        for (int j = 1; j < matriz.length; j++) {
            for (int i = 0; i < j; i++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }

    public static void ex02() {
        boolean[] primo = new boolean[1000001];

        // Assume inicialmente que todos de 2 até 1.000.000 são primos
        for (int i = 2; i <= 1000000; i++) {
            primo[i] = true;
        }

        // Crivo de Eratóstenes
        for (int i = 2; i * i <= 1000000; i++) {
            if (primo[i]) {
                for (int j = i * i; j <= 1000000; j += i) {
                    primo[j] = false;
                }
            }
        }

        // Imprime os primos
        for (int i = 2; i <= 1000000; i++) {
            if (primo[i]) {
                System.out.println(i);
            }
        }
    }
}
