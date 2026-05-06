package aula06;

import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        char letra = sc.next().toLowerCase().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i'
         || letra == 'o' || letra == 'u') {
            System.out.println("É uma VOGAL.");
        } else {
            System.out.println("É uma CONSOANTE.");
        }

        sc.close();
    }
}
