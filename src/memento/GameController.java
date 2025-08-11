package memento;

import java.util.Arrays;
import java.util.Scanner;

public class GameController {
    private TicTacToe game;
    private CareTaker caretaker;

    public GameController() {
        game = new TicTacToe();
        caretaker = new CareTaker();
        caretaker.saveState(new Memento(copyBoard(game.getBoard()), game.getCurrentPlayer(), game.getMovesCount()));
    }

    private char[][] copyBoard(char[][] original) {
        char[][] copy = new char[3][3];
        for (int i = 0; i < 3; i++) {
            copy[i] = original[i].clone();
        }
        return copy;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Tic-Tac-Toe with Undo!");
        game.printBoard();

        while (true) {
            System.out.println("Player " + game.getCurrentPlayer() + ", enter your move (row and column: 0 1 2), or 'u' to undo:");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("u")) {
                Memento prevState = caretaker.undo();
                if (prevState != null) {
                    restoreState(prevState);
                    game.printBoard();
                }
                continue;
            }

            String[] parts = input.trim().split("\\s+");
            if (parts.length != 2) {
                System.out.println("Invalid input, please enter row and column separated by space.");
                continue;
            }

            int row, col;
            try {
                row = Integer.parseInt(parts[0]);
                col = Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter numbers.");
                continue;
            }

            if (!game.isValidMove(row, col)) {
                System.out.println("Invalid move, try again.");
                continue;
            }

            game.makeMove(row, col);
            caretaker.saveState(new Memento(copyBoard(game.getBoard()), game.getCurrentPlayer(), game.getMovesCount()));

            game.printBoard();

            if (game.checkWin()) {
                System.out.println("Player " + game.getCurrentPlayer() + " wins! Congratulations!");
                break;
            } else if (game.isDraw()) {
                System.out.println("The game is a draw!");
                break;
            }

            game.switchPlayer();
        }

        scanner.close();
    }

    private void restoreState(Memento memento) {
        for (int i = 0; i < 3; i++) {
            game.getBoard()[i] = memento.getBoard()[i].clone();
        }
        game.setCurrentPlayer(memento.getPlayer());
        game.setMovesCount(memento.getMovesCount());
    }

    public static void main(String[] args) {
        new GameController().play();
    }
}

