package avaliacoes.segundoSemestre.Avaliacao02;

import java.util.Scanner;

public class Ex01 {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Informe a quantidade de linhas: ");
        int l = Integer.parseInt(sc.nextLine());

        System.out.print("Informe a quantidade de colunas: ");
        int c = Integer.parseInt(sc.nextLine());

        int[][] vetor = preencherVetor(l, c);

        System.out.printf("Quantidade de multíplos de 3: %d\n", contarMultiplosDe3(vetor));
        limitarValores(vetor);
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

    public static int contarMultiplosDe3(int[][] vetor) {
        int qtdMultiplos = 0;

        for (int[] linha: vetor) {
            for (int num: linha) {
                if (num % 3 == 0) {
                    qtdMultiplos ++;
                }
            }
        }

        return qtdMultiplos;
    }

    public static void limitarValores(int[][] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor[i].length; j++) {
                if (vetor[i][j] > 10) {
                    vetor[i][j] = 10;
                }
            }
        }
    }
}
