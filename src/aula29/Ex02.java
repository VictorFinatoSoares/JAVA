package aula29;

import java.util.Scanner;

public class Ex02 {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int qLinhas = 3;
        int qColunas = 5;

        int[][] cartela = preencherCartela(qLinhas, qColunas);

        System.out.println("Sua cartela:");
        exibirCartela(cartela);

        int totalPosMarcadas = 0;

        for (int i = 0; i < qLinhas * qColunas; i++) {
            int numeroSorteado = sortearNumero();
            int posMarcadas = marcarNumero(cartela, numeroSorteado);

            System.out.printf("Sorteio %d: %d - marcou %d\n", i + 1, numeroSorteado, posMarcadas);

            totalPosMarcadas += posMarcadas;
        }

        System.out.println("Cartela final:");
        exibirCartela(cartela);

        System.out.printf("Total de posições marcadas: %d\n", totalPosMarcadas);
        System.out.println(deuBingo(cartela) ? "BINGO!" : "Não foi dessa vez!");
    }

    public static int marcarNumero(int[][] cartela, int numero) {
        int qtdPosMarcadas = 0;

        for (int i = 0; i < cartela.length; i++) {
            for (int j = 0; j < cartela[i].length; j++) {
                if (cartela[i][j] == numero) {
                    cartela[i][j] = 0;
                    qtdPosMarcadas++;
                }
            }
        }

        return qtdPosMarcadas;
    }

    public static boolean deuBingo(int[][] cartela) {
        for (int[] linha: cartela) {
            for (int num: linha) {
                if (num != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int sortearNumero() {
        return (int) (Math.random() * 60) + 1;
    }

    public static int[][] preencherCartela(int qLinhas, int qColunas) {
        int[][] matriz = new int[qLinhas][qColunas];

        for (int i = 0; i < qLinhas; i++) {
            for (int j = 0; j < qColunas; j++) {
                matriz[i][j] = sortearNumero();
            }
        }

        return matriz;
    }

    public static void exibirCartela(int[][] cartela) {
        for (int[] linha: cartela) {
            for (int num: linha) {
                System.out.print(" " + num + " ");
            }
            System.out.println();
        }
    }
}
