package aula28;

import java.util.Scanner;

public class Ex02 {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int qAlunos = lerInteiro("Informe a quantidade de alunos: ");
        double[] notas = new double[qAlunos];

        for (int i = 0; i < qAlunos; i++) {
            notas[i] = lerDouble(String.format("Informe a nota do aluno [%d]: ", i + 1));
        }

        System.out.printf("A média é: %.2f\n", calcularMedia(notas));
        System.out.printf("A menor nota registrada: %.2f\n", menorNota(notas));
        System.out.printf("A maior nota: %.2f\n", maiorNota(notas));
        System.out.printf("Quantidade de notas acima da média: %d\n", contarAcimaDaMedia(notas));
    }

    public static double calcularMedia(double[] notas) {
        double soma = 0;

        for (double nota: notas) {
            soma += nota;
        }

        return soma / notas.length;
    }

    public static double maiorNota(double[] notas) {
        double maior = notas[0];

        for (double nota: notas) {
            if (nota >= maior) {
                maior = nota;
            }
        }
        return maior;
    }

    public static double menorNota(double[] notas) {
        double menor = notas[0];

        for (double nota: notas) {
            if (nota <= menor) {
                menor = nota;
            }
        }
        return menor;
    }

    public static int contarAcimaDaMedia(double[] notas) {
        int qAcimaMedia = 0;
        double media = calcularMedia(notas);

        for (double nota: notas) {
            if (nota > media) {
                qAcimaMedia++;
            }
        }
        return qAcimaMedia;
    }

    public static int lerInteiro(String msg) {
        int num;

        while (true) {
            try {
                System.out.printf(msg);
                num = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("ERRO: Você precisa informar um número INTEIRO!");
            }
        }
        return num;
    }

    public static double lerDouble(String msg) {
        double num;

        while (true) {
            try {
                System.out.printf(msg);
                num = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("ERRO: Você precisa informar um NÚMERO!");
            }
        }
        return num;
    }
}
