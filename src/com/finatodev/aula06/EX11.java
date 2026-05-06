import java.util.Scanner;

public class EX11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Preço do produto: R$ ");
        double preco = sc.nextDouble();
        System.out.print("Quantidade: ");
        int qtd = sc.nextInt();

        double total = preco * qtd;
        System.out.printf("Total: R$ %.2f%n", total);

        sc.close();
    }
}
