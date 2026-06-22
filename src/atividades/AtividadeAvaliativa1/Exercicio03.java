package atividades.AtividadeAvaliativa1;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("EXERCÍCIO 03:\nDe Emanuel Barboza da Silva e Victor Finato Soares (1K)");
		
		System.out.print("Digite o seu salário: ");

		float salarioBruto = sc.nextFloat();
		if (salarioBruto > 0) {
			if (salarioBruto <= 2000) {
				System.out.println("ISENTO!");
				System.out.printf("O valor do salário líquido é R$ %.2f", salarioBruto);
			}

			else if (salarioBruto > 2000 && salarioBruto <= 4000) {
				double imposto = salarioBruto * 0.1;
				System.out.printf("IMPOSTO (10%%): Com um valor de R$ %.2f!%n", imposto);
				System.out.printf("O seu salário líquido fica R$ %.2f.", salarioBruto - imposto);
			}

			else {
				double imposto = salarioBruto * 0.2;
				System.out.printf("IMPOSTO (20%%): Com um valor de R$ %.2f!%n", imposto);
				System.out.printf("O seu salário líquido fica R$ %.2f.", salarioBruto - imposto);

			}
		}

		else {
			System.out.println("DESEMPREGRADO!");
		}

		sc.close();

	}
}