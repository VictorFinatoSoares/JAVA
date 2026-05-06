import java.util.Scanner;

public class EX08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== CALCULADORA ===");
        System.out.println("1-Somar  2-Subtrair  3-Multiplicar");
        System.out.println("4-Dividir  5-Potência  6-Raiz");
        System.out.println("Outro número - Sair");
        System.out.print("Escolha: ");
        int opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.print("Digite dois valores: ");
            double x = sc.nextDouble(), y = sc.nextDouble();
            System.out.printf("Resultado: %.2f%n", x + y);
        } else if (opcao == 2) {
            System.out.print("Digite dois valores: ");
            double x = sc.nextDouble(), y = sc.nextDouble();
            System.out.printf("Resultado: %.2f%n", x - y);
        } else if (opcao == 3) {
            System.out.print("Digite dois valores: ");
            double x = sc.nextDouble(), y = sc.nextDouble();
            System.out.printf("Resultado: %.2f%n", x * y);
        } else if (opcao == 4) {
            System.out.print("Digite dois valores: ");
            double x = sc.nextDouble(), y = sc.nextDouble();
            if (y == 0)
                System.out.println("Erro: divisão por zero!");
            else
                System.out.printf("Resultado: %.2f%n", x / y);
        } else if (opcao == 5) {
            System.out.print("Base e expoente: ");
            double x = sc.nextDouble(), y = sc.nextDouble();
            System.out.printf("Resultado: %.2f%n", Math.pow(x, y));
        } else if (opcao == 6) {
            System.out.print("Digite o valor: ");
            double x = sc.nextDouble();
            if (x < 0)
                System.out.println("Erro: raiz de negativo!");
            else
                System.out.printf("Resultado: %.2f%n", Math.sqrt(x));
        } else {
            System.out.println("Saindo...");
        }

        sc.close();
    }
}
