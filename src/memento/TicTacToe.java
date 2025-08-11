package memento;

import java.util.*;

public class TicTacToe {
    private char[][] board;
    private char currentPlayer;
    private int movesCount;
    private Deque<Memento> history = new ArrayDeque<>();

    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'X';
        movesCount = 0;
        initializeBoard();
        saveState();
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++)
            Arrays.fill(board[i], ' ');
    }

    public void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 &&
                col >= 0 && col < 3 &&
                board[row][col] == ' ';
    }

    public void makeMove(int row, int col) {
        board[row][col] = currentPlayer;
        movesCount++;
        saveState();
    }

    private void saveState() {
        char[][] boardCopy = new char[3][3];
        for (int i = 0; i < 3; i++)
            boardCopy[i] = board[i].clone();

        history.push(new Memento(boardCopy, currentPlayer, movesCount));
    }

    public boolean undo() {
        if (history.size() <= 1) {
            System.out.println("Cannot undo, no previous moves.");
            return false;
        }

        history.pop();
        Memento prev = history.peek();

        for (int i = 0; i < 3; i++)
            board[i] = prev.getBoard()[i].clone();

        currentPlayer = prev.getPlayer();
        movesCount = prev.getMovesCount();

        System.out.println("Undo successful. It's player " + currentPlayer + "'s turn now.");
        return true;
    }

    public boolean checkWin() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer &&
                    board[i][1] == currentPlayer &&
                    board[i][2] == currentPlayer)
                return true;
        }
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == currentPlayer &&
                    board[1][j] == currentPlayer &&
                    board[2][j] == currentPlayer)
                return true;
        }
        if (board[0][0] == currentPlayer &&
                board[1][1] == currentPlayer &&
                board[2][2] == currentPlayer)
            return true;

        if (board[0][2] == currentPlayer &&
                board[1][1] == currentPlayer &&
                board[2][0] == currentPlayer)
            return true;

        return false;
    }

    public boolean isDraw() {
        return movesCount == 9;
    }

    public void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    public char getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(char player) {
        this.currentPlayer = player;
    }

    public int getMovesCount() {
        return movesCount;
    }

    public void setMovesCount(int count) {
        this.movesCount = count;
    }

    public char[][] getBoard() {
        return board;
    }
}
