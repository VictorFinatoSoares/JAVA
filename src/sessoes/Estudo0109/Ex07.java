package sessoes.Estudo0109;

public class Ex07 {
    public static void main(String[] args) {
        int n = Ex10.lerNumeroInteiroPositivo();

        int[] meuArray = preencherArray(n);

        menorValorArray(meuArray);
        maiorValorArray(meuArray);
        mediaArray(meuArray);
    }

    public static int[] preencherArray(int dimensao) {
        int[] arrayPreenchido =  new int[dimensao];

        for (int i = 0; i < arrayPreenchido.length; i++) {
            arrayPreenchido[i] = Ex10.lerNumeroInteiro();
        }

        return arrayPreenchido;
    }

    public static void menorValorArray(int[] array) {
        int menor = array[0];

        for (int i : array) {
            if (i < menor) {
                menor = i;
            }
        }

        System.out.printf("O menor elemento é: %d%n", menor);
    }

    public static void maiorValorArray(int[] array) {
        int maior = array[0];

        for (int i : array) {
            if (i > maior) {
                maior = i;
            }
        }

        System.out.printf("O maior elemento é: %d%n", maior);
    }

    public static void mediaArray(int[] array) {
        int soma = 0;

        for (int i: array) {
            soma += i;
        }

        System.out.printf("A média dos elementos do array é %.2f%n", (double) soma / array.length);
    }
}
