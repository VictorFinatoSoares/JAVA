package aula25;

import java.util.Scanner;

// Toda chamada de metodo se transforma no tipo de retorno dela

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe N: ");
        int n = sc.nextInt();

        double[] umArrayAi = new double[n];

        for (int i = 0; i < umArrayAi.length; i++) {
            System.out.printf("Preencha a posição %d: ", i);
            umArrayAi[i] = sc.nextDouble();
        }

        double mediaArray = mediaArrayDoubleRetorno(umArrayAi);
    }

    public static void parOuImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.printf("%d é par!%n", numero);
        } else {
            System.out.printf("%d é ímpar!%n", numero);
        }
    }

    public static void imprimirOrdemDecrescenteN(int limite) {
        for (int i = limite; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void imprimirSomaXaY(int x, int y) {
        int soma = 0;

        for (int i = x; i <= y; i++) {
            soma += i;
        }

        System.out.printf("A soma de %d a %d é: %d%n", x, y, soma);
    }

    public static void mediaArrayDouble(double[] meuArray) {
        double soma = 0;

        for (double i : meuArray) {
            soma += i;
        }

        System.out.printf("A média dos elementos é: %.2f%n", soma / meuArray.length);
    }

    public static double mediaArrayDoubleRetorno(double[] meuArray) {
        double soma = 0;

        for (double i : meuArray) {
            soma += i;
        }

        return soma / meuArray.length;
    }
}
