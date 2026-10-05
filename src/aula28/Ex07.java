package aula28;

import java.util.Scanner;

public class Ex07 {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String[] diasSemana = {"Domingo", "Segunda", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sábado"};
        double[] tempDias = new double[diasSemana.length];

        for (int i = 0; i < tempDias.length; i++) {
            tempDias[i] = lerDouble(String.format("Informe a temperatura (%s): ", diasSemana[i]));
        }

        System.out.printf("%s foi o dia com a maior temperatura! (%.2f°C)", diasSemana[diaMaisQuente(tempDias)], tempDias[diaMaisQuente(tempDias)]);
    }

    public static int diaMaisQuente(double[] temperaturas) {
        int indMaisQuente = 0;
        double tempMaisQuente = temperaturas[0];

        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > tempMaisQuente) {
                tempMaisQuente = temperaturas[i];
                indMaisQuente = i;
            }
        }

        return indMaisQuente;
    }

    public static double lerDouble(String msg) {
        double num;

        while (true) {
            try {
                System.out.printf(msg);
                num = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("ERRO: Você precisa informar um NÚMERO!");
            }
        }
        return num;
    }
}
