package aula06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EX05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double preco;

        while (true) {
            try {
                System.out.print("Digite o preço do produto: ");
                preco = sc.nextDouble();

                if (preco <= 0) {
                    System.out.println("ERRO: O preço precisa ser maior que 0!");
                    continue;
                }

                break;
            } catch (InputMismatchException e) {
                System.out.println("ERRO: Entrada INVÁLIDA!");
                sc.nextLine();
                continue;
            }
        }

        if (preco <= 30) System.out.println("Preço baixo");
        if (preco <= 50) System.out.println("Preço médio");
        else System.out.println("Preço alto");

        sc.close();
    }
}
