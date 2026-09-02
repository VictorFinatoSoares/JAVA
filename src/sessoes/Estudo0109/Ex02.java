package sessoes.Estudo0109;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a primeira nota do estudante: ");
        int nota1 = Integer.parseInt(sc.nextLine());

        System.out.print("Informe a segunda nota do estudante: ");
        int nota2 = Integer.parseInt(sc.nextLine());

        exibirResultado(calcularMedia(nota1, nota2));

        sc.close();
    }

    public static double calcularMedia(int primeiraNota, int segundaNota) {
        return (double) (primeiraNota + segundaNota) / 2;
    }

    public static void exibirResultado(double media) {
        System.out.printf("Média: %.2f%nSituação: ", media);

        if (media >= 7) {
            System.out.println("APROVADO!");
        } else if (media >= 5) {
            System.out.println("RECUPERAÇÃO!");
        } else {
            System.out.println("REPROVADO!");
        }
    }
}
