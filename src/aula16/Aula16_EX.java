package aula16;

import java.util.Arrays;
import java.util.Scanner;

public class Aula16_EX {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ex08_chamada();
        sc.close();
    }

    public static void ex01() {
        String[] nomes = new String[5];
        double[] notas = new double[5];

        double totalNota = 0;
        int i = 0;

        while (i < 20) {
            System.out.printf("Digite o nome do aluno [%d]: ", i + 1);
            String nome = sc.nextLine();

            System.out.print("Nota: ");

            double nota = Double.parseDouble(sc.nextLine());

            if (nota < 0 || nota > 10) {
                System.out.println("\nA nota precisa ser de 0 a 10! Tente novamente.\n");
                continue;
            }

            System.out.println();

            nomes[i] = nome;
            notas[i] = nota;
            totalNota += nota;

            i++;
        }

        System.out.printf("Média da turma: %.2f%n%n", totalNota / notas.length);
        System.out.println("LISTA DOS APROVADOS: \n");

        for (int j = 0; j < notas.length; j++) {
            if (notas[j] > 6) System.out.printf("%s passou com a nota: %.2f!%n", nomes[j], notas[j]);
        }
    }

    public static void ex02() {
        int[] X = new int[10];

        for (int i = 0; i < X.length; i++) {
            int n = sc.nextInt();

            if (n <= 0) X[i] = 1;
            else X[i] = n;

        }

        for (int i = 0; i < X.length; i++) {
            System.out.printf("X[%d] = %d%n", i, X[i]);
        }


    }

    public static void ex03() {
        int x = sc.nextInt();

        int[] n = new int[10];
        n[0] = x;

        for (int i = 1; i < n.length; i++) {
            n[i] = x *= 2;
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("N[%d] = %d%n", i, n[i]);
        }


    }

    public static void ex04() {
        double[] A = new double[100];

        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextDouble();
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] <= 10) System.out.printf("A[%d] = %.1f%n", i, A[i]);
        }

    }

    public static void ex05() {
        int[] N = new int[20];


        for (int i = 0; i < N.length; i++) {
            N[i] = sc.nextInt();
        }

        int indiceN = 0;
        int[] M = N.clone();

        for (int i = N.length - 1; i >= 0; i--) {
            N[i] = M[indiceN];
            indiceN++;
        }

        for (int i = 0; i < N.length; i++) {
            System.out.printf("N[%d] = %d%n", i, N[i]);
        }


    }

    public static void ex06() {
        double num = sc.nextDouble();

        double[] n = new double[100];
        n[0] = num;

        for (int i = 1; i < n.length; i++) {
            n[i] = num /= 2;
        }

        for (int i = 0; i < n.length; i++) {
            System.out.printf("N[%d] = %.4f%n", i, n[i]);
        }
    }

    public static void ex07() {
        int n = sc.nextInt();

        int[] x = new int[n];

        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }

        int menorValor = Arrays.stream(x).min().getAsInt();
        int posMenor = 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i] == menorValor) posMenor = i;
        }

        System.out.printf("Menor valor: %d%nPosicao: %d%n", x[posMenor], posMenor);

    }

    public static void ex08_chamada() {
        System.out.print("Digite a quantidade de elementos: ");
        int quant = sc.nextInt();

        int[] meuArray = new int[quant];

        for (int i = 0; i < meuArray.length; i++) {
            System.out.printf("Digite um número [%d]: ", i + 1);
            meuArray[i] = sc.nextInt();
        }

        int quantPares = 0;
        int quantImpares = 0;

        for (int j : meuArray) {
            if (j % 2 == 0) quantPares++;
            else quantImpares++;
        }

        int[] paresArray = new int[quantPares];
        int[] imparesArray = new int[quantImpares];

        int indPares = 0;
        int indImpares = 0;

        for (int j : meuArray) {
            if (j % 2 == 0) {
                paresArray[indPares] = j;
                indPares++;
            } else {
                imparesArray[indImpares] = j;
                indImpares++;
            }
        }

        System.out.println("Pares: ");
        for (int i: paresArray) {
            System.out.println(i);
        }

        System.out.println("Impares: ");
        for (int i: imparesArray) {
            System.out.println(i);
        }



    }

}
