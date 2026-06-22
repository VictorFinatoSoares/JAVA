package atividades.AtividadeAvaliativa1;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("EXERCÍCIO 01:\nDe Emanuel Barboza da Silva e Victor Finato Soares (1K)");
		 
		System.out.print("Digite a sua idade: ");
		int idade = sc.nextInt();
		if (idade >= 0) {
			if (idade < 13) {
				System.out.printf("Você tem %d anos, você é uma criança!", idade);
			}

			else if (idade >= 13 && idade < 18) {
				System.out.printf("Você tem %d anos, você é um adolescente!", idade);
			}

			else if (idade >= 18 && idade < 60) {
				System.out.printf("Você tem %d anos, você é um adulto!", idade);

			}

			else {
				System.out.printf("Você tem %d anos, você é um idoso!", idade);

			}
		} else {
			System.out.println("Sua idade é inválida!");
		}
		sc.close();
	}
}