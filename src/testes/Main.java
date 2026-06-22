package testes;

import java.util.Scanner;

public class Main {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        classificarIdade();
    }

    public static void classificarIdade() {
        System.out.print("Por favor, informe sua idade: ");
        int idade = sc.nextInt();

        if (idade < 0) System.out.println("Idade INVÁLIDA!");
        else if (idade <= 12) System.out.printf("Você possui %d anos, logo é uma criança!", idade);
        else if (idade <= 17) System.out.printf("Você possui %d anos, logo é um ADOLESCENTE!", idade);
        else if (idade <= 64) System.out.printf("Você possui %d anos, logo é um ADULTO!", idade);
        else System.out.printf("Você possui %d anos, logo é um IDOSO!", idade);
        sc.close();


    }

    public static void calcularIMC() {
        System.out.print("Por favor, informe seu peso: ");
        double peso = sc.nextDouble();

        System.out.print("Por favor, informe sua altura: ");
        double altura = sc.nextDouble();

        if (peso <= 0 || altura <= 0) {
            System.out.println("Valor INVÁLIDO!");
            return;
        }


        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC: %.2f%n", imc);

        if (imc < 18.5) System.out.println("Você está ABAIXO DO PESO!");
        else if (imc <= 24.9) System.out.println("Você está com o PESO NORMAL!");
        else if (imc <= 29.9) System.out.println("Você está com SOBREPESO!");
        else System.out.println("Você está OBESO!");
        sc.close();

    }

    public static void sistemaLogin() {
        String usuario = "ADMIN";
        String senha = "ADMIN1234";

        int tentativas = 1;

        while (true) {
            System.out.println("Insira seu usuário: ");
            String acessoUsuario = sc.nextLine();

            System.out.println("Insira sua senha: ");
            String acessoSenha = sc.nextLine();

            if (acessoUsuario.equals(usuario) && acessoSenha.equals(senha)) {
                System.out.println("ACESSO CONCEDIDO!");
                break;
            }

            if (tentativas < 3) {
                if (acessoUsuario.equals(usuario)) System.out.println("SENHA INVÁLIDA! Tente novamente.");
                else if (acessoSenha.equals(senha)) System.out.println("USUÁRIO INVÁLIDO! Tente novamente.");
                else System.out.println("INFORMAÇÕES INVÁLIDAS! Tente novamente.");
            }

            else {
                System.out.println("ACESSO NEGADO! Encerrando sistema...");
                break;
            }

            tentativas++;

        }
        sc.close();

    }


}
