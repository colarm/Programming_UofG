package week4;

import java.util.Scanner;

public class nacGame {
    private char[][] checkerBoard = new char[3][3];
    private int stepCount;

    public nacGame() {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                checkerBoard[i][j] = ' ';
            }
        }
        stepCount = 0;
    }

    private boolean step(char player, int x, int y) {
        if (x < 0 || x > 2) {
            System.out.println("The input is invalid. ");
            return false;
        }
        if (y < 0 || y > 2) {
            System.out.println("The input is invalid. ");
            return false;
        }
        if (checkerBoard[x][y] != ' ') {
            System.out.println("This position was occupied! ");
            return false;
        }
        checkerBoard[x][y] = player;
        ++stepCount;
        return true;
    }

    private char check() {
        for (int i = 0; i < 3; ++i) {
            if (checkerBoard[i][0] == ' ') {
                continue;
            }
            if (checkerBoard[i][0] == checkerBoard[i][1] && checkerBoard[i][1] == checkerBoard[i][2]) {
                return checkerBoard[i][0];
            }
        }
        for (int j = 0; j < 3; ++j) {
            if (checkerBoard[0][j] == ' ') {
                continue;
            }
            if (checkerBoard[0][j] == checkerBoard[1][j] && checkerBoard[1][j] == checkerBoard[2][j]) {
                return checkerBoard[0][j];
            }
        }
        if (checkerBoard[0][0] != ' ' && checkerBoard[0][0] == checkerBoard[1][1]
                && checkerBoard[1][1] == checkerBoard[2][2]) {
            return checkerBoard[0][0];
        }
        if (checkerBoard[0][2] != ' ' && checkerBoard[0][2] == checkerBoard[1][1]
                && checkerBoard[1][1] == checkerBoard[2][0]) {
            return checkerBoard[0][2];
        }
        if (stepCount == 9) {
            return 'e';
        }
        return ' ';
    }

    private void print() {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                System.out.print(checkerBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    private char changeTurn(char turn) {
        if (turn == 'O') {
            turn = 'X';
        } else {
            turn = 'O';
        }
        return turn;
    }

    public void play() {
        Scanner s = new Scanner(System.in);
        System.out.println("Game started! ");
        char turn = 'O';
        while (check() == ' ') {
            System.out.printf("%c's turn, input your x: \n", turn);
            int xPosition = s.nextInt();
            System.out.println("input your y: ");
            int yPosition = s.nextInt();
            boolean isValid = step(turn, yPosition, xPosition);
            if (isValid) {
                turn = changeTurn(turn);
                print();
            }
        }
        s.close();
        if (check() == 'e') {
            System.out.println("Draw. ");
        } else {
            System.out.printf("%c won! ", check());
        }
    }
}