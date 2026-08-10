package com.finatodev;

import java.util.Scanner;
import java.util.Arrays;

public class Game {
    public static final Scanner sc = new Scanner(System.in);
    public static boolean gameIsRunning = true;
    public static int plays = 0;
    public static void main(String[] args) {
        char[][] gameBoard = resetBoard();

        int player = 1;

        showBoard(gameBoard);

        while (gameIsRunning) {
            makeMove(gameBoard, player);
            if (player == 1) player = 2;
            else player = 1;
        }

    }

    public static char[][] resetBoard() {
        return new char[][] {
                {'*', '*', '*'},
                {'*', '*', '*'},
                {'*', '*', '*'}
        };
    }

    public static void showBoard(char[][] currentBoard) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(currentBoard[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static void makeMove(char[][] board, int currentPlayer) {
        char move = '*';

        if (currentPlayer == 1) move = 'X';
        else move = 'O';

        boolean isMoveInvalid = true;

        while (isMoveInvalid) {
            System.out.printf("Jogada do jogador %d:\n", currentPlayer);

            System.out.print("Linha da jogada: ");
            int l = sc.nextInt();

            System.out.print("Coluna da jogada: ");
            int c = sc.nextInt();

            try {
                if (board[l - 1][c - 1] == '*') {
                    board[l - 1][c - 1] = move;
                    plays++;
                    isMoveInvalid = false;
                } else System.out.println("Posição escolhida está OCUPADA, TENTE NOVAMENTE!");


            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERRO: Posição INEXISTENTE, TENTE NOVAMENTE!");
            }
        }

        showBoard(board);
        checkWinner(board, plays);

    }

    public static void checkWinner(char[][] board, int plays) {
        int winner = 0;

        // Verifica linhas
        for (int i = 0; i < 3; i++) {
            int firstPlayerPositions = 0;
            int secondPlayerPositions = 0;

            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 'X') firstPlayerPositions++;
                if (board[i][j] == 'O') secondPlayerPositions++;
            }
            if (firstPlayerPositions == 3) {
                winner = 1;
                break;
            } else if (secondPlayerPositions == 3) {
                winner = 2;
                break;
            }
        }

        // Verifica  colunas
        for (int j = 0; j < 3; j++) {
            int firstPlayerPositions = 0;
            int secondPlayerPositions = 0;

            for (int i = 0; i < 3; i++) {
                if (board[i][j] == 'X') firstPlayerPositions++;
                if (board[i][j] == 'O') secondPlayerPositions++;
            }
            if (firstPlayerPositions == 3) {
                winner = 1;
                break;
            } else if (secondPlayerPositions == 3) {
                winner = 2;
                break;
            }
        }

        int firstPlayerPositionsD1 = 0;
        int secondPlayerPositionsD1 = 0;

        int firstPlayerPositionsD2 = 0;
        int secondPlayerPositionsD2 = 0;

        // Verifica diagonal 1
        for (int i = 0; i < 3; i++) {
            if (board[i][i] == 'X') firstPlayerPositionsD1++;
            else if (board[i][i] == 'O') secondPlayerPositionsD1++;

            if (board[i][2 - i] == 'X') firstPlayerPositionsD2++;
            else if (board[i][2 - i] == 'O') secondPlayerPositionsD2++;

        }

        if (firstPlayerPositionsD1 == 3 || firstPlayerPositionsD2 == 3) winner = 1;
        else if (secondPlayerPositionsD1 == 3 || secondPlayerPositionsD2 == 3) winner = 2;

        if (winner > 0) {
            System.out.printf("O Jogador %d VENCEU!", winner);
            gameIsRunning = false;
        } else if (plays == 9) {
            System.out.println("JOGO EMPATADO!");
            gameIsRunning = false;
        }
    }
}
