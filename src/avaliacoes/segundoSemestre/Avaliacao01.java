package avaliacoes.segundoSemestre;

import java.util.Scanner;

/*
    Observações do código da segunda questão: O código recebe uma palavra (string), e verifica cada linha, coluna e suas duas diagonais.
    Se o texto inserido estiver em uma das linhas, colunas ou diagonais mas não for uma palavra existente (ex: lsaso) ele ainda exibirá
    que o termo foi encontrado, decidi não usar um if grande para verificar se a palavra é uma das 5 que coloquei pois achei que seria uma
    "grande gambiarra".
    Além disso, meu caça palavra não ficou "tão embaralhado", porém independente do tamanho dele, as verificações ainda serão capazes de
    encontrar o termo escrito.
*/

public class Avaliacao01 {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        questao02();
        sc.close();
    }

    public static void questao01() {
        // Matriz com 5 alunos e 5 avaliações por aluno
        int[][] matriz = new int[5][5];

        // Preenche a matriz com valores aleatórios de 0 a 10
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 11);
            }
        }

        // Irão definir qual o valor da maior média e sua posição
        double maiorMedia = 0;
        int maiorMediaPos = 0;

        // Deixa uma linha em branco ao topo
        System.out.println();

        // Exibe a matriz inteira e calcula qual aluno possui a maior média
        for (int i = 0; i < matriz.length; i++) {
            int soma = 0; // A cada linha, a soma é inicialmente ZERO
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%3d", matriz[i][j]);
                soma += matriz[i][j]; // Acumula o valor total da linha atual
            }
            // Ao fim da linha, verifica se a média (soma total dividido pela quantidade de avaliações) é maior que a anterior
            if ((double) soma / matriz[i].length > maiorMedia) {
                maiorMedia = (double) soma / matriz.length; // Caso positivo, guarda a nova maior média
                maiorMediaPos = i;
            }
            // Ao fim da linha, pula uma linha
            System.out.println();
        }

        // Exibe o resultado
        System.out.printf("\nLinha do aluno com a maior média: %d\nSeu índice na matriz: %d\nO valor da maior média: %.2f\n", maiorMediaPos + 1, maiorMediaPos, maiorMedia);
    }
    public static void questao02() {
        // Existem 5 palavras: Anual, Carol, Antes, Curta e Dados.
        char[][] matriz = {{'C', 'A', 'C', 'D', 'L'},
                {'A', 'N', 'U', 'A', 'L'},
                {'R', 'T', 'R', 'D', 'M'},
                {'O', 'E', 'T', 'O', 'G'},
                {'L', 'S', 'A', 'S', 'O'}};

        System.out.println();

        // Exibe o caça palavras
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%3c", matriz[i][j]);
            }
            System.out.println();
        }

        // Recebe a string para procurar no caça palavras
        System.out.print("\nQual palavra você quer procurar? ");
        String palavra = sc.nextLine();

        // Verifica as linhas
        for (int i = 0; i < matriz.length; i++) {
            String palavraLinha = ""; // Após uma linha, a palavra formada nessa linha volta a ser vazia
            for (int j = 0; j < matriz[i].length; j++) {
                palavraLinha += matriz[i][j]; // Adiciona os caracteres dessa linha na string

                if (palavraLinha.equalsIgnoreCase(palavra)) { // A cada caractere adicionado, verifica se essa palavra é igual a exigida.
                    System.out.printf("A palavra %s foi encontrada na linha %d!", palavraLinha, i + 1);
                    return; // Encerra o programa
                }
            }
        }

        // Verifica as colunas
        for (int j = 0; j < matriz.length; j++) {
            String palavraColuna = ""; // Após uma coluna, a palavra formada nessa coluna volta a ser vazia
            for (int i = 0; i < matriz[j].length; i++) {
                palavraColuna += matriz[i][j]; // Adiciona os caracteres dessa coluna na string

                if (palavraColuna.equalsIgnoreCase(palavra)) { // A cada caractere adicionado verifica se essa palavra é igual a exigida.
                    System.out.printf("A palavra %s foi encontrada na coluna %d!", palavraColuna, j + 1);
                    return;
                }
            }
        }

        // Duas variáveis que controlam o que está em cada diagonal (fora do loop, pois é apenas uma diagonal para cada)
        String palavraD1 = "";
        String palavraD2 = "";

        // Verifica as diagonais
        for (int i = 0; i < matriz.length; i++) {
            // Acrescente os caracteres das respectivas diagonais as suas variaveis
            palavraD1 += matriz[i][i];
            palavraD2 += matriz[i][matriz.length - i - 1];

            // Compara as duas variveis a cada caractere adicionado, para verificar se a palavra exigida foi encontrada
            if (palavraD1.equalsIgnoreCase(palavra)) {
                System.out.printf("A palavra %s foi encontrada na diagonal principal!", palavraD1);
                return; // Encerra o programa
            }    else if (palavraD2.equalsIgnoreCase(palavra)) {
                System.out.printf("A palavra %s foi encontrada na diagonal secundária!", palavraD2);
                return; // Encerra o programa
            }
        }

        // Caso todas as verificações tenham sido feitas e o programa não foi encerrado, a palavra não foi encontrada.
        System.out.println("A palavra NÃO FOI ENCONTRADA :(");
    }

}
