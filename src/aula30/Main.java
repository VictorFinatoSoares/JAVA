package aula30;

import java.util.Scanner;

// ex.: arroz:25.90,feijão:8.50,leite:5.75,café:18.00

public class Main {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String listaProdutos = sc.nextLine();
        String[] produtosSeparados = listaProdutos.split(",");

        for (int i = 0; i < produtosSeparados.length; i++) {
            String[] precoSeparado = produtosSeparados[i].split(":");
            System.out.printf("%d - %s: R$ %.2f\n", i + 1, precoSeparado[0], Double.parseDouble(precoSeparado[1]));
        }

        System.out.printf("\nO maior preço é R$ %.2f\n", maiorPreco(produtosSeparados));
        System.out.printf("A soma dos preços é: R$ %.2f\n", calcularTotal(produtosSeparados));
    }

    public static double calcularTotal(String[] produtosSeparados) {
        double total = 0;

        for (String produto : produtosSeparados) {
            String[] precoSeparado = produto.split(":");
            total += Double.parseDouble(precoSeparado[1]);
        }

        return total;
    }

    public static double maiorPreco(String[] produtosSeparados) {
        double maiorPreco = 0;

        for (String produto : produtosSeparados) {
            String[] precoSeparado = produto.split(":");

            if (Double.parseDouble(precoSeparado[1]) > maiorPreco) {
                maiorPreco = Double.parseDouble(precoSeparado[1]);
            }
        }
        return maiorPreco;
    }
}
