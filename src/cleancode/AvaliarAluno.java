package cleancode;

import java.util.Scanner;

public class AvaliarAluno {
    public static final int SAIR = 0;
    public static final int MAXIMO_FALTAS = 15;
    public static final double NOTA_APROVACAO = 7.0;
    public static final double NOTA_RECUPERACAO = 6.0;
    public static final double NOTA_REPROVACAO = 5.0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int opcao;

            System.out.println("(1) Avaliar Aluno\n(0) Sair");

            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(sc.nextLine());

            if (opcao == SAIR) {
                System.out.println("Saindo...");
                break;
            }

            System.out.print("Nome do aluno: ");
            String nomeAluno = sc.nextLine();

            System.out.print("Quantidade de faltas: ");
            int quantidadeFaltas = Integer.parseInt(sc.nextLine());

            System.out.print("Informe a primeira nota: ");
            double nota1 = Double.parseDouble(sc.nextLine());

            System.out.print("Informe a segunda nota: ");
            double nota2 = Double.parseDouble(sc.nextLine());

            System.out.print("Informe a terceira nota: ");
            double nota3 = Double.parseDouble(sc.nextLine());

            double mediaAluno = (nota1 + nota2 + nota3) / 3;

            if (quantidadeFaltas > MAXIMO_FALTAS) {
                System.out.println("Reprovado por falta.");
                continue;
            }

            if (mediaAluno < NOTA_REPROVACAO) {
                System.out.println("Reprovado direto por nota.");
                continue;
            }

            if (mediaAluno >= NOTA_APROVACAO) {
                System.out.println("Aprovado direto por nota.");
                continue;
            } else if (mediaAluno >= NOTA_RECUPERACAO) {
                System.out.print("Aluno em recuperação.\nDigite a nota da prova de recuperação: ");
                double notaRecuperacao = Double.parseDouble(sc.nextLine());

                double mediaRecuperacao = (mediaAluno + notaRecuperacao) / 2;

                if (mediaRecuperacao >= NOTA_RECUPERACAO) {
                    System.out.println("Aluno aprovado na recuperação.");
                } else {
                    System.out.println("Aluno reprovado na recuperação.");
                }
            }
        }
        sc.close();
    }
}
