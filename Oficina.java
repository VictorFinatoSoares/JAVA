package com.finatodev;

import java.util.Scanner;

public class Oficina {
	public static void main(String[] args) {
		at02();
	}

	public static void at01() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número: ");

		int num = sc.nextInt();
		int i = 1;
		int fatorial = 1;

		while (i <= num) {
			fatorial *= i;
			i++;
		}

		System.out.printf("Fatorial de %d é %d.", num, fatorial);

		sc.close();

	}

	public static void at02() {
		Scanner sc = new Scanner(System.in);

		int qPares = 0;

		while (true) {
			System.out.print("Digite um número: ");
			int num = sc.nextInt();

			if (num > 0) {
				if (num % 2 == 0) {
					qPares++;
				}
			}

			else if (num == 0) {
				System.out.println("Saindo...");
				break;
			}

			else {
				System.out.println("Insira números POSITIVOS!");
			}

		}

		System.out.printf("Quantidade de pares digitados: %d.", qPares);

		sc.close();

	}

}
