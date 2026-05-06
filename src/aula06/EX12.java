package aula06;

import java.util.Scanner;

public class EX12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Preço do produto: R$ ");
        double preco = sc.nextDouble();
        System.out.print("Quantidade: ");
        int qtd = sc.nextInt();

        double total = preco * qtd;
        double desconto = 0.0;

        if (qtd >= 3 && qtd <= 4) {
            desconto = 0.10;
        } else if (qtd >= 5 && qtd <= 10) {
            desconto = 0.15;
        } else if (qtd > 10) {
            desconto = 0.20;
        }

        total = total * (1.0 - desconto);
        System.out.printf("Desconto: %.0f%% | Total: R$ %.2f%n", desconto * 100, total);

        sc.close();
    }
}
