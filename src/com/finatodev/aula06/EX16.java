import java.util.Scanner;

public class EX16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jogador 1, escolha (P=par / I=ímpar): ");
        char opcao = sc.next().toUpperCase().charAt(0);
        System.out.print("Jogador 1, seu número: ");
        int v1 = sc.nextInt();
        System.out.print("Jogador 2, seu número: ");
        int v2 = sc.nextInt();

        int soma = v1 + v2;

        if ((soma % 2 == 0 && opcao == 'P')
         || (soma % 2 != 0 && opcao == 'I')) {
            System.out.println("Soma = " + soma + " | JOGADOR 1 VENCEU!");
        } else {
            System.out.println("Soma = " + soma + " | JOGADOR 2 VENCEU!");
        }

        sc.close();
    }
}
