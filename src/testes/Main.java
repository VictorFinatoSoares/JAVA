package testes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite N: ");
        int n = sc.nextInt();

        for (int linhas = 0; linhas < n; linhas++) {
            for (int colunas = 0; colunas < n; colunas++) {
                System.out.print("* ");
            }

            System.out.println();

        }
    }
}