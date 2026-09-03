package sessoes.Estudo0109;

public class Ex00 {
    public static void main(String[] args) {
        int num = Ex10.lerNumeroInteiro();

        if (numeroPar(num)) {
            System.out.printf("%d É PAR!", num);
        } else {
            System.out.printf("%d É ÍMPAR!", num);
        }
    }

    public static boolean numeroPar(int number) {
        return number  % 2 == 0;
    }
}
