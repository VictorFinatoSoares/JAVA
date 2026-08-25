package avaliacoes.primeiroSemestre;

import java.util.Scanner;

public class AtividadeAvaliativa01 {
	public static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		exercicio01();
		sc.close();

	}

	public static void exercicio01() {
		System.out.println("EXERCÍCIO 01:\nDe Emanuel Barboza da Silva e Victor Finato Soares (1K)");

		System.out.print("Digite a sua idade: ");
		int idade = sc.nextInt();

		if (idade >= 0) {
			if (idade < 13) {
				System.out.printf("Você tem %d anos, você é uma criança!", idade);
			}

			else if (idade < 18) {
				System.out.printf("Você tem %d anos, você é um adolescente!", idade);
			}

			else if (idade < 60) {
				System.out.printf("Você tem %d anos, você é um adulto!", idade);

			}

			else {
				System.out.printf("Você tem %d anos, você é um idoso!", idade);

			}
		} else {
			System.out.println("Sua idade é inválida!");
		}
	}

	public static void exercicio02() {
		System.out.println("EXERCÍCIO 02:\nDe Emanuel Barboza da Silva e Victor Finato Soares (1K)");

		System.out.print("Digite um valor: ");

		float corrida = sc.nextFloat();
		if (corrida > 0) {
			if (corrida < 20) {
				System.out.printf("O valor da corrida é R$ %.2f", corrida);
			}

			else if (corrida < 50) {
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

	}

	public static void exercicio03() {
		System.out.println("EXERCÍCIO 03:\nDe Emanuel Barboza da Silva e Victor Finato Soares (1K)");

		System.out.print("Digite o seu salário: ");

		float salarioBruto = sc.nextFloat();
		if (salarioBruto > 0) {
			if (salarioBruto <= 2000) {
				System.out.println("ISENTO!");
				System.out.printf("O valor do salário líquido é R$ %.2f", salarioBruto);
			}

			else if (salarioBruto <= 4000) {
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
			System.out.println("DESEMPREGADO!");
		}
	}

	public static void exercicio04() {
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
				System.out.println("Vencedor: Candidato A!");
			}

			else if (candB > candA && candB > candC) {
				System.out.println("Vencedor: Candidato B!");
			}

			else if (candC > candA && candC > candB) {
				System.out.println("Vencedor: Candidato C!");
			}

			else {
				System.out.println("HOUVE UM EMPATE!");
			}

		}

		else {
			System.out.println("QUANTIDADE INVÁLIDA!");
		}

	}
}