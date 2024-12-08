
import java.util.Scanner;
import java.io.*;

public class Main {
    static void printBoard(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("["+board[i][j]+"]");
            }
            System.out.println();
        }
    }
    static int checkWinner(){

            for (int i = 0; i < 3; i++) {
                if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != 0) {
                    return board[i][0];
                }
                if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != 0) {
                    return board[0][i];
                }
            }
            if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != 0) {
                return board[0][0];
            }
            if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != 0) {
                return board[0][2];
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == 0) {
                        return -1;
                    }
                }
            }
            return 0; // Draw

    }
    static void tick(){
        Scanner in = new Scanner(System.in);
        int winner=-1;
        board = new int[3][3];
        while(winner==-1){
            printBoard();

            while(true){
                System.out.println("Player 1, enter your move (r, c): ");
                int col = in.nextInt();
                int row = in.nextInt();

                if(board[row][col]==0){
                    board[row][col]=1;
                    break;
                }
                else{
                    System.out.println("Invalid move, try again.");
                }
            }

            winner = checkWinner();
            if (winner == 1) {
                System.out.println("Player 1 wins!");
                return;
            } else if (winner == 2) {
                System.out.println("Player 2 wins!");
                return;
            } else if (winner == 0) {
                System.out.println("It's a draw!");
                return;
            }
            if(winner!=-1){
                break;
            }
            printBoard();
            while(true){
                System.out.println("Player 2, enter your move: ");
                int col = in.nextInt();
                int row = in.nextInt();
                if(board[row][col]==0){
                    board[row][col]=2;
                    break;
                }
                else{
                    System.out.println("Invalid move, try again.");
                }
            }

            winner = checkWinner();

            if (winner == 1) {
                System.out.println("Player 1 wins!");
                return;
            } else if (winner == 2) {
                System.out.println("Player 2 wins!");
                return;
            } else if (winner == 0) {
                System.out.println("It's a draw!");
                return;
            }
        }
    }
    static int [][]board;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("Start a new game? (y/n)");
        String input = in.nextLine();
        if(input.equals("y")){
            tick();
        }
    }
}