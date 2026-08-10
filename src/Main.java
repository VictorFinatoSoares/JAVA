package com.finatodev;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int l = 0; int c = 0;

        // Obtém as dimensões do usuário:
        System.out.print("Quantidade de linhas: ");
        try {
            l = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Entrada INVÁLIDA!");
        }

        System.out.print("Quantidade de colunas: ");
        try {
            c = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Entrada INVÁLIDA!");
        }

        // Cria a matriz com as dimensões:
        int[][] minhaMatriz = new int[l][c];

        // Preenche os arrays com valores de 0 a 100 de forma aleatória
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                minhaMatriz[i][j] = (int) (Math.random() * 101);
            }
        }

        // Exibe a matriz
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(minhaMatriz[i][j] + " ");
            }
            System.out.println();
        }

        int somaTotal = 0;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                somaTotal += minhaMatriz[i][j];
            }
        }

        System.out.println();

        for (int i = 0; i < l; i++) {
            int somaLinhas = 0;
            for (int j = 0; j < c; j++) {
                somaLinhas += minhaMatriz[i][j];

                somaTotal += minhaMatriz[i][j];

            }
            System.out.printf("Soma da linha %d: %d%n", i + 1, somaLinhas);
        }

        System.out.println();

        for (int j = 0; j < c; j++) {
            int somaColunas = 0;
            for (int i = 0; i < l; i++) {
                somaColunas += minhaMatriz[i][j];

            }
            System.out.printf("Soma da coluna %d: %d%n", j + 1, somaColunas);
        }

        System.out.printf("\nSoma total: %d", somaTotal);
    }
}
