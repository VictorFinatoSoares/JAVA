package atividades.AtividadeAvaliativa1;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("EXERCÍCIO 02:\nDe Emanuel Barboza da Silva e Victor Finato Soares (1K)");

		
		System.out.print("Digite um valor: ");

		float corrida = sc.nextFloat();
		if (corrida > 0) {
			if (corrida < 20) {
				System.out.printf("O valor da corrida é R$ %.2f", corrida);
			}
	
			else if (corrida >= 20 && corrida < 50) {
				double taxa = corrida * 0.08;
				System.out.printf("8%% de TAXA, com um valor de R$ %.2f!%n", taxa);
				System.out.printf("O valor total fica R$ %.2f.", corrida + taxa);
			}
	
			else {
				
				double taxa = corrida * 0.12;
				System.out.printf("12%% de TAXA, com um valor de R$ %.2f!%n", taxa);
				System.out.printf("O valor total fica R$ %.2f.", corrida + taxa);
	
			}
		}
		
		else {
			System.out.println("Valor da corrida é INVÁLIDO!");
		}
		
		sc.close();

	}
}