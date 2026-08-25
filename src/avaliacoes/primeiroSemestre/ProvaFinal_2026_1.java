package avaliacoes.primeiroSemestre;

import java.util.Arrays;
import java.util.Scanner;

/*
 Nome do aluno: Victor Finato Soares
 Turma do aluno: 1K
 Mensagem adicional: Espero que não haja problema em dividir as questões por métodos
*/

public class ProvaFinal_2026_1 {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        questao5();
        sc.close();
    }

    public static void questao1() {
        System.out.print("Digite uma palavra: ");

        String palavra = sc.nextLine().toUpperCase();
        String vogais = "AEIOU";

        int qVogais = 0;

        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            if (vogais.indexOf(letra) != -1) qVogais++;
        }
        System.out.printf("A palavra (%s) possui %d vogais!", palavra, qVogais);
    }

    public static void questao2() {
        System.out.print("Informe sua idade: ");
        int idade = sc.nextInt();

        while (idade < 0) {
            System.out.print("Idade INVÁLIDA!\nInforme sua idade: ");
            idade = sc.nextInt();
        }

        if (idade <= 12) System.out.println("Fase de vida: Criança");
        else if (idade <= 17) System.out.println("Fase de vida: Adolescente");
        else if (idade <= 59) System.out.println("Fase de vida: Adulto");
        else System.out.println("Fase de vida: Idoso");
    }

    public static void questao3() {
        System.out.print("Informe a quantidade de termos ímpares: ");
        int termos = sc.nextInt();

        while (termos <= 0) {
            System.out.print("INVÁLIDO!\nInforme a quantidade de termos ímpares: ");
            termos = sc.nextInt();
        }

        int soma = 0;
        int termoImpar = 1;

        System.out.printf("Estes são os %d primeiros termos ímpares:%n", termos);

        for (int i = 0; i < termos; i++) {
            System.out.print(termoImpar + " ");
            soma += termoImpar;
            termoImpar += 2;
        }
        System.out.printf("%nSoma: %d%n", soma);
    }

    public static void questao4() {
        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o número [%d]: ", i + 1);
            numeros[i] = sc.nextInt();
        }

        System.out.print("\nDigite o número a buscar: ");
        int n = sc.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == n) {
                if (!encontrado) System.out.print("\nNúmero encontrado nas posições: ");
                System.out.print(i + " ");
                encontrado = true;
            }
        }

        if (!encontrado) System.out.println("\nO número não foi encontrado!");
        else System.out.println();
    }

    public static void questao5() {
        System.out.print("Informe a quantidade de funcionários: ");
        int quantFuncionarios = Integer.parseInt(sc.nextLine());

        String[] funcionarios = new String[quantFuncionarios];
        double[] salarios = new double[quantFuncionarios];

        double totalSalarios = 0;

        for (int i = 0; i < quantFuncionarios; i++) {
            System.out.printf("Digite o nome do funcionário %d: ", i + 1);
            funcionarios[i] = sc.nextLine();

            System.out.printf("Digite o salário de %s: ", funcionarios[i]);
            salarios[i] = Double.parseDouble(sc.nextLine());

            totalSalarios += salarios[i];
            System.out.println();
        }

        double maiorSalario = Arrays.stream(salarios).max().getAsDouble();
        double mediaSalarial = (totalSalarios / quantFuncionarios);
        int fAcimaMedia = 0;

        double[] salariosAtualizados = salarios.clone();

        for (int i = 0; i < salarios.length; i++) {
            if (salarios[i] > mediaSalarial) fAcimaMedia++;
            else {
                salariosAtualizados[i] = salarios[i] * 1.15;
            }
        }

        System.out.printf("%nMaior salário: R$ %.2f%nMédia salarial: R$ %.2f%nFuncionários acima da média: %d%n%nSalários atualizados:%n", maiorSalario, mediaSalarial, fAcimaMedia);

        for (int i = 0; i < quantFuncionarios; i++) {
            if (salariosAtualizados[i] != salarios[i]) System.out.printf("%s: R$ %.2f (Reajustado)%n", funcionarios[i], salariosAtualizados[i]);
            else System.out.printf("%s: R$ %.2f%n", funcionarios[i], salariosAtualizados[i]);
        }
    }
}
