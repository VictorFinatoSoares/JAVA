package testes;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        demonstrarStringBuilder();
    }

    public static void classificarIdade() {
        System.out.print("Por favor, informe sua idade: ");
        int idade = sc.nextInt();

        if (idade < 0) System.out.println("Idade INVÁLIDA!");
        else if (idade <= 12) System.out.printf("Você possui %d anos, logo é uma criança!", idade);
        else if (idade <= 17) System.out.printf("Você possui %d anos, logo é um ADOLESCENTE!", idade);
        else if (idade <= 64) System.out.printf("Você possui %d anos, logo é um ADULTO!", idade);
        else System.out.printf("Você possui %d anos, logo é um IDOSO!", idade);
        sc.close();


    }

    public static void calcularIMC() {
        System.out.print("Por favor, informe seu peso: ");
        double peso = sc.nextDouble();

        System.out.print("Por favor, informe sua altura: ");
        double altura = sc.nextDouble();

        if (peso <= 0 || altura <= 0) {
            System.out.println("Valor INVÁLIDO!");
            return;
        }


        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC: %.2f%n", imc);

        if (imc < 18.5) System.out.println("Você está ABAIXO DO PESO!");
        else if (imc <= 24.9) System.out.println("Você está com o PESO NORMAL!");
        else if (imc <= 29.9) System.out.println("Você está com SOBREPESO!");
        else System.out.println("Você está OBESO!");
        sc.close();

    }

    public static void sistemaLogin() {
        String usuario = "ADMIN";
        String senha = "ADMIN1234";

        int tentativas = 1;

        while (true) {
            System.out.println("Insira seu usuário: ");
            String acessoUsuario = sc.nextLine();

            System.out.println("Insira sua senha: ");
            String acessoSenha = sc.nextLine();

            if (acessoUsuario.equals(usuario) && acessoSenha.equals(senha)) {
                System.out.println("ACESSO CONCEDIDO!");
                break;
            }

            if (tentativas < 3) {
                if (acessoUsuario.equals(usuario)) System.out.println("SENHA INVÁLIDA! Tente novamente.");
                else if (acessoSenha.equals(senha)) System.out.println("USUÁRIO INVÁLIDO! Tente novamente.");
                else System.out.println("INFORMAÇÕES INVÁLIDAS! Tente novamente.");
            }

            else {
                System.out.println("ACESSO NEGADO! Encerrando sistema...");
                break;
            }

            tentativas++;

        }
        sc.close();

    }

    public static void demonstrarStringBuilder() {
        System.out.println("========== STRINGBUILDER ==========");

        // ----- Criação -----
        StringBuilder sb = new StringBuilder(); // vazio
        StringBuilder sb2 = new StringBuilder("Java"); // com valor inicial
        System.out.println("sb2 inicial: " + sb2);

        // ----- append() -----
        sb.append("Java");
        sb.append(" é");
        sb.append(" muito");
        sb.append(" legal");
        System.out.println("Depois de append(): " + sb);

        // append encadeado (method chaining)
        StringBuilder encadeado = new StringBuilder();
        encadeado.append("1").append(" - ").append("2").append(" - ").append("3");
        System.out.println("Append encadeado: " + encadeado);

        // append de tipos diferentes (int, char, boolean, double)
        StringBuilder tipos = new StringBuilder();
        tipos.append(10).append(" ").append('A').append(" ").append(true).append(" ").append(3.14);
        System.out.println("Append de tipos variados: " + tipos);

        // ----- insert() -----
        StringBuilder ins = new StringBuilder("Java");
        ins.insert(0, "Eu amo ");
        System.out.println("Depois de insert(): " + ins);

        // ----- delete() -----
        StringBuilder del = new StringBuilder("Eu amo Java");
        del.delete(0, 7); // remove "Eu amo "
        System.out.println("Depois de delete(0,7): " + del);

        // ----- deleteCharAt() -----
        StringBuilder delChar = new StringBuilder("Javva");
        delChar.deleteCharAt(3); // remove o "v" extra
        System.out.println("Depois de deleteCharAt(3): " + delChar);

        // ----- replace() -----
        StringBuilder rep = new StringBuilder("Eu gosto de C++");
        rep.replace(11, 15, "Java");
        System.out.println("Depois de replace(11,15,\"Java\"): " + rep);

        // ----- reverse() -----
        StringBuilder rev = new StringBuilder("Java");
        rev.reverse();
        System.out.println("Depois de reverse(): " + rev);

        // ----- charAt() e setCharAt() -----
        StringBuilder cAt = new StringBuilder("Java");
        char c = cAt.charAt(0);
        System.out.println("charAt(0): " + c);
        cAt.setCharAt(0, 'L');
        System.out.println("Depois de setCharAt(0,'L'): " + cAt);

        // ----- length() -----
        StringBuilder len = new StringBuilder("Java");
        System.out.println("length(): " + len.length());

        // ----- indexOf() -----
        StringBuilder idx = new StringBuilder("Java é legal");
        System.out.println("indexOf(\"legal\"): " + idx.indexOf("legal"));

        // ----- substring() -----
        StringBuilder sub = new StringBuilder("Java é legal");
        String parte = sub.substring(0, 4);
        System.out.println("substring(0,4): " + parte);

        // ----- capacity() -----
        StringBuilder cap = new StringBuilder();
        System.out.println("capacity() inicial (padrão 16): " + cap.capacity());

        // ----- toString() -----
        StringBuilder ts = new StringBuilder("Convertendo para String");
        String resultado = ts.toString();
        System.out.println("toString(): " + resultado);

        // ----- Exemplo prático: verificar palíndromo -----
        String palavra = "arara";
        StringBuilder original = new StringBuilder(palavra);
        StringBuilder invertida = new StringBuilder(palavra).reverse();
        boolean ehPalindromo = original.toString().equals(invertida.toString());
        System.out.println("\"" + palavra + "\" é palíndromo? " + ehPalindromo);
    }

    public static void demonstrarStringTokenizer() {
        System.out.println("========== STRINGTOKENIZER ==========");

        // ----- Construtor padrão (delimitador = espaço, tab, \n) -----
        StringTokenizer st1 = new StringTokenizer("Java é muito legal");
        System.out.println("Tokenizer padrão (delimitador = espaço):");
        while (st1.hasMoreTokens()) {
            System.out.println("  -> " + st1.nextToken());
        }

        // ----- Construtor com delimitador customizado -----
        StringTokenizer st2 = new StringTokenizer("maca,banana,uva", ",");
        System.out.println("\nTokenizer com delimitador ',':");
        while (st2.hasMoreTokens()) {
            System.out.println("  -> " + st2.nextToken());
        }

        // ----- Múltiplos delimitadores -----
        StringTokenizer st3 = new StringTokenizer("3;7 9,2", ";, ");
        System.out.println("\nTokenizer com múltiplos delimitadores (';', ',', ' '):");
        while (st3.hasMoreTokens()) {
            System.out.println("  -> " + st3.nextToken());
        }

        // ----- countTokens() -----
        StringTokenizer st4 = new StringTokenizer("1 2 3 4 5");
        System.out.println("\ncountTokens() antes de consumir: " + st4.countTokens());
        st4.nextToken();
        st4.nextToken();
        System.out.println("countTokens() depois de consumir 2: " + st4.countTokens());

        // ----- hasMoreTokens() em condição de parada manual -----
        StringTokenizer st5 = new StringTokenizer("um dois tres");
        System.out.println("\nConsumindo manualmente com hasMoreTokens():");
        while (st5.hasMoreTokens()) {
            String token = st5.nextToken();
            System.out.println("  Token atual: " + token);
        }

        // ----- Exemplo prático: somar números de uma linha -----
        String linhaNumeros = "10 20 30 40";
        StringTokenizer stSoma = new StringTokenizer(linhaNumeros);
        int soma = 0;
        while (stSoma.hasMoreTokens()) {
            soma += Integer.parseInt(stSoma.nextToken());
        }
        System.out.println("\nSoma dos números em \"" + linhaNumeros + "\": " + soma);
    }

    public static void demonstrarArraysUnidimensionais() {
        System.out.println("========== ARRAYS (1D) ==========");

        // ----- toString() -----
        int[] nums = {5, 2, 8, 1};
        System.out.println("Sem Arrays.toString(): " + nums); // endereço de memória
        System.out.println("Com Arrays.toString(): " + Arrays.toString(nums));

        // ----- sort() completo -----
        int[] paraOrdenar = {5, 2, 8, 1, 9, 3};
        Arrays.sort(paraOrdenar);
        System.out.println("Depois de sort(): " + Arrays.toString(paraOrdenar));

        // ----- sort() com intervalo -----
        int[] paraOrdenarParcial = {5, 2, 8, 1, 9, 3};
        Arrays.sort(paraOrdenarParcial, 1, 4); // ordena só índices 1,2,3
        System.out.println("Depois de sort(1,4): " + Arrays.toString(paraOrdenarParcial));

        // ----- fill() -----
        int[] preenchido = new int[5];
        Arrays.fill(preenchido, 7);
        System.out.println("Depois de fill(7): " + Arrays.toString(preenchido));

        // ----- fill() com intervalo -----
        int[] preenchidoParcial = new int[5];
        Arrays.fill(preenchidoParcial, 1, 3, 9); // preenche só índices 1 e 2
        System.out.println("Depois de fill(1,3,9): " + Arrays.toString(preenchidoParcial));

        // ----- copyOf() -----
        int[] original = {1, 2, 3};
        int[] copiaMaior = Arrays.copyOf(original, 5);
        int[] copiaMenor = Arrays.copyOf(original, 2);
        System.out.println("copyOf maior: " + Arrays.toString(copiaMaior));
        System.out.println("copyOf menor: " + Arrays.toString(copiaMenor));

        // ----- copyOfRange() -----
        int[] base = {1, 2, 3, 4, 5};
        int[] trecho = Arrays.copyOfRange(base, 1, 4);
        System.out.println("copyOfRange(1,4): " + Arrays.toString(trecho));

        // ----- equals() vs == -----
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        System.out.println("a == b: " + (a == b));
        System.out.println("Arrays.equals(a,b): " + Arrays.equals(a, b));

        // ----- binarySearch() -----
        int[] ordenado = {1, 2, 5, 8, 13};
        int posicaoEncontrada = Arrays.binarySearch(ordenado, 8);
        int posicaoNaoEncontrada = Arrays.binarySearch(ordenado, 4);
        System.out.println("binarySearch(8): " + posicaoEncontrada);
        System.out.println("binarySearch(4) [não existe]: " + posicaoNaoEncontrada); // valor negativo

        // ----- asList() (cuidado: lista de tamanho fixo) -----
        Integer[] objArray = {10, 20, 30};
        var lista = Arrays.asList(objArray);
        System.out.println("Arrays.asList(): " + lista);

        // ----- Exemplo prático: maior e menor elemento usando sort -----
        int[] valores = {23, 4, 67, 12, 89, 1};
        int[] copiaParaOrdenar = Arrays.copyOf(valores, valores.length);
        Arrays.sort(copiaParaOrdenar);
        System.out.println("\nArray original: " + Arrays.toString(valores));
        System.out.println("Menor valor: " + copiaParaOrdenar[0]);
        System.out.println("Maior valor: " + copiaParaOrdenar[copiaParaOrdenar.length - 1]);
    }

    public static void demonstrarArraysBidimensionais() {
        System.out.println("========== ARRAYS (2D / MATRIZES) ==========");

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // ----- toString() comum NÃO funciona bem em matriz -----
        System.out.println("Com Arrays.toString() (errado p/ matriz): " + Arrays.toString(matriz));

        // ----- deepToString() -----
        System.out.println("Com Arrays.deepToString() (correto): " + Arrays.deepToString(matriz));

        // ----- deepEquals() -----
        int[][] matriz2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Arrays.equals(matriz, matriz2): " + Arrays.equals(matriz, matriz2)); // false! (compara só as referências das linhas)
        System.out.println("Arrays.deepEquals(matriz, matriz2): " + Arrays.deepEquals(matriz, matriz2)); // true (compara conteúdo de verdade)

        // ----- percorrendo e somando todos os elementos -----
        int soma = 0;
        for (int[] linha : matriz) {
            for (int valor : linha) {
                soma += valor;
            }
        }
        System.out.println("Soma de todos os elementos da matriz: " + soma);
    }
}
