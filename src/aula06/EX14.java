package aula06;

import java.util.Scanner;

public class EX14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = sc.next();
        System.out.print("Peso (kg): ");
        double peso = sc.nextDouble();
        System.out.print("Altura (m): ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf("%s, seu IMC é %.1f%n", nome, imc);

        if (imc < 18.5)
            System.out.println("Classificação: Abaixo do peso");
        else if (imc < 25.0)
            System.out.println("Classificação: Peso normal");
        else if (imc < 30.0)
            System.out.println("Classificação: Pré-obesidade");
        else if (imc < 35.0)
            System.out.println("Classificação: Obesidade Grau 1");
        else if (imc < 40.0)
            System.out.println("Classificação: Obesidade Grau 2");
        else
            System.out.println("Classificação: Obesidade Grau 3");

        sc.close();
    }
}
