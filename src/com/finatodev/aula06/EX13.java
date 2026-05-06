import java.util.Scanner;

public class EX13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua senha: ");
        int senha = sc.nextInt();

        if (senha == 9876) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Senha incorreta!");
        }

        sc.close();
    }
}
