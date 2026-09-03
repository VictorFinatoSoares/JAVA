package sessoes.Estudo0109;


public class Ex11 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("""
   
                    ====== Menu ======
                    
                    (1) Verificar se um número é par
                    (2) Calcular fatorial de um número
                    (3) Mostrar tabuada de um número
                    (4) Calcular média de um array
                    (5) Encerrar programa
                    """);

            int opcao = Ex10.lerNumeroInteiro();

            // Continua conforme o que foi escolhido
            if (opcao == 1) {
                Ex00.main(args);
            } else if (opcao == 2) {
                Ex04.main(args);
            } else if (opcao == 3) {
                Ex03.main(args);
            } else if (opcao == 4) {
                int n = Ex10.lerNumeroInteiroPositivo();
                int[] array = Ex07.preencherArray(n);

                Ex07.mediaArray(array);
            } else if (opcao == 5) {
                System.out.println("Encerrando programa...");
                break;
            } else {
                System.out.println("Desculpe! Essa opção não existe!");
            }
        }
    }
}
