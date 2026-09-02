package sessoes.Estudo0109;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva um número inteiro POSITIVO: ");
        int numero = Integer.parseInt(sc.nextLine());

        if (calcularFatorial(numero) > 0) {
            System.out.printf("O fatorial de %d é %d", numero, calcularFatorial(numero));
        }

        sc.close();
    }

    public static int calcularFatorial(int numero) {
        if (numero <= 0) {
            System.out.println("ERRO! O número precisa ser POSITIVO!");
            return -1;
        }

        int fatorial = 1;

        for (int i = 1; i <= numero; i++ ) {
            fatorial *= i;
        }

        return fatorial;
    }
}
