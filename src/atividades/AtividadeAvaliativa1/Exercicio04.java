package atividades.AtividadeAvaliativa1;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("EXERCÍCIO 04:\nDe Emanuel Barboza da Silva e Victor Finato Soares (1K)");
		
		System.out.print("Escreva a quantidade de votos do candidato A: ");
		int candA = sc.nextInt();

		System.out.print("Escreva a quantidade de votos do candidato B: ");
		int candB = sc.nextInt();

		System.out.print("Escreva a quantidade de votos do candidato C: ");
		int candC = sc.nextInt();

		float total = (candA + candB + candC);

		float porcA = (candA * 100) / total;
		float porcB = (candB * 100) / total;
		float porcC = (candC * 100) / total;
		
		if (total > 0) {
			System.out.printf("Total de votos: %s%n", total);
			System.out.printf("O percentual de pessoas que votou no candidato A foi: %.2f%%%n", porcA);
			System.out.printf("O percentual de pessoas que votou no candidato B foi: %.2f%%%n", porcB);
			System.out.printf("O percentual de pessoas que votou no candidato C foi: %.2f%%%n", porcC);
			
			if (candA > candB && candA > candC) {
				System.out.printf("Vencedor: Candidato A!");
			}

			else if (candB > candA && candB > candC) {
				System.out.printf("Vencedor: Candidato B!");
			}

			else if (candC > candA && candC > candB) {
				System.out.printf("Vencedor: Candidato C!");
			}

			else {
				System.out.println("HOUVE UM EMPATE!");
			}

		}
		
		else {
			System.out.println("QUANTIDADE INVÁLIDA!");
		}
		sc.close();
	}
}