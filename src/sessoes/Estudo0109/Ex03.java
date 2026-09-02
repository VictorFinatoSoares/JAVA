package sessoes.Estudo0109;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva um número inteiro POSITIVO: ");
        int numero = Integer.parseInt(sc.nextLine());

        mostrarTabuada(numero);

        sc.close();
    }

    public static void mostrarTabuada(int numero) {
        if (numero <= 0) {
            System.out.println("ERRO! O número precisa ser POSITIVO!");
            return;
        }

        System.out.printf("===== Tabuada do %d =====%n%n", numero);
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", numero, i, numero * i);
        }
    }
}
