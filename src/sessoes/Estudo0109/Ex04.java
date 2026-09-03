package sessoes.Estudo0109;

public class Ex04 {
    public static void main(String[] args) {
        int numero = Ex10.lerNumeroInteiroNaoNegativo();
        System.out.printf("O fatorial de %d é %d", numero, calcularFatorial(numero));
    }

    public static int calcularFatorial(int numero) {
        int fatorial = 1;

        for (int i = 1; i <= numero; i++ ) {
            fatorial *= i;
        }

        return fatorial;
    }
}
