package aula21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ex00();
        sc.close();
    }

    public static void ex00() {
        int l = 0;
        int c = 0;
        System.out.print("Informe linhas: ");
        try {
            l = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Entrada INVÁLIDA!");
        }

        System.out.print("Informe colunas: ");
        try {
            c = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Entrada INVÁLIDA!");
        }

        int[][] meuArray = new int[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("Preencha a posição [%d][%d]: ", i, j);
                try {
                    meuArray[i][j] = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Valor INVÁLIDO!");
                }
            }
        }

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(meuArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ex01() {
        int l = 0; int c = 0;
        System.out.print("Informe linhas: ");
        try {
            l = sc.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("Entrada INVÁLIDA!");
        }

        System.out.print("Informe colunas: ");
        try {
            c = sc.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("Entrada INVÁLIDA!");
        }

        int[][] meuArray = new int[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("Preencha a posição [%d][%d]: ", i, j);
                try {
                    meuArray[i][j] = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Valor INVÁLIDO!");
                }
            }
        }

        for (int i = l - 1; i >= 0; i--) {
            for (int j = c - 1; j >= 0; j--) {
                System.out.print(meuArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ex03() {
        int l = 0;
        int c = 0;
        System.out.print("Informe linhas: ");
        try {
            l = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Entrada INVÁLIDA!");
        }

        System.out.print("Informe colunas: ");
        try {
            c = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Entrada INVÁLIDA!");
        }

        int[][] meuArray = new int[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("Preencha a posição [%d][%d]: ", i, j);
                try {
                    meuArray[i][j] = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Valor INVÁLIDO!");
                }
            }
        }

        int qPares = 0;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                if (meuArray[i][j] % 2 == 0) qPares++;
            }
        }

        int[] meuArrayDePares = new int[qPares];

        int paresInd = 0;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                if (meuArray[i][j] % 2 == 0) {
                    meuArrayDePares[paresInd] = meuArray[i][j];
                    paresInd++;
                }
            }
        }

        for (int i: meuArrayDePares) {
            System.out.println(i);
        }

    }

    public static void ex04() {
        int l = 0;
        int c = 0;
        System.out.print("Informe linhas: ");
        try {
            l = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Entrada INVÁLIDA!");
        }

        System.out.print("Informe colunas: ");
        try {
            c = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Entrada INVÁLIDA!");
        }

        char[][] meuArray = new char[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("Preencha a posição [%d][%d]: ", i, j);
                try {
                    meuArray[i][j] = sc.next().charAt(0);
                } catch (InputMismatchException e) {
                    System.out.println("Valor INVÁLIDO!");
                }
            }
        }

        System.out.println("Caractere para procurar: ");
        char letter = sc.next().charAt(0);
        boolean encontrado = false;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                if (meuArray[i][j] == letter) {
                    System.out.printf("O caractere %s foi encontrado na posição: [%d][%d]", letter, i, j);
                    encontrado = true;
                    break;
                }
            }
        }

        if (!encontrado) System.out.println("Caractere não encontrado!");


    }

}
