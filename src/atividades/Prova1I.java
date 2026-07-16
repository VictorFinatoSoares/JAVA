package atividades;

import java.util.Scanner;
import java.util.Arrays;

public class Prova1I {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ex01();
        sc.close();
    }

    public static void ex01() {
        System.out.print("Quantas partidas jogadas? ");
        int partidas = Integer.parseInt(sc.nextLine());

        int joaoTotal = 0;
        int amigoTotal = 0;

        int joaoVitorias = 0;
        int amigoVitorias = 0;


        for (int i = 0; i < partidas; i++) {
            System.out.printf("Placar da partida (%d): ", i + 1);
            String placar = sc.nextLine().trim();
            String[] pontos = placar.split("x");

            joaoTotal += Integer.parseInt(pontos[0]);
            amigoTotal += Integer.parseInt(pontos[1]);

            if (Integer.parseInt(pontos[0]) == 11) joaoVitorias++;
            else amigoVitorias++;

        }

        double mediaJoao = (double) joaoTotal / partidas;
        double mediaAmigo = (double) amigoTotal / partidas;

        System.out.printf("Pontos de Fulano: %d%nPontos do Amigo: %d%n", joaoTotal, amigoTotal);
        System.out.printf("Média de pontos por partida - Fulano: %.2f | Amigo: %.2f%n", mediaJoao, mediaAmigo);
        System.out.printf("Foi melhor de %d%n", partidas);

        if (joaoVitorias > amigoVitorias) System.out.printf("Fulano ganhou a melhor de %d", partidas);
        else System.out.printf("Fulano não ganhou a melhor de %d", partidas);
    }

    public static void ex02() {
        System.out.println("Digite a palavra: ");
        String palavra = sc.nextLine().replace(" " , "").toLowerCase();

        StringBuilder palavraInversa =   new StringBuilder(palavra).reverse();

        if (palavraInversa.equals(palavraInversa)) System.out.println("É palíndromo!");
        else System.out.println("Não é palíndromo!");
    }

    public static void ex03() {
        System.out.println("Informe o tamanho do array: ");
        int tamanho = sc.nextInt();

        int[] meuArray = new int[tamanho];
        int n = 0;
        int soma = 0;

        for (int i = 0; i < meuArray.length; i++) {
            System.out.printf("Digite o número [%d]: ", i + 1);
            n = sc.nextInt();
            while (n <= 0 || n % 2 == 0) {
                System.out.printf("Digite o número [%d]: ", i + 1);
                n = sc.nextInt();
            }
            meuArray[i] = n;
        }

        for (int i: meuArray) {
            soma += i;
        }

        double media = (double) soma / meuArray.length;
        System.out.printf("Média: %.2f%n", media);
        for (int i : meuArray) {
            if (i > media) System.out.println(i);
        }
    }

    public static void ex04() {
        System.out.println("Digite a palavra: ");
        String palavra = sc.nextLine().toLowerCase();
        System.out.println(palavra.replace("r", "l"));
    }

    public static void ex05() {
        String[] palavras = {"MAR", "PAI", "SOL", "MEL", "RIO", "PAZ", "LAR", "FEL",
                "MAO", "VOO", "ASA", "LUA", "XIS", "SAL", "BOI", "OVO",
                "ERA", "LUZ", "TOM", "PES"};

        for (int i = 0; i < 20; i++) {
            String linha = sc.nextLine().trim();

            String[] partes = linha.split("\\s+");
            String letras = partes[0];
            String numeros = partes[1];

            String resultadoPalavra = "nenhuma palavra encontrada";
            for (String palavra : palavras) {
                if (letras.equals(palavra)) {
                    resultadoPalavra = "encontrou a palavra \"" + palavra + "\"";
                    break;
                }
            }

            String resultadoModelo;

            if (numeros.length() != 4) {
                resultadoModelo = "formato invalido";
            } else {
                boolean todosDigitos = true;
                for (int j = 0; j < 4; j++) {
                    char c = numeros.charAt(j);
                    if (!Character.isDigit(c)) {
                        todosDigitos = false;
                        break;
                    }
                }

                if (todosDigitos) {
                    resultadoModelo = "modelo antigo";
                } else {
                    boolean padraoNovo = true;
                    for (int j = 0; j < 4; j++) {
                        char c = numeros.charAt(j);
                        if (j == 1) {
                            if (!Character.isUpperCase(c) || !Character.isLetter(c)) {
                                padraoNovo = false;
                                break;
                            }
                        } else {
                            if (!Character.isDigit(c)) {
                                padraoNovo = false;
                                break;
                            }
                        }
                    }

                    resultadoModelo = padraoNovo ? "modelo novo" : "formato invalido";
                }
            }

            System.out.println(letras + " " + numeros + ": " + resultadoPalavra + " | " + resultadoModelo);
        }

        sc.close();
    }
}
