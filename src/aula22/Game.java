package aula22;

import java.util.Scanner; // Obter entrada
import java.util.InputMismatchException; // Validar erros de entrada

public class Game {
    // Variáveis Globais
    public static final Scanner sc = new Scanner(System.in);
    public static boolean isGameRunning = true; // Variável que controla a execução do jogo
    public static boolean matchEnded = false; // Variável que controla o fim de cada partida
    public static int currentPlayer = 1; // Variável que controla o turno de cada jogador
    public static int movesPlayed; // Variável que conta quantas rodadas passaram em cada partida
    public static String playerOneName = ""; // Variável que guarda o nome do jogador um
    public static String playerTwoName = ""; // Variável que guarda o nome do jogador dois
    public static int playerOneWins = 0; // Variável que guarda a quantia de vitórias do jogador um
    public static int playerTwoWins = 0; // Variável que guarda a quantidade de vitórias do jogador dois
    public static int currentMatch = 1; // Variável que controla a partida atual

    static void main() {
        System.out.println("\n==== Jogo INICIADO: Partida 1 ===="); // Mensagem inicial

        // Inicia o jogo pela primeira vez
        int dimension = startGame(); // Obtém a dimensão vinda do startGame()
        char[][] gameBoard = resetBoard(dimension); // Preenche o tabuleiro com * (vazio) já com a dimensão informada

        // Dinâmica do jogo enquanto rodando:
        while (isGameRunning) {
            renderBoard(gameBoard); // Renderiza o tabuleiro a cada rodada
            playerMoves(dimension, gameBoard); // Lógica para obter (já validando) a jogada do jogador
            verifyResult(dimension, gameBoard); // Verifica a cada rodada se houve vencedor ou empate

            if (matchEnded) { // Quando a PARTIDA acabar, verifica se deve continuar jogando
                if (keepPlaying()) {
                    // Reinicia o jogo
                    System.out.printf("\n\n==== JOGO INICIADO: PARTIDA %d ====\n\n", currentMatch); // Reenvia mensagem inicial
                    dimension = startGame();
                    gameBoard = resetBoard(dimension);
                } else isGameRunning = false; // Encerra o jogo
            }
        }

        System.out.println("\n\nFoi bom enquanto durou... até mais! :("); // Mensagem dramática quando encerrar o jogo
    }

    // Função que começa a logística de cada partida no jogo
    public static int startGame() {
        // Reinicia as variáveis necessárias após o fim de uma partida:
        movesPlayed = 0; // Zera as rodadas
        matchEnded = false; // A partida não acabou
        currentPlayer = 1; // O jogador um sempre começa

        if (currentMatch == 1) { // Se estiver na primeira parte, pede o nome de cada jogador (já valida se realmente algo foi escrito)
            System.out.println();
            while (playerOneName.isEmpty()) {
                System.out.print("Insira o nome do Jogador 1: ");
                playerOneName = sc.nextLine().trim();

                if (playerOneName.isEmpty()) System.out.println("Digite o nome!\n");

            }

            while (playerTwoName.isEmpty()) {
                System.out.print("Insira o nome do Jogador 2: ");
                playerTwoName = sc.nextLine().trim();

                if (playerTwoName.isEmpty()) System.out.println("Digite o nome!\n");

            }
        }


        int n = 0;

        // Loop que vai perguntar ao usuário a dimensão do tabuleiro enquanto essa dimensão for menor que três
        while (n < 3) {
            try { // Vai tentar obter a dimensão vinda do input
                System.out.print("\nInforme a dimensão do tabuleiro: ");
                n = sc.nextInt();
                if (n < 3) // Se o usuário responder de forma válida, porém com uma dimensão menor que três, retorna um aviso.
                    System.out.printf("Você digitou: %d%nVocê precisa informar uma dimensão maior ou igual que 3.%n%n", n);

                // Se houver erro de entrada (capturar outro tipo que não seja int), retorna o erro ao usuário sem quebrar o código
            } catch (InputMismatchException e) {
                System.out.println("ERRO: Entrada precisa ser um NÚMERO INTEIRO!");
                sc.nextLine();
            }
        }

        // Após validação, retorna a dimensão que o usuário informou
        return n;
    }

    // Função que reinicia o tabuleiro para cada partida
    public static char[][] resetBoard(int dimensions) {
        // Com base nas dimensões vindas de startGame(), cria uma matriz com essa proporção
        char[][] emptyBoard = new char[dimensions][dimensions];

        // Realiza um for, preenchendo cada posição da matriz com * (vazio)
        for (int i = 0; i < dimensions; i++) {
            for (int j = 0; j < dimensions; j++) {
                emptyBoard[i][j] = '*';
            }
        }

        // Retorna essa matriz vazia pronta para começar o jogo.
        return emptyBoard;
    }

    // Função que renderiza o tabuleiro para cada rodada
    public static void renderBoard(char[][] currentBoard) {
        // Cria uma linha vazia antes de exibir o tabuleiro (questão puramente estética)
        System.out.println();

        // Usa um for para exibir o tabuleiro
        for (char[] chars : currentBoard) {
            for (int j = 0; j < currentBoard.length; j++) {
                System.out.print(chars[j] + " | "); // Exibe a linha separando os elementos com "|"
            }
            // Depois de uma linha pula para a próxima
            System.out.println();
        }

        // Cria uma linha vazia antes de exibir o tabuleiro (outra questão puramente estética)
        System.out.println();
    }

    // Função que recebe e valida a jogada dos jogadores durante cada rodada
    public static void playerMoves(int dimensions, char[][] currentBoard) {
        char moveSymbol; // Inicia uma variável que controla qual símbolo será usado
        String currentPlayerName; // Inicia uma variável que define o nome do jogador atual

        // Define essas variáveis dependendo do jogador atual (variável global)
        if (currentPlayer == 1) {
            currentPlayerName = playerOneName;
            moveSymbol = 'X';
        }
        else {
            currentPlayerName = playerTwoName;
            moveSymbol = 'O';
        }

        // Define as linhas e colunas como sendo o mesmo valor da dimensão (valor inicial irrelevante)
        int r = dimensions;
        int c = dimensions;

        // Define todas as validações como falsas inicialmente
        boolean isRowValid = false;
        boolean isColumnValid = false;
        boolean playValid = false;

        // Mensagem de exibição com a rodada e turno atual.
        System.out.printf("[RODADA: %d] Vez do Jogador(a): %s%n%n", movesPlayed + 1, currentPlayerName);

        // Enquanto uma validação ainda não estiver concluída
        while (!isRowValid || !isColumnValid || !playValid) {
            try { // Tentará
                if (!isRowValid) { // Caso a linha informada seja inválida
                    // Pede a linha ao usuário
                    System.out.printf("Informe a linha da jogada (1-%d): ", dimensions);
                    r = sc.nextInt();

                    // Verifica se a linha é maior ou igual a 1 e não é maior que a dimensão
                    isRowValid = (r >= 1 && r <= dimensions);

                    // Se a validação ainda não for atendida
                    if (!isRowValid)
                        // Avisa o usuário que terá que informar novamente.
                        System.out.printf("Você informou a linha %d...%nMas ela é INVÁLIDA para as dimensões informadas (%dx%d).%n%n", r, dimensions, dimensions);

                } else if (!isColumnValid) { // Caso contrário, se a coluna informada for inválida
                    // Pede a coluna ao usuário
                    System.out.printf("Informe a coluna da jogada (1-%d): ", dimensions);
                    c = sc.nextInt();

                    // Verifica se a coluna é maior ou igual a 1 e não é maior que a dimensão
                    isColumnValid = (c >= 1 && c <= dimensions);

                    // Se a coluna ainda não for válida:
                    if (!isColumnValid)
                        System.out.printf("Você informou a coluna %d...%nMas ela é INVÁLIDA para as dimensões informadas (%dx%d).%n%n", c, dimensions, dimensions);

                } else { // Se ambas estiverem válidas
                    if (currentBoard[r - 1][c - 1] == '*') { // Se a posição escolhida estiver desocupada
                        currentBoard[r - 1][c - 1] = moveSymbol; // Aplica a jogada do jogador
                        movesPlayed++; // Aumenta a quantidade de lances feitos (rodadas)
                        playValid = true; // Valida a jogada (para sair do loop)
                    } else { // Se a posição já estiver ocupada:
                        // Informa ao usuário
                        System.out.printf("%nERRO NA JOGADA: A posição é válida, mas já estava ocupada pelo seguinte caractere: %c%n%n", currentBoard[r - 1][c - 1]);

                        // Remove as validações de linha e coluna para o usuário tentar novamente
                        isRowValid = false;
                        isColumnValid = false;
                    }
                }


            // Caso haja um valor de entrada
            } catch (InputMismatchException e) {
                // Retorna ao usuário
                System.out.println("ERRO: A entrada precisa ser um NÚMERO INTEIRO!");
                sc.nextLine(); // Limpa o buffer do scanner
            }

        }

        // Ao final da rodada, passa a vez para o próximo jogador
        if (currentPlayer == 1) currentPlayer = 2;
        else currentPlayer = 1;

    }

    // Função que verifica o tabuleiro procurando pelo resultado ao fim de cada jogada
    public static void verifyResult(int dimension, char[][] currentBoard) {
        int winner = 0; // Define o vencedor como 0 (ninguém)

        // Verifica as linhas
        for (int i = 0; i < dimension; i++) {
            int playerOnePositions = 0;
            int playerTwoPositions = 0;
            for (int j = 0; j < dimension; j++) {
                // Verifica quantos símbolos de ambos os jogadores estão na linha a ser verificada
                if (currentBoard[i][j] == 'X') playerOnePositions++;
                else if (currentBoard[i][j] == 'O') playerTwoPositions++;
            }

            // Se em uma dessas linhas forem encontrados a mesma quantidade de símbolos que a dimensão, o jogador completou a linha (venceu)
            if (playerOnePositions == dimension) winner = 1;
            if (playerTwoPositions == dimension) winner = 2;
        }

        // Verifica as colunas com a mesma lógica da linha, apenas invertendo o for (I,J) -> (J,I)
        for (int j = 0; j < dimension; j++) {
            int playerOnePositions = 0;
            int playerTwoPositions = 0;
            for (int i = 0; i < dimension; i++) {
                if (currentBoard[i][j] == 'X') playerOnePositions++;
                else if (currentBoard[i][j] == 'O') playerTwoPositions++;
            }

            if (playerOnePositions == dimension) winner = 1;
            if (playerTwoPositions == dimension) winner = 2;

        }

        // Verifica as diagonais

        // Variáveis de posição da primeira diagonal
        int playerOnePositionsD = 0;
        int playerTwoPositionsD = 0;

        // Variáveis de posição da segunda diagonal
        int playerOnePositionsD2 = 0;
        int playerTwoPositionsD2 = 0;

        for (int i = 0; i < dimension; i++) {
            // Verifica quantas posições foram preenchidas por cada jogador na primeira diagonal
            if (currentBoard[i][i] == 'X') playerOnePositionsD++;
            else if (currentBoard[i][i] == 'O') playerTwoPositionsD++;

            // Verifica quantas posições foram preenchidas por cada jogador na segunda diagonal
            if (currentBoard[dimension - 1 - i][i] == 'X') playerOnePositionsD2++;
            else if (currentBoard[dimension - 1 - i][i] == 'O') playerTwoPositionsD2++;

            // Verifica se o jogador 1 ocupou toda a primeira ou segunda diagonal
            if (playerOnePositionsD == dimension || playerOnePositionsD2 == dimension) winner = 1;

            // Verifica se o jogador 2 ocupou toda a primeira ou segunda diagonal
            else if (playerTwoPositionsD == dimension || playerTwoPositionsD2 == dimension) winner = 2;
        }

        if (winner > 0) { // Se houve vencedor
            String winnerName; // Define o nome do vencedor
            // Aumenta a quantidade de vitórias de cada
            if (winner == 1) {
                winnerName = playerOneName;
                playerOneWins++;
            }
            else {
                winnerName = playerTwoName;
                playerTwoWins++;
            }

            renderBoard(currentBoard); // Renderiza o tabuleiro pela última vez na partida
            System.out.printf("%s VENCEU!%n%n", winnerName); // Exibe mensagem de vitória
            matchEnded = true; // Encerra a partida atual
        } else if (movesPlayed == (dimension * dimension)) { // Se não houve o vencedor, e todas as rodadas acabaram
            renderBoard(currentBoard); // Renderiza o tabuleiro pela última vez
            // Exibe mensagem de empate
            System.out.println("\nA última rodada acabou, e não houve vencedores...\nResultado Final: Empate!\n");
            matchEnded = true; // Encerra a partida atual
        }
    }

    // Função que permite iniciar outra partida após o término de uma
    public static boolean keepPlaying() {
        sc.nextLine(); // Limpa o buffer antes de receber uma string

        while (true) { // Pede ao usuário se ele quer continuar jogando X para Sim e O para Não até ele informar um dos dois
            System.out.print("Vamos para a próxima partida? (X para SIM e O para NÃO) ");
            String r = sc.nextLine().toUpperCase();

            switch (r) {
                case "" -> System.out.println("Você precisa digitar algo!\n");  // Valida se o usuário digitou algo
                case "X" -> {
                    currentMatch++;
                    return true; // Em caso positivo retorna true
                }
                case "O" -> {
                    showStats();
                    return false; // Em caso negativo retorna false
                }
                default ->  // Se a resposta não for válida, retorna erro ao usuário
                        System.out.println("\nERRO: Resposta INVÁLIDA! Digite S (Sim) ou N (Não).\n");
            }



        }
    }

    // Função que pouco antes do programa encerrar, exibe as estatísticas (por diversão)
    public static void showStats() {
        System.out.println("\n======== ESTATÍSTICAS ========\n");

        System.out.printf("%s venceu %d vezes.%n%s venceu %d vezes.%n%nHouveram um total de %d empates!", playerOneName, playerOneWins, playerTwoName, playerTwoWins, currentMatch - (playerOneWins + playerTwoWins));
    }
}
