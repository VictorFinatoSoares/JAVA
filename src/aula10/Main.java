package com.finatodev;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite N: ");
        int n = sc.nextInt();

        int linhas = 0;
        while(linhas < n) {
            int colunas = 0;
            while (colunas < n) {
                System.out.print("* ");
                colunas++;
            }
            System.out.println();
            linhas++;
        }

    }
}