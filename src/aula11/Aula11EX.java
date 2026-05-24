package aula11;

import java.util.Scanner;

public class Aula11EX {
    public static void main(String[] args) {

        ex4();

    }

    public static void ex1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite N: ");
        int n = sc.nextInt();

        int linhas = 0;

        while (linhas < n) {
            int colunas = 0;
            while (colunas < n) {
                System.out.print("* ");
                colunas++;
            }
            System.out.println();
            linhas++;
        }
    }

    public static void ex2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite N: ");
        int n = sc.nextInt();

        int linhas = 0;

        while (linhas < n) {
            int colunas = 0;
            while (colunas <= linhas) {
                System.out.print("* ");
                colunas++;
            }
            System.out.println();
            linhas++;
        }
    }

    public static void ex3() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        while (num > 0) {
            int i = 1;
            int div = 0;
            while (i <= num) {
                if (num % i == 0) {
                    div++;
                }

                i++;
            }

            if (div == 2) {
                System.out.printf("%d é primo!%n", num);
            } else {
                System.out.printf("%d não é primo!%n", num);
            }

            System.out.print("Digite um número: ");
            num = sc.nextInt();

        }

        System.out.printf("%d é um número inválido!", num);

        sc.close();

    }

    public static void ex4() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();


        while (num > 0) {
            int i = 1;
            int somaDiv = 0;
            while (i <= num) {
                if (num % i == 0) {

                    if (i < num) System.out.printf("Divisível por: %d%n", i);
                    somaDiv += i;


                }

                i++;
            }

            if ((somaDiv - num) == num) {
                System.out.printf("%d é um número perfeito!%n", num);
            } else {
                System.out.printf("%d não é um número perfeito!%n", num);
                break;

            }

            System.out.print("Digite um número: ");
            num = sc.nextInt();

        }


        sc.close();


    }


}