package aula06;

import java.util.Scanner;

public class EX05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o preço do produto: ");
        double preco = sc.nextDouble();

        if (preco <= 0) {
            System.out.println("Preço inválido");
        } else if (preco <= 30) {
            System.out.println("Preço baixo");
        } else if (preco <= 50) {
            System.out.println("Preço médio");
        } else {
            System.out.println("Preço alto");
        }

        sc.close();
    }
}
