package aula23;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class TheaterManager {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        // Opções disponíveis
        System.out.println("\nFilmes em cartaz:\n");
        System.out.println("1 - Batalha dos Aflitos (R$ 20,00) - Sala 1\n2 - Homem Aranha (R$ 28,00) - Sala 2\n3- O DVD do Renato Portaluppi (R$ 15,00) - Sala 3\n");

        int room = 0;

        // Valida a escolha da sala
        while (true) {
            try {
                System.out.print("Escolha o filme (1-3): ");
                room = Integer.parseInt(sc.nextLine());

                if (room < 1 || room > 3) {
                    System.out.printf("%nVocê digitou: %d%nPorém a escolha deve ser de 1 a 3.%n%n", room);
                    continue;
                }
                renderRoom(room);
                break;
            } catch (NumberFormatException e) {
                System.out.println("\nERRO: A entrada PRECISA ser um número inteiro.\n");
            } catch (NoSuchElementException e) {
                System.out.println("Entrada encerrada inesperadamente. Encerrando...");
                System.exit(0);
            }
        }
        sc.close();

    }

    public static void renderRoom(int room) {
        String movieName = "";

        int l = 0; int c = 0;

        // Define nome e quantidade de linhas e colunas dependendo da sala.
        if (room == 1) {
            movieName = "Batalha dos Aflitos";
            l = 4; c = 5;
        }  else if (room == 2) {
            movieName = "Homem Aranha";
            l = 5; c = 6;
        } else {
            movieName = "O DVD do Renato Portaluppi";
            l = 3; c = 4;
        }

        char[][] movieSeats = new  char[l][c];

        // Preenche tudo com vazio
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                movieSeats[i][j] = '.';
            }
        }

        // Adiciona alguns assentos ocupados (apenas para a lógica de validação quando comprar um assento)
        if (room == 1) {
            movieSeats[3][2] = 'x';
            movieSeats[2][1] = 'x';
        } else if (room == 3) {
            movieSeats[1][3] = 'x';
            movieSeats[2][2] = 'x';
        }


        System.out.printf("%n=== Sala %d - %s ===%n%n", room, movieName);

        // Cabeçalho das colunas
        System.out.print("   ");
        for (int j = 0; j < c; j++) {
            System.out.printf("%3d", j + 1);
        }

        System.out.println();

        // Exibe cada assento e o número da linha
        for (int i = 0; i < l; i++) {
            System.out.printf("%3d", i + 1);
            for (int j = 0; j < c; j++) {
                System.out.printf("%3c", movieSeats[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nAssentos ocupados: X\nAssentos Livres: .\n");

        buySeats(room, movieName, movieSeats, l, c);
    }

    public static void buySeats(int room, String movieName, char[][] movieSeats, int lines, int columns) {
        int qSeats = 0;
        int qOccupiedSeats = 0;
        double price = 0;

        if (room == 1) price = 20;
        else if (room == 2) price = 28;
        else price = 15;

        // Checa quantidade de assentos ocupados
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                if (movieSeats[i][j] == 'x') qOccupiedSeats++;
            }
        }

        if (qOccupiedSeats == lines * columns) {
            System.out.println("Sentimos muito, a sala está lotada!");
            return;
        }

        while (true) {
            try {
                System.out.print("Quantos assentos deseja comprar? ");
                qSeats = Integer.parseInt(sc.nextLine());

                if (qSeats <= 0 || qSeats > lines * columns - qOccupiedSeats) {
                    System.out.printf("%nVocê digitou: %d%nPorém a escolha deve ser de 1 a %d.%n%n", qSeats, lines * columns - qOccupiedSeats);
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("\nERRO: A entrada PRECISA ser um número inteiro.\n");
            } catch (NoSuchElementException e) {
                System.out.println("Entrada encerrada inesperadamente. Encerrando...");
                System.exit(0);
            }
        }

        int[][] buyedSeats = new int[qSeats][2];
        int currentSeat = 1;

        int line = 0;
        int column = 0;

        System.out.println();

        while (currentSeat <= qSeats) {
            try {
                // Line == 0 serve para verificar se deve pedir a linha de novo ou não.
                if (line == 0) {
                    System.out.printf("Assento %d - Informe a linha (1-%d): ", currentSeat, lines);
                    line = Integer.parseInt(sc.nextLine());

                    if (line <= 0 || line > lines) {
                        System.out.printf("%nVocê digitou: %d%nPorém a escolha deve ser de 1 a %d.%n%n", line, lines);
                        line = 0;
                        continue;
                    }
                }

                System.out.printf("Assento %d - Informe a coluna (1-%d): ", currentSeat, columns);
                column = Integer.parseInt(sc.nextLine());

                if (column <= 0 || column > columns) {
                    System.out.printf("%nVocê digitou: %d%nPorém a escolha deve ser de 1 a %d.%n%n", column, columns);
                    continue;
                }

                if (movieSeats[line - 1][column - 1] == 'x') {
                    System.out.printf("%nERRO: O assento (%d, %d) já está OCUPADO!%n%n", line, column);
                    line = 0;
                    continue;
                }

                buyedSeats[currentSeat - 1][0] = line;
                buyedSeats[currentSeat - 1][1] = column;
                line = 0;
                currentSeat++;
                System.out.println();

            } catch (NumberFormatException e) {
                System.out.println("\nERRO: A entrada PRECISA ser um número inteiro.\n");
            } catch (NoSuchElementException e) {
                System.out.println("Entrada encerrada inesperadamente. Encerrando...");
                System.exit(0);
            }
        }

        System.out.println("Resumo da compra:\n");
        System.out.printf("Filme: %s%nSala: %d%nAssentos escolhidos: ", movieName, room);

        for (int i = 0; i < qSeats; i++) {
            System.out.printf("(%d, %d) ", buyedSeats[i][0], buyedSeats[i][1]);
        }

        System.out.printf("%nValor total: R$ %.2f%n", price * qSeats);

        while (true) {
            try {
                System.out.print("\nConfirma a compra? (S/N): ");
                String response = sc.nextLine().toUpperCase().trim();

                if (response.isEmpty()) {
                    System.out.println("ERRO: Você PRECISA informar sua resposta (S/N)!");
                    continue;
                }

                char res = response.charAt(0);

                if (res == 'S') {
                    System.out.println("\nCompra confirmada! Ingressos emitidos:\n");
                    for (int i = 0; i < qSeats; i++) {
                        System.out.printf("- Ingresso %d: %s - Sala %d - Assento (%d, %d)%n", i + 1, movieName, room, buyedSeats[i][0], buyedSeats[i][1]);
                        movieSeats[buyedSeats[i][0] - 1][buyedSeats[i][1] - 1] = 'x';
                    }
                    break;
                } else if (res == 'N') {
                    System.out.println("Compra CANCELADA!");
                    break;
                } else System.out.println("Resposta INVÁLIDA! Tente novamente...\n");

            } catch (NoSuchElementException e) {
                System.out.println("Entrada encerrada inesperadamente. Encerrando...");
                System.exit(0);
            }
        }
        System.out.printf("%nMapa atualizado da Sala %d:%n%n", room);

        // Cabeçalho das colunas
        System.out.print("   ");
        for (int j = 0; j < columns; j++) {
            System.out.printf("%3d", j + 1);
        }

        System.out.println();

        // Exibe cada assento e o número da linha
        for (int i = 0; i < lines; i++) {
            System.out.printf("%3d", i + 1);
            for (int j = 0; j < columns; j++) {
                System.out.printf("%3c", movieSeats[i][j]);
            }
            System.out.println();
        }
    }
}
