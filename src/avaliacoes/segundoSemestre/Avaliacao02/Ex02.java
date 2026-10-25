package avaliacoes.segundoSemestre.Avaliacao02;

import java.util.Scanner;

public class Ex02 {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Informe a quantidade de linhas: ");
        int l = Integer.parseInt(sc.nextLine());

        System.out.print("Informe a quantidade de colunas: ");
        int c = Integer.parseInt(sc.nextLine());

        int[][] vetor = preencherVetor(l, c);

        System.out.printf("Soma de todos os números positivos: %d\n", somarPositivos(vetor));
        dobrarImpares(vetor);

        System.out.println("Matriz com ímpares dobrados:");
        exibirVetor(vetor);
    }

    public static void exibirVetor(int[][] vetor) {
        for (int[] linha: vetor) {
            for (int num: linha) {
                System.out.printf("%3d", num);
            }
            System.out.println();
        }
    }

    public static int[][] preencherVetor(int l, int c) {
        int[][] vetor = new int[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("Digite o número [%d][%d]: ", i + 1, j + 1);
                vetor[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

        return vetor;
    }

    public static int somarPositivos(int[][] vetor) {
        int soma = 0;

        for (int[] linha: vetor) {
            for (int num: linha) {
                if (num > 0) {
                    soma += num;
                }
            }
        }
        return soma;
    }

    public static void dobrarImpares(int[][] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor[i].length; j++) {
                if (vetor[i][j] % 2 != 0) {
                    vetor[i][j] *= 2;
                }
            }
        }
    }
}