package aula22;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercicioInicial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inicializa as dimensõe com [0][0]
        int rows = 0;
        int columns = 0;

        // Recebe (já validando) as dimensões da matriz
        while (rows <= 0 || columns <= 0) {
            if (rows <= 0) {
                try {
                    System.out.print("Quantidade de linhas: ");
                    rows = sc.nextInt();

                    if (rows <= 0) System.out.println("A quantidade de linhas precisa ser maior que ZERO!\n");

                } catch (InputMismatchException e) {
                    System.out.println("ERRO: Entrada INVÁLIDA! Tente novamente!\n");
                    sc.nextLine();
                }
            }

            else {
                try {
                    System.out.print("Quantidade de colunas: ");
                    columns = sc.nextInt();

                    if (columns <= 0) System.out.println("A quantidade de colunas precisa ser maior que ZERO!\n");

                } catch (InputMismatchException e) {
                    System.out.println("ERRO: Entrada INVÁLIDA! Tente novamente!\n");
                    sc.nextLine();
                }
            }
        }

        // Cria a matriz com as dimensões informadas
        int[][] minhaMatriz = new int[rows][columns];

        // Preencha a matriz com valores inteiros aleatórios dentro do intervalo de [0, 100]
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                minhaMatriz[i][j] = (int) (Math.random() * 101);
            }
        }

        // Define a variável que guardará a soma de TODOS os elementos do array
        int totalSum = 0;

        System.out.println(); // Linha vazia para separar

        // Percorre o array imprimindo linha por linha separada
        for (int[] row: minhaMatriz) {
            for (int i: row) {
                System.out.print(i + " ");            }
            System.out.println();
        }

        System.out.println(); // Linha vazia para separar

        // Percorre o array, somando todos os elementos (guarda em totalSum) e somando cada linha (guarda em rowsSum)
        // E a cada linha exibe o valor somado da linha atual antes de ir para a próxima e zerar o contador (rowSum)
        for (int i = 0; i < rows; i++) {
            int rowsSum = 0;
            for (int j = 0; j < columns; j++) {
                rowsSum += minhaMatriz[i][j];
                totalSum += minhaMatriz[i][j];
            }
            System.out.printf("Soma da linha %d: %d%n", i + 1, rowsSum);
        }

        System.out.println(); // Linha vazia para separar

        // Faz a mesma coisa, dessa vez para as colunas
        for (int j = 0; j < columns; j++) {
            int columnsSum = 0;
            for (int i = 0; i < rows; i++) {
                columnsSum += minhaMatriz[i][j];
            }
            System.out.printf("Soma da coluna %d: %d%n", j + 1, columnsSum);
        }

        System.out.printf("\nSoma total: %d", totalSum);
    }
}
